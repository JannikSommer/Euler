package visitors.semantics;

import AST.*;
import symbolTable.SymbolTable;
import symbolTable.attributes.AttributeKind;
import symbolTable.typeDescriptors.ErrorTypeDescriptor;

public class LHSSemanticsVisitor extends SemanticsVisitor {

    public LHSSemanticsVisitor(SymbolTable symTable) {
        super(symTable);
    }

    @Override
    public void visit(IdentificationNode node) {
        node.accept(new SemanticsVisitor(symbolTable));
        if(node.attributesRef.kind != AttributeKind.variableAttributes) {
            // TODO: Add error. Variable is not assignable.
            node.type = new ErrorTypeDescriptor("Variable is not assignable.");
            node. attributesRef = null;
        }
    }
}
