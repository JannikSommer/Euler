package visitors.treeGeneration;

import AST.ASTNode;
import org.antlr.v4.misc.Graph;

public class TreeToGraphBasicGen {
    private String TreeGenString = "";
    public String GraphName;
    private int NodeNum;

    public TreeToGraphBasicGen(String GraphName){
        this.GraphName = GraphName;
    }

    private <T extends ASTNode> void ConvertTree(T node){
        String MyName = node.getClass().getSimpleName();
        TreeGenString = TreeGenString + "\t" + MyName + NodeNum + " [label=\"" + MyName + "\"];\n";
        MyName += NodeNum++;

        for (ASTNode child : node.children) {
            if(child != null){
                int ChildNum = NodeNum;
                ConvertTree(child);

                String ChildName = child.getClass().getSimpleName();
                TreeGenString = TreeGenString + "\t" + MyName + " -> " + ChildName + ChildNum + ";";
            }
        }
    }

    public <T extends ASTNode> String MakeGraph(T node){
        NodeNum = 0;

        String Graph = "digraph G{\n";
        ConvertTree(node);
        Graph = Graph + TreeGenString;
        Graph = Graph + "\n}";

        return Graph;
    }
}
