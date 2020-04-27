package Visitors;

import AST.*;

import java.util.ArrayList;

public class TreeToGraphGen implements IVisitor {
    private String TreeGenString;
    public String GraphName;
    int nodeNum;

    public TreeToGraphGen(String GraphName){
        this.GraphName = GraphName;
    }

    public <T extends ASTNode> String MakeGraph(T node){
        TreeGenString = "digraph G{\n";

        nodeNum = 0;

        node.accept(this);
        TreeGenString += "}";

        return TreeGenString;
    }

    private <T extends ASTNode> void DefaultConvert(T node){
        int MyNum = nodeNum++;
        String MyName = node.getClass().getSimpleName();
        TreeGenString += "\t" + MyName + MyNum + " [label=\"" + MyName + "\"];\n";

        ConvertChildren(node.children, MyName + MyNum);
    }

    private <T extends ASTNode> void ConvertChildren(ArrayList<T> ChildrenList, String ParentName){
        for (ASTNode child : ChildrenList) {
            if(child != null) {
                int MyNum = nodeNum;
                child.accept(this);

                String ChildName = child.getClass().getSimpleName() + MyNum;
                TreeGenString += "\t" + ParentName + " -> " + ChildName + ";\n";
            }
        }
    }

    @Override
    public void visit(AdditionNode node) {DefaultConvert(node);}

    @Override
    public void visit(AppendStringNode node) {DefaultConvert(node);}

    @Override
    public void visit(AssignmentNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"Assign\\n" + node.identifier;

        if(node.valIndex != null){
            TreeGenString += node.valIndex;
        }

        TreeGenString += " =\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(CodeBlockNode node) {DefaultConvert(node);}

    @Override
    public void visit(DeclarationNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"DclNode\\n= \"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(DivisionNode node) {DefaultConvert(node);}

    @Override
    public void visit(ElseIfStatementNode node) {DefaultConvert(node);}

    @Override
    public void visit(ElseStatementNode node) {DefaultConvert(node);}

    @Override
    public void visit(IdentificationNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"IdNode\\n" + node.name + "\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(IfStatementNode node) {DefaultConvert(node);}

    @Override
    public void visit(InitializationNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"InitNode\\n" + node.identifier + "\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(LogicExpressionNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"LogicExp\\n" + node.operator + "\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(MatrixDeclarationNode node) {DefaultConvert(node); }

    @Override
    public void visit(ModuloNode node) {DefaultConvert(node);}

    @Override
    public void visit(MultiplicationNode node) {DefaultConvert(node);}

    @Override
    public void visit(NumberDeclarationNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"NumDcl\\n" + " =" + "\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(PrintNode node) {DefaultConvert(node);}

    @Override
    public void visit(ProgramNode node) {DefaultConvert(node);}

    @Override
    public void visit(ParenthesesNode node) {DefaultConvert(node);}

    @Override
    public void visit(StringNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"String\\n\\\"" + node.string + "\\\"\"];\n";
        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(StringStatementNode node) {DefaultConvert(node);}

    @Override
    public void visit(SubscriptingAssignmentNode node) {DefaultConvert(node);}

    @Override
    public void visit(SubscriptingNode node) {DefaultConvert(node);}

    @Override
    public void visit(SubtractionNode node) {DefaultConvert(node);}

    @Override
    public void visit(ValueIndexNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"" + "ValIndex\n";

        if(node.indexA != -1){
            TreeGenString += "[" + node.indexA;
            if(node.indexB != -1){
                TreeGenString += "," + node.indexB;
            }
            TreeGenString += "]";
        }

        TreeGenString += "\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(WhileNode node) {DefaultConvert(node);}

    @Override
    public void visit(ReferenceNode node) {DefaultConvert(node);}

    @Override
    public void visit(VectorDeclarationNode node) {DefaultConvert(node);}

    @Override
    public void visit(NumberLiteralNode node) {
        String MyName = node.getClass().getSimpleName() + nodeNum;
        nodeNum++;
        TreeGenString += "\t" + MyName + " [label=\"Num\\n" + node.value + "\"];\n";

        ConvertChildren(node.children, MyName);
    }

    @Override
    public void visit(VectorExpressionNode node) {DefaultConvert(node);}

    @Override
    public void visit(MatrixExpressionNode node) {DefaultConvert(node);}
}
