package visitors.semantics;

import AST.*;
import symbolTable.SymbolTable;
import symbolTable.attributes.*;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;
import symbolTable.typeDescriptors.TypeDescriptorKind;

public class TopDeclVisitor extends SemanticsVisitor {

    public TopDeclVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(DeclarationNode node) {
        IdentificationNode id = (IdentificationNode)node.children.get(0);
        ASTNode expression = node.children.get(1);

        // Do Semantic-analysis on expression
        expression.accept(this);

        // Set declaration type to expression-node type
        node.type = expression.type; // TODO: Do some type checking with the id node

        // Check if initialization value is the right type
        if(expression != null) {
            expression.accept(new SemanticsVisitor(symbolTable));
            if(expression.type.kind == TypeDescriptorKind.error) {
                //node.type = expression.type;
            } else if(!node.type.isAssignable(expression.type)) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                        "initialization for "+ "'" + id.name + "'" + " value is wrong type.", node);
            }
        }

        // Check if variable is already declared in symbol table. Otherwise add it.
        if(symbolTable.declaredLocally(id.name)) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                    " variable "+ "'" + id.name + "'" + " already declared.", node);
            id.attributesRef =  null;
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;                                       // What type
            attr.variableType = node.type;                                                      // Set type in attributes
            id.attributesRef = attr;                                                            // Link attributes to node
            symbolTable.enterSymbol(id.name, attr);                                             // Define in symbol table
        }
    }
}
