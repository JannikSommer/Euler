package AST;

import symbolTable.typeDescriptors.TypeDescriptorKind;
import symbolTable.typeDescriptors.VectorTypeDescriptor;
import visitors.IVisitor;
import java.lang.*;

public class VectorExpressionNode extends ASTNode {

    public VectorExpressionNode(ASTNode parentNode, String vecExpr) {
        super(parentNode);
        getVectorElements(vecExpr);
        parent.type = type;
    }

    private void getVectorElements(String vecExpr) {
        String delimiters = "[<,>\r\n\t ]+";
        String[] tokens = vecExpr.split(delimiters);
        for (String str : tokens) {
            try {
                double number = Double.parseDouble(str);
                this.children.add(new NumberLiteralNode(this, number));
            }
            catch (NumberFormatException e) {
                if (!str.equals("")) {
                    this.children.add(new ReferenceNode(this, str));
                }
            }
        }

        type = new VectorTypeDescriptor(children.size());
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
