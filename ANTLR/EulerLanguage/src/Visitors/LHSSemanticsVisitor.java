package Visitors;

import AST.*;
import symbolTable.SymbolTable;

public class LHSSemanticsVisitor extends SemanticsVisitor {

    public LHSSemanticsVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(IdentificationNode node) {
        // Is it assignable
    }

    @Override
    public void visit(SubscriptingNode node) {

    }
}
