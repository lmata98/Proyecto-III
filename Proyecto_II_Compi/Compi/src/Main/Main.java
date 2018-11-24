package Main;

import lexer.Parser;
import lexer.ParserController;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java_cup.Lexer;
import lexer.ScannerController;
import lexer.TokenDesplegable;


public class Main {
    
    private static ArrayList<TokenDesplegable> tokens;

    public static void main(String[] args) throws FileNotFoundException {
        
        Interfaz console = new Interfaz();
        console.setVisible(true);
        
        
    }
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    
}
