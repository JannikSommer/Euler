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


public class main {
    private enum CompilerArgs {
        inputFile,
        outputFile,
        outputFileFlag,
        outputCsourceFlag,
        optimizeLevelFlag
    }



    public static void main(String[] args) throws IOException {
        Hashtable<CompilerArgs, String> compilationParameters;

        if(args.length == 0) {
            noArgs();
        } else {
            compilationParameters = parseArgs(args);
            if(compilationParameters != null) {
                ASTNode DST = analyzeCode(compilationParameters.get(CompilerArgs.inputFile));
                generateCode(DST, compilationParameters);
                compileBinary(compilationParameters);
            }
        }
    }

    private static Hashtable<CompilerArgs, String> parseArgs(String[] args) {
        Hashtable<CompilerArgs, String> compilationParameters = new Hashtable<>();
        for (int i = 0; i < args.length; i++) {
            if(!args[i].startsWith("-")) {
                String in = parsePath(args[i]);
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
            if(args[i].equals("-s") || args[i].equals("-S")) {
                compilationParameters.put(CompilerArgs.outputCsourceFlag, args[i]);
            }
            if(args[i].equals("-O1") ||args[i].equals("-O2") || args[i].equals("-O3") || args[i].equals("-Os")) {
                compilationParameters.put(CompilerArgs.optimizeLevelFlag, args[i]);
            }
            if(args[i].equals("-o")) {
                compilationParameters.put(CompilerArgs.outputFileFlag, args[i]);
                compilationParameters.put(CompilerArgs.outputFile, parsePath(args[i + 1]));
                break;
            }
        }

        return compilationParameters;
    }

    private static String parsePath(String path) {  // TODO: Only works for windows
        if(path.contains(":")) {
            return path.replace('\\', '/');
        } else {
            return System.getProperty("user.dir").replace('\\', '/') + "/" + path.replace('\\', '/');
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

    private static void compileBinary(Hashtable<CompilerArgs, String> compilerParams) {

        int index = 0;
        ArrayList<String> process = new ArrayList<String>();
        process.add(getJarFolderPosition() + "/bin/gcc.exe");
        if(compilerParams.get(CompilerArgs.optimizeLevelFlag) != null) {
            process.add(compilerParams.get(CompilerArgs.optimizeLevelFlag));
        }
        process.add("-static");
        process.add("-I" + getJarFolderPosition() + "/include");
        process.add(compilerParams.get(CompilerArgs.inputFile).replace(".euler", "") + ".c");
        process.add(getJarFolderPosition() + "/lib/libgc.a");
        if(compilerParams.get(CompilerArgs.outputFileFlag) != null) {
            process.add(compilerParams.get(CompilerArgs.outputFileFlag));
            process.add(compilerParams.get(CompilerArgs.outputFile));
        }

        try {
            for (String s : process) {
                System.out.println(s);
            }
            new ProcessBuilder(process).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getJarFolderPosition() {

        String jarFile;
        try {
            jarFile = new File(main.class.getProtectionDomain().getCodeSource().getLocation()
                    .toURI()).getPath();
            return jarFile.substring(0, jarFile.lastIndexOf('\\')).replace('\\', '/');
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void keepCcode(Hashtable<CompilerArgs, String> compilerParams) {
        if(compilerParams.get(CompilerArgs.outputCsourceFlag) == null) {
            // Delete c-file
            if(new File(compilerParams.get(CompilerArgs.outputFile) + ".c").delete()) {
                // Deleted succesfully
            }
        } else {
            // Move bswgc to output folder

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

            if (isLetter(Path.charAt(0)) && Path.charAt(1) == ':' && (Path.charAt(2) == '/' || Path.charAt(2) == '\\')) {
                Path = Path.replace('/', '\\');
            } else {
                Path = System.getProperty("user.dir") + "\\" + Path.replace('/', '\\');
            }

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
