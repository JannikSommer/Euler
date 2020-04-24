package Visitors;
import ANTLR.*;
import AST.*;
import java.lang.*;

import java.util.ArrayList;

public class AstBuilderVisitor extends EulerBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(EulerParser.ProgramContext ctx) {
        ASTNode node = new ProgramNode(null);
        StatementBlockNode stmtNode = new StatementBlockNode(node);
        node.children.add(stmtNode);
        ctx.stmt().forEach(child -> {
            stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, stmtNode));
        });
        return node;
    }

    public ASTNode visitStmt(EulerParser.StmtContext ctx, ASTNode parent) {
        String name = ctx.children.get(0).getClass().getSimpleName();
        if (name.equals("ExprContext")) {
            return visitExpr((EulerParser.ExprContext) ctx.children.get(0), parent);
        }
        else if (name.equals("DclContext")) {
            return visitDcl((EulerParser.DclContext) ctx.children.get(0), parent);
        }
        else if (name.equals("IfstmtContext")) {
            return visitIfstmt((EulerParser.IfstmtContext) ctx.children.get(0), parent);
        }
        else if (name.equals("WhilestmtContext")) {
            return visitWhilestmt((EulerParser.WhilestmtContext) ctx.children.get(0), parent);
        }
        else if (name.equals("AssignstmtContext")) {
            return visitAssignstmt((EulerParser.AssignstmtContext) ctx.children.get(0), parent);
        }
        else if (name.equals("PrintstmtContext")) {
            return visitPrintstmt((EulerParser.PrintstmtContext) ctx.children.get(0), parent);
        }
        else {
            // throw shit
            return null;
        }
    }

    public ASTNode visitPrintstmt(EulerParser.PrintstmtContext ctx, ASTNode parent) {
        PrintNode node = new PrintNode(parent);
        ctx.children.forEach(child -> {
            if (child.getClass().getSimpleName().equals("StringstmtContext")) {
                node.children.add(visitStringstmt((EulerParser.StringstmtContext) child, parent));
            }
        });
        return node;
    }

    public ASTNode visitStringstmt(EulerParser.StringstmtContext ctx, ASTNode parent) {
        if (ctx.ID() != null ) {
            if (ctx.valindex() != null) {
                return new IdentificationNode(parent, ctx.ID().getText(), ctx.valindex().getText());
            }
            return new IdentificationNode(parent, ctx.ID().getText());
        }
        else if (ctx.NUM() != null) {
            return new NumberLiteralNode(parent, Double.parseDouble(ctx.NUM().getText()));
        } else if (ctx.STRING() != null) {
            return new StringNode(parent, ctx.STRING().getText());
        }
        return null;
    }

    public ASTNode visitAssignstmt(EulerParser.AssignstmtContext ctx, ASTNode parent) {
        if (ctx.valindex() != null) {
            ASTNode subsAssNode = new SubscribtingAssignmentNode(parent);
            String str = ctx.valindex().getText();
            subsAssNode.children.add(new IdentificationNode(subsAssNode, ctx.ID().getText()));
            subsAssNode.children.add(new SubscribtingNode(subsAssNode, str));
            return subsAssNode;
        } else {
            AssignmentNode node = new AssignmentNode(parent);
            node.identifier = ctx.ID().getText();
            ASTNode child = visitExpr(ctx.expr(), node);
            node.children.add(child);
            return node;
        }
    }

    public ASTNode visitWhilestmt(EulerParser.WhilestmtContext ctx, ASTNode parent) {
        WhileNode node = new WhileNode(parent);
        StatementBlockNode stmtNode = new StatementBlockNode(node);
        node.children.add(visitLogstmt(ctx.logstmt(), node));
        ctx.stmt().forEach(child -> {
            stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
        });
        node.children.add(stmtNode);
        return node;
    }

    public ASTNode visitLogstmt(EulerParser.LogstmtContext ctx, ASTNode parent) {
        LogicExpressionNode node = new LogicExpressionNode(parent);
        node.operator = ctx.logop().getText();
        node.children.add(visitAddexpr(ctx.addexpr(0), node));
        node.children.add(visitAddexpr(ctx.addexpr(1), node));
        return node;
    }

    public ASTNode visitIfstmt(EulerParser.IfstmtContext ctx, ASTNode parent) {
        IfStatementNode node = new IfStatementNode(parent);
        StatementBlockNode stmtNode = new StatementBlockNode(node) ;
        node.children.add(visitLogstmt(ctx.logstmt(), node));
        ctx.stmt().forEach(child -> {
            stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
        });
        node.children.add(stmtNode);
        if (ctx.elsestmts() != null) {
            node.children.add(visitElsestmts(ctx.elsestmts(), node));
        }
        return node;
    }



    public ASTNode visitElsestmts(EulerParser.ElsestmtsContext ctx, ASTNode parent) {
        ElseStatementNode node = new ElseStatementNode(parent);
        ctx.children.forEach(child -> {
            if (child.getClass().getSimpleName().equals("ElseifstmtsContext")) {
                node.children.add(visitElseifstmts((EulerParser.ElseifstmtsContext) child, node));
            }
            else if (child.getClass().getSimpleName().equals("StmtContext")) {
                StatementBlockNode stmtNode = new StatementBlockNode(node);
                stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
                node.children.add(stmtNode);
            }
        });
        return node;
    }

    public ASTNode visitElseifstmts(EulerParser.ElseifstmtsContext ctx, ASTNode parent) {
        ElseIfStatementNode node = new ElseIfStatementNode(parent);
        StatementBlockNode stmtNode = new StatementBlockNode(node);
        node.children.add(visitLogstmt(ctx.logstmt(), node));
        ctx.stmt().forEach(child -> {
            stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
        });
        node.children.add(stmtNode);
        return node;
    }


    public ASTNode visitDcl(EulerParser.DclContext ctx, ASTNode parent) {
        ASTNode value;
        String id = ctx.ID().getText();
        if (ctx.MATRIX() != null) {
            String mtx = ctx.MATRIX().getText();
            MatrixDeclarationNode mtxdcl = new MatrixDeclarationNode(parent);
            ASTNode node = new MatrixExpressionNode(mtxdcl, mtx);
            mtxdcl.identifier = id;
            mtxdcl.children.add(node);
            return mtxdcl;
        }
        else if (ctx.VECTOR() != null) {
            String vec = ctx.VECTOR().getText();
            VectorDeclarationNode vecNode = new VectorDeclarationNode(parent);
            ASTNode node = new VectorExpressionNode(vecNode, vec);
            vecNode.identifier = id;
            vecNode.children.add(node);
            return vecNode;
        }
        else if (ctx.expr() != null) {
            NumberDeclarationNode node = new NumberDeclarationNode(parent);
            ASTNode child = visitExpr((ctx.expr()));
            node.children.add(child);
            node.identifier = id;
            return node;
        }
        else {
            return new InitializationNode(parent, id);
        }
    }


    public ASTNode visitExpr(EulerParser.ExprContext ctx, ASTNode parent) {
        return visitAddexpr(ctx.addexpr(), parent);
    }

    public ASTNode visitAddexpr(EulerParser.AddexprContext ctx, ASTNode parent) {
        ASTNode left, right;
        if (ctx.op.getText() == null) {
            return visitMultiexpr(ctx.multiexpr(), parent);
        }
        else if (ctx.op.getText().contains("+")) {
            left = visitMultiexpr(ctx.multiexpr(), parent);
            right = visitAddexpr(ctx.addexpr(), parent);
            return new AdditionNode(parent, left, right);
        }
        else if (ctx.op.getText().contains("-")) {
            left = visitMultiexpr(ctx.multiexpr(), parent);
            right = visitAddexpr(ctx.addexpr(), parent);
            return new SubtractionNode(parent, left, right);
        }
        else return null;
    }

    public ASTNode visitMultiexpr(EulerParser.MultiexprContext ctx, ASTNode parent) {
        ASTNode left, right;
        if (ctx.op.getText() == null) {
            return visitPrimeexpr(ctx.primeexpr(), parent);
        }
        else if (ctx.op.getText().contains("*")) {
            left = visitPrimeexpr(ctx.primeexpr(), parent);
            right = visitMultiexpr(ctx.multiexpr(), parent);
            return new MultiplicationNode(parent, left, right);
        }
        else if (ctx.op.getText().contains("/")) {
            left = visitPrimeexpr(ctx.primeexpr(), parent);
            right = visitMultiexpr(ctx.multiexpr(), parent);
            return new DivisionNode(parent, left, right);
        }
        else if (ctx.op.getText().contains("%")) {
            left = visitPrimeexpr(ctx.primeexpr(), parent);
            right = visitMultiexpr(ctx.multiexpr(), parent);
            return new ModuloNode(parent, left, right);
        }
        else return null;
    }

    public ASTNode visitPrimeexpr(EulerParser.PrimeexprContext ctx, ASTNode parent) {
        if (ctx.ID().getText() != null) {
            if (ctx.valindex().getText() != null) {
                ASTNode subsAssNode = new SubscribtingAssignmentNode(parent);
                String str = ctx.valindex().getText();
                subsAssNode.children.add(new IdentificationNode(subsAssNode, ctx.ID().getText()));
                subsAssNode.children.add(new SubscribtingNode(subsAssNode, str));
                return subsAssNode;
            }
            String id = ctx.ID().getText();
            return new IdentificationNode(parent, id);
        }
        else if (ctx.NUM().getText() != null) {
            return new NumberLiteralNode(parent, Double.parseDouble(ctx.NUM().getText()));
        }
        else if (ctx.LPAREN().getText() != null) {
            return visitAddexpr(ctx.addexpr(), parent);
        }
        else {
            // Throw shit
        }
        return null;
    }
}