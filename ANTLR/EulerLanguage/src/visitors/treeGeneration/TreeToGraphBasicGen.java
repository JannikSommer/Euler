package visitors.treeGeneration;

import AST.ASTNode;

public class TreeToGraphBasicGen {
    private String TreeGenString = "";
    public String GraphName;

    public TreeToGraphBasicGen(String GraphName){
        this.GraphName = GraphName;
    }

    private <T extends ASTNode> void ConvertTree(T node){
        String MyName = node.getClass().getSimpleName();
        TreeGenString = TreeGenString + "\t" + MyName + " [label=\"" + MyName + "\"];\n";

        for (ASTNode child : node.children) {
            if(child != null){
                ConvertTree(child);

                String ChildName = child.getClass().getSimpleName();
                TreeGenString = TreeGenString + "\t" + MyName + " -> " + ChildName + ";";
            }
        }
    }

    public <T extends ASTNode> String MakeGraph(T node){
        String Graph = "digraph G{\n";
        ConvertTree(node);
        Graph = Graph + TreeGenString;
        Graph = Graph + "\n}";

        return Graph;
    }
}
