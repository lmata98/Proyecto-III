package lexer;

import java.util.ArrayList;

public class TokenDesplegable implements Comparable<TokenDesplegable> {
    
    public String nombre;
    private String tipo;
    private ArrayList<Linea> lineas;
    
    public TokenDesplegable(String pNombre, String pTipo){
        
        nombre = pNombre;
        tipo = pTipo;
        lineas = new ArrayList<Linea>();
        
    }
    
    private Linea verificarLinea(int pNumeroLinea){
        
        for(Linea nLinea: lineas){
            if(nLinea.compareLinea(pNumeroLinea))
                return nLinea;
        }
        return null;
        
    }
    
    public void crearLinea(int pNumeroLinea){
        
        Linea lineaActual = verificarLinea(pNumeroLinea);
        
        if(lineaActual != null){
            lineaActual.incApariciones();
        }else{
            lineaActual = new Linea(pNumeroLinea);
            lineas.add(lineaActual);
        }
    }
    
    private String printLineas(){
        
        String resultado = "";
        for(Linea nLinea: lineas)
            resultado += nLinea + ", ";
        
        resultado = resultado.substring(0, resultado.length()-2);
        
        
        return resultado;
    }

    @Override
    public int compareTo(TokenDesplegable o) {
        
        return nombre.compareTo(o.nombre);
    
    }
    
    @Override
    public String toString(){
        return  nombre + " de tipo: " + tipo + " en las lineas: " + printLineas() + ".";
    }
    
    public boolean existe(String pNombre){
        return nombre.equals(pNombre);
    }
    
}
