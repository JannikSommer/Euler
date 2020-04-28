package visitors.sematics;

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
            if(!node.type.assignable(expression.type)) {
                // TODO: Add error. Initialization value is wrong type.
            }
        }

        // Check if variable is already declared in symbol table. Otherwise add it.
        if(symbolTable.declaredLocally(((IdentificationNode)node.children.get(0)).name)) {
            // TODO: Add Error. Variable already declared.
            node.type = new ErrorTypeDescriptor("Variable already declared.");
            ((IdentificationNode)node.children.get(0)).attributesRef =  null;
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;                                       // What type
            attr.variableType = ((IdentificationNode)node.children.get(0)).type;                // Set type in attributes
            ((IdentificationNode)node.children.get(0)).attributesRef = attr;                    // Link attributes to node
            symbolTable.enterSymbol(((IdentificationNode)node.children.get(0)).name, attr);     // Define in symbol table
        }
    }
}
