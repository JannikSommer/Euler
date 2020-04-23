package Visitors;

import symbolTable.SymbolTable;

public class TopDeclVisitor extends SemanticsVisitor {

    public TopDeclVisitor(SymbolTable symTable) {
        super(symTable);
    }
}
