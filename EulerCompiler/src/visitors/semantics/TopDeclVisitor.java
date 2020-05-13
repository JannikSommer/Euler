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

        expression.accept(new SemanticsVisitor(symbolTable));

        // Check if variable is already declared in symbol table. Otherwise add it.
        if(symbolTable.declaredLocally(id.name)) {
            node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                    " variable "+ "'" + id.name + "'" + " already declared.", node);
            id.attributesRef =  null;
        } else {
            VariableAttributes attr = new VariableAttributes();
            attr.kind = AttributeKind.variableAttributes;                // What type
            attr.variableType = node.type;                               // Set type in attributes
            id.attributesRef = attr;                                     // Link attributes to node
            symbolTable.enterSymbol(id.name, attr);                      // Define in symbol table
        }
    }
}
