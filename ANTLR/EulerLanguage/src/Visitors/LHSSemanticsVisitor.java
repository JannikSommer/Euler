package Visitors;

import AST.IdentificationNode;
import symbolTable.SymbolTable;

public class LHSSemanticsVisitor extends SemanticsVisitor {

    public LHSSemanticsVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(IdentificationNode node) {
        // Is it assignable
    }
}
