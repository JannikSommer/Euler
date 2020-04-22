package Visitors;
import ANTLR.*;
import AST.*;
import java.util.*;
import java.lang.*;

import java.util.ArrayList;

public class AstBuilderVisitor extends EulerBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(EulerParser.ProgramContext ctx) {
        ASTNode node = new ProgramNode(null);
        for (EulerParser.DclContext dlcs : ctx.dcl()) {
            visitDcl(dlcs, node);
        }
        return node;
    }


    public ASTNode visitDcl(EulerParser.DclContext ctx, ASTNode parent) {
        ASTNode value;
        String id = ctx.ID().getText();

        if (ctx.MATRIX() != null) {
            String mtx = ctx.MATRIX().getText();
            value = new DeclarationNode(parent, id, mtx);
            return value;
        }
        else if (ctx.VECTOR() != null) {
            String vec = ctx.MATRIX().getText();
            value = new DeclarationNode(parent, id, vec);
            return value;
        }
        else if (ctx.expr() != null) {
            value = new AssignmentNode(parent);
            value = visitExpr((ctx.expr()),value);
            return value;
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
    }

    public ASTNode visitPrimeexpr(EulerParser.PrimeexprContext ctx, ASTNode parent) {
        if (ctx.ID().getText() != null) {
            if (ctx.valindex().getText() != null) {
                String id = ctx.ID().getText();
                String valindex = ctx.valindex().getText();
                return new IdentificationNode(parent, id, valindex);
            }
            String id = ctx.ID().getText();
            return new IdentificationNode(parent, id);
        }
        else if (ctx.NUM().getText() != null) {
            return new NumberLiteral(parent, Double.parseDouble(ctx.NUM().getText()));
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