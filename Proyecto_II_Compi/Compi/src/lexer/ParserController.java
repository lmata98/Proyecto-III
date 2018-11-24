package lexer;

import Main.Interfaz;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import lexer.*;


public class ParserController {
    
    private String path;
    private Interfaz console;
    
    public ParserController(String pPath, Interfaz console){ 
        path = pPath;
        this.console = console;
        
    }
    
    public void generarCup(){
        System.out.println("Generando pararser...");
        String opciones[] = {"-destdir","src\\lexer",
                "-parser","Parser",
                "src\\lexer\\Parser.cup"
        };         
        try{
            java_cup.Main.main(opciones);   
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }    
    }
    
    public void parsear(){
        ArrayList<String> errores;
        try{
            Reader reader = new BufferedReader(new FileReader(path));
            Lexer lexer = new Lexer(reader);
            Parser parser = new Parser(lexer);
            parser.parse();
            console.imprimir(lexer.toStringErrores());
            console.imprimir(parser.toStringErrores());
     
            /*System.out.println("\nLista de errores presentes: ");
            console.imprimir("Lista de errores presentes");*/
           
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Hubo excepcion");
        }
    }
}
