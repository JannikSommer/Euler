package Visitors;

import AST.*;
import symbolTable.*;
import symbolTable.attributes.*;

public class TypeVisitor extends TopDeclVisitor {

    public TypeVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(IdentificationNode node) {
        Attributes attr = symbolTable.retrieveSymbol(node.identification);
        if(attr != null &&)
    }
}
