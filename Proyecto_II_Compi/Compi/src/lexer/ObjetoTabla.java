/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author tanzanita
 */
public class ObjetoTabla {
    public Object nombre;
    public Object tipo;
    public String scope;
    public String linea;

    public ObjetoTabla(Object nombre, Object tipo,String scope, String linea) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.scope = scope;
        this.linea = linea;
    }

    public Object getType() {
        return tipo;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "ObjetoTabla{" + "nombre=" + nombre + ", tipo=" + tipo + ", scope=" + scope + ", linea=" + linea + '}';
    }


 
}
