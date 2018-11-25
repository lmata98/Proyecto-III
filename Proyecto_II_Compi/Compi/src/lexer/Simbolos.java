/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

import java_cup.runtime.Symbol;

/**
 *
 * @author tanzanita
 */
public class Simbolos extends java_cup.runtime.Symbol {
    
  private int linea;
  private int columna;

  public Simbolos(int tipo, int linea, int columna) {
    this(tipo, linea, columna, -1, -1, null);
  }

  public Simbolos(int tipo, int linea, int columna, Object value) {
    this(tipo, linea, columna, -1, -1, value);
  }

  public Simbolos(int tipo, int linea, int columna, int left, int right, Object value) {
    super(tipo, left, right, value);
    this.linea = linea;
    this.columna = columna;
  }

  public int getlinea() {
    return linea;
  }

  public int getcolumna() {
    return columna;
  }

  public String toString() {   
    return "linea "+linea+", columna "+columna+", sym: "+sym+(value == null ? "" : (", value: '"+value+"'"));
  }
    
}
