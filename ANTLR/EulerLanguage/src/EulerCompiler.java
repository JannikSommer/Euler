import ANTLR.*;
import AST.ASTNode;
import Visitors.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Paths;

public class EulerCompiler {

    public static void main(String[] args) {
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("C:/Users/janni/Documents/GitHub/P4---cEX/ANTLR/EulerLanguage/src/kurt.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        EulerLexer lexer = new EulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EulerParser parser = new EulerParser(tokens);
        // ParseTree tree = parser.program();

        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visitProgram(parser.program());

        //System.out.println(tree.getChild(1).getText());
    }
}
