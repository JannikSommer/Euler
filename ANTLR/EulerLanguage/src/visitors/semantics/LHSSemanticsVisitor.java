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
        if(node.attributesRef != null) {
            if(node.attributesRef.kind != AttributeKind.variableAttributes) {
                node.type = new ErrorTypeDescriptor("at line " + node.lineNumber + ":" + node.charPosition + ", " +
                        "" + " variable '" + node.name + "' is not assignable.", node);
                node. attributesRef = null;
            }
        }
    }
}
