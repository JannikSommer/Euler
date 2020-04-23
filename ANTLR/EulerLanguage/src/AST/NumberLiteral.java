package AST;


import Visitors.IVisitor;

public class NumberLiteral extends ASTNode {
    public double value;

    public NumberLiteral(ASTNode parent, double value) {
        super(parent);
        this.value = value;
    }



    @Override
    public void accept(IVisitor visitor) {

    }
}
