package lexer;


import java_cup.runtime.Symbol;
import Main.Interfaz;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import lexer.TokenDesplegable;


public class ScannerController {
    
    private ArrayList<TokenDesplegable> tokens;
    private ArrayList<String> errores;
    private String path;
    private Interfaz console;
    
    public ScannerController(String pPath, Interfaz console){
        path = pPath;
        this.console = console; 
        tokens = new ArrayList<TokenDesplegable>();
        errores = new ArrayList<String>();
    }
    
    public void Scan() throws IOException{
        Reader reader = new BufferedReader(new FileReader(path));
        Lexer lexer = new Lexer(reader);
        Symbol currentToken;
        while(true){
            currentToken = lexer.next_token();
            if (currentToken.sym == 0){
                //se llega al final del archivo.
                break;
            }
            else{
                switch(currentToken.sym){
                    case 1:
                        
                        String error = "Error : ";// + lexer.lexeme + ". En la línea: " + (lexer.getLine()+1);
                        errores.add(error);
                        break;
                    default:
                       
                }
            }
        }
        Collections.sort(tokens);
        
        listaErrores();
        listaTokens();
    }
    
    private void listaTokens(){
        System.out.println("Tokens presentes"+"\n");
        console.imprimir("Tokens presentes");
        Collections.sort(tokens); 
        
        for(TokenDesplegable token: tokens)
        {
            System.out.println(token.toString());
            console.imprimir(token.toString());
        }
    }
    
    private void listaErrores(){
        console.imprimir("Errores léxicos:");
        for (String error: errores) {
            console.imprimir(error );
            System.out.println(error);
        }
    }
    
    private void createToken(String pNombre, String pTipo, int pNumeroLinea){
        
        TokenDesplegable tokenActual = verificarToken(pNombre);
        
        if(tokenActual != null){
            tokenActual.crearLinea(pNumeroLinea);
        } else {
            tokenActual = new TokenDesplegable(pNombre, pTipo);
            tokenActual.crearLinea(pNumeroLinea);
            tokens.add(tokenActual);
        }
        
    }
    
    private TokenDesplegable verificarToken(String pToken){
        
        for(TokenDesplegable nuevoToken: tokens ){
            if(nuevoToken.existe(pToken))
                return nuevoToken;
        }
        return null;
    }
}
