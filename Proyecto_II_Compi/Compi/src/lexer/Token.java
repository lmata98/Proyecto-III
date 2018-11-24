/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

import java.util.ArrayList;

/**
 *
 * @author geovanny
 */
public class Token {
    
    private int id; //Identificador único para cada TOKEN
    private String name; //Nombre del TOKEN
    private Types_Tokens type;  //Tipo del TOKEN (Identificador, Operador, Palabra Reservada, Literal)
    private ArrayList<Line> lines = new ArrayList<>();  //Arreglos de lineas y ocurrencias
    
    public Token(int id, String name, Types_Tokens type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " " + type + " " + lines;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public Types_Tokens getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Types_Tokens type) {
        this.type = type;
    }

    /**
     * @return the lines
     */
    public ArrayList<Line> getLines() {
        return lines;
    }

    /**
     * @param lines the lines to set
     */
    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;        
    }
    
}
