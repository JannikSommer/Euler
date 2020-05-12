import ANTLR.EulerLexer;
import ANTLR.EulerParser;
import AST.ASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.SymbolTable;
import visitors.AstBuilderVisitor;
import visitors.CodeGen.CodeGenVisitor;
import visitors.semantics.ErrorVisitor;
import visitors.semantics.SemanticsVisitor;
import visitors.treeGeneration.TreeToGraphGen;
import static java.lang.Character.isLetter;

import java.io.*;

import java.net.URISyntaxException;
import java.util.*;


public class mainLinux {
    private enum CompilerArgs {
        inputFile,
        outputFile,
        outputFileFlag
    }



    public static void main(String[] args) throws IOException {
        Hashtable<CompilerArgs, String> compilationParameters;

        if(args.length == 0) {
            noArgs();
        } else {
            try {
                compilationParameters = parseArgs(args);
                if(compilationParameters != null) {
                    ASTNode DST = analyzeCode(compilationParameters.get(CompilerArgs.inputFile));
                    if(DST != null) {
                        generateCode(DST, compilationParameters);
                    }
                }
            } catch (Exception e) {

            }
        }
    }

    private static Hashtable<CompilerArgs, String> parseArgs(String[] args) {
        Hashtable<CompilerArgs, String> compilationParameters = new Hashtable<>();
        for (int i = 0; i < args.length; i++) {
            if(!args[i].startsWith("-")) {
                String in = parsePathLinux(args[i]);
                if(!(new File(in).exists())) {
                    // TODO: Add an error message
                    return null;
                } else if(!in.endsWith(".euler")) {
                    // TODO: Add an error message
                    return null;
                } else {
                    compilationParameters.put(CompilerArgs.inputFile, in);
                }
            }
            if(args[i].equals("-o")) {
                compilationParameters.put(CompilerArgs.outputFileFlag, args[i]);
                compilationParameters.put(CompilerArgs.outputFile, parsePathLinux(args[i + 1]));
                break;
            }
        }

        return compilationParameters;
    }

    private static String parsePathLinux(String path) {  // TODO: Doesn't work at all. I think.
        return path;
    }

    private static String parsePath(String path) {  // TODO: Only works for windows. I think.
        if(path.contains(":")) {
            return path.replace('/', '\\');
        } else {
            return System.getProperty("user.dir") + "\\" + path.replace('/', '\\');
        }
    }

    private static ASTNode analyzeCode(String path) {
        CharStream input;
        try {
            input = CharStreams.fromFileName(path);
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        // Syntactical analysis and CST building
        EulerLexer lexer = new EulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EulerParser parser = new EulerParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(parser.program().getText());

        // Conversion from CST to AST
        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visit(tree);

        // Semantic analysis
        SymbolTable symbolTable = new SymbolTable();
        node.accept(new SemanticsVisitor(symbolTable));
        ErrorVisitor eVisitor = new ErrorVisitor();
        node.accept(eVisitor);

        if(eVisitor.hasErrors()) {
            eVisitor.printErrors();
            return null;
        }

        return node;
    }

    private static void generateCode(ASTNode DST, Hashtable<CompilerArgs, String> compilerParams) {
        if(compilerParams.get(CompilerArgs.outputFileFlag) == null) {
            generateCfile(DST, "a");
        } else {
            generateCfile(DST, compilerParams.get(CompilerArgs.outputFile));
        }
    }

    private static void generateCfile(ASTNode DST, String filename) {
        try (PrintWriter out = new PrintWriter(filename + ".c")) {
            out.println(new CodeGenVisitor().GenerateCode(DST));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void noArgs() throws IOException {
        CharStream input = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file;
        String Path;
        boolean FileApproved = false;

        System.out.println("Filepath:\n");
        do {
            Path = reader.readLine();

            if(Path.equals("exit") || Path.equals("EXIT") || Path.equals("Exit")){
                return;
            } else if(Path.equals("help") || Path.equals("HELP") || Path.equals("Help")){
                System.out.println("You must type in the directory of a file of type \".euler\"\ntype \"exit\" to terminate the process");
            }

            //if (isLetter(Path.charAt(0)) && Path.charAt(1) == ':' && (Path.charAt(2) == '/' || Path.charAt(2) == '\\')) {
            //    Path = Path.replace('/', '\\');
            //} else {
            //    Path = System.getProperty("user.dir") + "\\" + Path.replace('/', '\\');
            //}

            file = new File(Path);

            if(!file.exists()){
                System.out.println("File at \"" + Path + "\" did not exist\nPlease try again:\n");
            } else if(!Path.endsWith(".euler")){
                System.out.println("File at \"" + Path + "\" is not of type .euler\nPlease try again:\n");
            } else{
                FileApproved = true;
            }
        } while(!FileApproved);

        try {
            input = CharStreams.fromFileName(Path);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        EulerLexer lexer = new EulerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EulerParser parser = new EulerParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(parser.program().getText());

        AstBuilderVisitor astBuilder = new AstBuilderVisitor();
        ASTNode node = astBuilder.visit(tree);

        SymbolTable symbolTable = new SymbolTable();
        node.accept(new SemanticsVisitor(symbolTable));
        node.accept(new ErrorVisitor());

        CodeGenVisitor _CodeGenVisitor = new CodeGenVisitor();

        String OutputName;
        Boolean OutputNameApproved = false;
        System.out.println("File successfully compiled, please type in name for output file:\n");
        do {
            OutputName = reader.readLine();

            if (OutputName.endsWith(".c")) {
                OutputNameApproved = true;
            } else if(!OutputName.contains(".")){
                OutputNameApproved = true;
                OutputName += ".c";
            } else{
                System.out.println("filename \"" + OutputName + "\" is not valid, please try again");
            }
        } while (!OutputNameApproved);

        try (PrintWriter out = new PrintWriter(OutputName)) {
            out.println(_CodeGenVisitor.GenerateCode(node));
        }
    }

}
