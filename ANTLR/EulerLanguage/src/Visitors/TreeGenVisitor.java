package Visitors;

import AST.*;

public class TreeGenVisitor {
    private String TreeGenString = "";
    public String GraphName;

    public TreeGenVisitor(String GraphName){
        this.GraphName = GraphName;
    }

    private <T extends ASTNode> void ConvertTree(T node){
        String MyName = node.getClass().getSimpleName();
        TreeGenString = TreeGenString + "\t" + MyName + " [label=\"" + MyName + "\"];\n";

        for (ASTNode child : node.children) {
            ConvertTree(child);

            String ChildName = child.getClass().getSimpleName();
            TreeGenString = TreeGenString + "\t" + MyName + " -> " + ChildName + ";";
        }
    }

    public <T extends ASTNode> String Graph(T node){
        String Graph = "digraph G{\n";
        ConvertTree(node);
        Graph = Graph + TreeGenString;
        Graph = Graph + "\n}";

        return Graph;
    }
}
