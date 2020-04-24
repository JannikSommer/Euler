package Visitors;

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
        ASTNode value = node.children.get(0);
        if(value != null) {
            value.accept(new SemanticsVisitor(symbolTable));
            if(!node.type.assignable(value.type)) {
                // TODO: Add error. Initialization value is wrong type.
            }
        }

        // Check if variable is already declared in symbol table. Otherwise add it.
        if(symbolTable.declaredLocally(node.identifier)) {
            // TODO: Add Error. Variable already declared.
            node.type = new ErrorTypeDescriptor("Variable already declared.");
            node.attributesRef =  null;
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;
            attr.variableType = node.type;
            node.attributesRef = attr;
            symbolTable.enterSymbol(node.identifier, attr);
        }
    }
}
