package paquete;

/**
 *
 * @author alejandra trejo
 */
public class Nodo {
    
    private String String_ver_todo;
    private Nodo izq_nodo, derecha_nodo;

    public Nodo(String dato, Nodo izquierda, Nodo derecha) {
        this.String_ver_todo = dato;
        this.izq_nodo = izquierda;
        this.derecha_nodo = derecha;
    }

    public String getDato() {
        return String_ver_todo;
    }

    public void setDato(String dato) {
        this.String_ver_todo = dato;
    }

    public Nodo getIzq() {
        return izq_nodo;
    }

    public void setIzq(Nodo izq) {
        this.izq_nodo = izq;
    }

    public Nodo getDer() {
        return derecha_nodo;
    }

    public void setDer(Nodo der) {
        this.derecha_nodo = der;
    } 

}
