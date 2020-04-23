package Visitors;

import AST.*;
import symbolTable.SymbolTable;
import symbolTable.attributes.AttributeKind;
import symbolTable.attributes.VariableAttributes;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;

public class TopDeclVisitor extends SemanticsVisitor {

    public TopDeclVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(DeclarationNode node) {
        if(symbolTable.declaredLocally(node.identifier)) {
            // TODO: Add Error. Variable already declared.
            node.type = new ErrorTypeDescriptor();
            node.attributesRef =  null;
        } else {
            node.type = node.getDclType();
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;
            attr.variableType = node.type;
            node.attributesRef = attr;
            symbolTable.enterSymbol(node.identifier, attr);
        }
    }
}
