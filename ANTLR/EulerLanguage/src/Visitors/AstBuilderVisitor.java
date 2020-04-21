package Visitors;
import ANTLR.*;
import AST.*;

import java.util.ArrayList;

import static ANTLR.EulerLexer.*;

public class AstBuilderVisitor extends EulerBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(EulerParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public ASTNode visitDcl(EulerParser.DclContext ctx) {

        return super.visitDcl(ctx);
    }
}