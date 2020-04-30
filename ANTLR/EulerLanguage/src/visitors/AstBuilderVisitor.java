package visitors;
import ANTLR.*;
import AST.*;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;

import java.lang.*;

public class AstBuilderVisitor extends EulerBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(EulerParser.ProgramContext ctx) {
        ASTNode node = new ProgramNode(null);
        CodeBlockNode stmtNode = new CodeBlockNode(node);
        node.children.add(stmtNode);
        ctx.stmt().forEach(child -> {
            stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, stmtNode));
        });
        return node;
    }

    public ASTNode visitStmt(EulerParser.StmtContext ctx, ASTNode parent) {
        try {
            String name = ctx.children.get(0).getClass().getSimpleName();
            switch (name) {
                case "ExprContext":
                    return visitExpr((EulerParser.ExprContext) ctx.children.get(0), parent);
                case "DclContext":
                    return visitDcl((EulerParser.DclContext) ctx.children.get(0), parent);
                case "IfstmtContext":
                    return visitIfstmt((EulerParser.IfstmtContext) ctx.children.get(0), parent);
                case "WhilestmtContext":
                    return visitWhilestmt((EulerParser.WhilestmtContext) ctx.children.get(0), parent);
                case "AssignstmtContext":
                    return visitAssignstmt((EulerParser.AssignstmtContext) ctx.children.get(0), parent);
                case "PrintstmtContext":
                    return visitPrintstmt((EulerParser.PrintstmtContext) ctx.children.get(0), parent);
                default:
                    return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
            }
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitPrintstmt(EulerParser.PrintstmtContext ctx, ASTNode parent) {
        try {
            PrintNode node = new PrintNode(parent);
            ctx.children.forEach(child -> {
                if (child.getClass().getSimpleName().equals("StringstmtContext")) {
                    node.children.add(visitStringstmt((EulerParser.StringstmtContext) child, parent));
                }
            });
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid print-statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitStringstmt(EulerParser.StringstmtContext ctx, ASTNode parent) {
        try {
            if (ctx.ID() != null) {
                if (ctx.valindex() != null) {
                    return new ErrorNode(parent, "Invalid string at line" + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
                }
                return new IdentificationNode(parent, ctx.ID().getText());
            } else if (ctx.NUM() != null) {
                return new NumberLiteralNode(parent, Double.parseDouble(ctx.NUM().getText()));
            } else if (ctx.STRING() != null) {
                return new StringNode(parent, ctx.STRING().getText());
            }
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid string at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
        return new ErrorNode(parent, "Invalid string at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
    }

    public ASTNode visitAssignstmt(EulerParser.AssignstmtContext ctx, ASTNode parent) {
        try {
            String id = ctx.ID().getText();
            if (ctx.valindex() != null) {
                ASTNode subsAssNode = new SubscriptingAssignmentNode(parent);
                String str = ctx.valindex().getText();
                subsAssNode.children.add(new IdentificationNode(subsAssNode, ctx.ID().getText()));
                subsAssNode.children.add(visitExpr(ctx.expr(), subsAssNode));
                subsAssNode.children.add(new SubscriptingNode(subsAssNode, str));
                return subsAssNode;
            } else if (ctx.MATRIX() != null) {
                String mtx = ctx.MATRIX().getText();
                ASTNode mtxassign = new AssignmentNode(parent);
                ASTNode node = new MatrixExpressionNode(mtxassign, mtx);
                mtxassign.children.add(new IdentificationNode(mtxassign, id));
                mtxassign.children.add(node);
                return mtxassign;
            } else if (ctx.VECTOR() != null) {
                String vec = ctx.VECTOR().getText();
                ASTNode vecNode = new AssignmentNode(parent);
                ASTNode node = new VectorExpressionNode(vecNode, vec);
                vecNode.children.add(new IdentificationNode(vecNode, id));
                vecNode.children.add(node);
                return vecNode;
            } else {
                AssignmentNode node = new AssignmentNode(parent, ctx.ID().getText());
                ASTNode child = visitExpr(ctx.expr(), node);
                node.children.add(child);
                return node;
            }
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid assignment of variable " + ctx.ID().getText() + "at line " +
                                              ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitWhilestmt(EulerParser.WhilestmtContext ctx, ASTNode parent) {
        try {
            WhileNode node = new WhileNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            node.children.add(visitLogstmt(ctx.logstmt(), node));
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
            });
            node.children.add(stmtNode);
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid while-statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitLogstmt(EulerParser.LogstmtContext ctx, ASTNode parent) {
        try {
            LogicExpressionNode node = new LogicExpressionNode(parent);
            node.operator = ctx.logop().getText();
            ctx.addexpr().forEach(child -> {
                node.children.add(visitAddexpr((EulerParser.AddexprContext) child, node));
            });
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid boolean statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitIfstmt(EulerParser.IfstmtContext ctx, ASTNode parent) {
        try {
            IfStatementNode node = new IfStatementNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            node.children.add(visitLogstmt(ctx.logstmt(), node));
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
            });
            node.children.add(stmtNode);
            if (ctx.elsestmts() != null) {
                node.children.add(visitElsestmts(ctx.elsestmts(), node));
            }
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid if-statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitElsestmts(EulerParser.ElsestmtsContext ctx, ASTNode parent) {
        try {
            ElseStatementNode node = new ElseStatementNode(parent);
            ctx.children.forEach(child -> {
                if (child.getClass().getSimpleName().equals("ElseifstmtsContext")) {
                    node.children.add(visitElseifstmts((EulerParser.ElseifstmtsContext) child, node));
                } else if (child.getClass().getSimpleName().equals("StmtContext")) {
                    CodeBlockNode stmtNode = new CodeBlockNode(node);
                    stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
                    node.children.add(stmtNode);
                }
            });
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid else-statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitElseifstmts(EulerParser.ElseifstmtsContext ctx, ASTNode parent) {
        try {
            ElseIfStatementNode node = new ElseIfStatementNode(parent);
            CodeBlockNode stmtNode = new CodeBlockNode(node);
            node.children.add(visitLogstmt(ctx.logstmt(), node));
            ctx.stmt().forEach(child -> {
                stmtNode.children.add(visitStmt((EulerParser.StmtContext) child, node));
            });
            node.children.add(stmtNode);
            return node;
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid else-if-statement at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }


    public ASTNode visitDcl(EulerParser.DclContext ctx, ASTNode parent) {
        try {
            String id = ctx.ID().getText();
            if (ctx.MATRIX() != null) {
                String mtx = ctx.MATRIX().getText();
                MatrixDeclarationNode mtxdcl = new MatrixDeclarationNode(parent);
                ASTNode node = new MatrixExpressionNode(mtxdcl, mtx);
                mtxdcl.children.add(new IdentificationNode(mtxdcl, id));
                mtxdcl.children.add(node);
                return mtxdcl;
            } else if (ctx.VECTOR() != null) {
                String vec = ctx.VECTOR().getText();
                VectorDeclarationNode vecNode = new VectorDeclarationNode(parent);
                ASTNode node = new VectorExpressionNode(vecNode, vec);
                vecNode.children.add(new IdentificationNode(vecNode, id));
                vecNode.children.add(node);
                return vecNode;
            } else if (ctx.expr() != null) {
                NumberDeclarationNode node = new NumberDeclarationNode(parent);
                ASTNode child = visitExpr((ctx.expr()), node);
                node.children.add(new IdentificationNode(node, id));
                node.children.add(child);
                return node;
            } else return new InitializationNode(parent, id);
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid declaration of variable " + ctx.ID().getText() + "at line " +
                                              ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }


    public ASTNode visitExpr(EulerParser.ExprContext ctx, ASTNode parent) {
        try {
            return visitAddexpr(ctx.addexpr(), parent);
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid expression at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitAddexpr(EulerParser.AddexprContext ctx, ASTNode parent) {
        ASTNode left, right;
        try {
            if (ctx.op == null) {
                return visitMultiexpr(ctx.multiexpr(), parent);
            } else if (ctx.op.getText().contains("+")) {
                left = visitMultiexpr(ctx.multiexpr(), parent);
                right = visitAddexpr(ctx.addexpr(), parent);
                return new AdditionNode(parent, left, right);
            } else if (ctx.op.getText().contains("-")) {
                left = visitMultiexpr(ctx.multiexpr(), parent);
                right = visitAddexpr(ctx.addexpr(), parent);
                return new SubtractionNode(parent, left, right);
            } else return new ErrorNode(parent, "Invalid operator at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid expression at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitMultiexpr(EulerParser.MultiexprContext ctx, ASTNode parent) {
        ASTNode left, right;
        try {
            if (ctx.op == null) {
                return visitPrimeexpr(ctx.primeexpr(), parent);
            } else if (ctx.op.getText().contains("*")) {
                left = visitPrimeexpr(ctx.primeexpr(), parent);
                right = visitMultiexpr(ctx.multiexpr(), parent);
                return new MultiplicationNode(parent, left, right);
            } else if (ctx.op.getText().contains("/")) {
                left = visitPrimeexpr(ctx.primeexpr(), parent);
                right = visitMultiexpr(ctx.multiexpr(), parent);
                return new DivisionNode(parent, left, right);
            } else if (ctx.op.getText().contains("%")) {
                left = visitPrimeexpr(ctx.primeexpr(), parent);
                right = visitMultiexpr(ctx.multiexpr(), parent);
                return new ModuloNode(parent, left, right);
            } else return new ErrorNode(parent, "Invalid operator at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid expression at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }

    public ASTNode visitPrimeexpr(EulerParser.PrimeexprContext ctx, ASTNode parent) {
        try {
            if (ctx.ID() != null) {
                if (ctx.valindex() != null) {
                    ASTNode subsAssNode = new SubscriptingReferenceNode(parent);
                    String str = ctx.valindex().getText();
                    subsAssNode.children.add(new IdentificationNode(subsAssNode, ctx.ID().getText()));
                    subsAssNode.children.add(new SubscriptingNode(subsAssNode, str));
                    return subsAssNode;
                }
                String id = ctx.ID().getText();
                return new IdentificationNode(parent, id);
            } else if (ctx.NUM() != null) {
                return new NumberLiteralNode(parent, Double.parseDouble(ctx.NUM().getText()));
            } else if (ctx.LPAREN() != null) {
                return visitAddexpr(ctx.addexpr(), parent);
            } else return new ErrorNode(parent, "Invalid operator at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        } catch (NullPointerException e) {
            return new ErrorNode(parent, "Invalid expression at line " + ctx.exception.getOffendingToken().getLine() + ":" + ctx.exception.getOffendingToken().getCharPositionInLine());
        }
    }
}