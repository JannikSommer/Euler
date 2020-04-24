import ANTLR.EulerLexer;
import ANTLR.EulerParser;
import AST.ASTNode;
import Visitors.AstBuilderVisitor;
import Visitors.TreeGenVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import java.io.PrintWriter;

public class GraphGen {
    public static void main(String[] args) throws IOException {
        CharStream input = null;
        String InputFile = System.getProperty("user.dir") + "/EulerLanguage/src/kurt.txt";
        try {
            input = CharStreams.fromFileName(InputFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        EulerLexer lexer = new EulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EulerParser parser = new EulerParser(tokens);
        // ParseTree tree = parser.program();
        System.out.println(parser.program().getText());

        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visitProgram(parser.program());

        TreeGenVisitor TreeGenerator = new TreeGenVisitor("Graph");
        String Tree = TreeGenerator.Graph(node);

        System.out.println("\n" + Tree);

        try (PrintWriter out = new PrintWriter(TreeGenerator.GraphName + ".dot")) {
            out.println(Tree);
        }
    }
}
