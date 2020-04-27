package Visitors;

import AST.*;
import symbolTable.*;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.*;

public class TypeVisitor extends TopDeclVisitor {

    public TypeVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(IdentificationNode node) {
        Attributes attr = symbolTable.retrieveSymbol(((IdentificationNode)node.children.get(0)).name);
        if(attr != null && attr.kind == AttributeKind.typeAttributes) {
            node.type = ((TypeAttributes)attr).thisType;
            node.attributesRef = attr;
        } else {
            // TODO: Add error. Not type name
            node.type = new ErrorTypeDescriptor("Wrong type name.");
            node.attributesRef = null;
        }
    }

     */
}
