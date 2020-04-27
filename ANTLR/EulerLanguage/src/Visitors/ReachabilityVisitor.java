package Visitors;

import symbolTable.SymbolTable;

public class ReachabilityVisitor extends SemanticsVisitor {
    public ReachabilityVisitor(SymbolTable symTable) {
        super(symTable);
    }


}
