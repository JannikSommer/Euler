package Visitors.semantics;

import AST.*;
import symbolTable.SymbolTable;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;

public class TopDeclVisitor extends SemanticsVisitor {

    public TopDeclVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(DeclarationNode node) {
        // Check if initialization value is the right type
        ASTNode expression = node.children.get(1);
        if(expression != null) {
            expression.accept(new SemanticsVisitor(symbolTable));
            if(!node.type.isCompatible(expression.type)) {
                node.type = new ErrorTypeDescriptor("Initialization value is wrong type.", node);
            }
        }

        // Check if variable is already declared in symbol table. Otherwise add it.
        if(symbolTable.declaredLocally(((IdentificationNode)node.children.get(0)).name)) {
            node.type = new ErrorTypeDescriptor("Variable already declared.", node);
            ((IdentificationNode)node.children.get(0)).attributesRef =  null;
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;                                       // What type
            attr.variableType = node.type;                                                      // Set type in attributes
            ((IdentificationNode)node.children.get(0)).attributesRef = attr;                    // Link attributes to node
            symbolTable.enterSymbol(((IdentificationNode)node.children.get(0)).name, attr);     // Define in symbol table
        }
    }
}
