/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizdispersa;

/**
 *
 * @author Jaime Chiroy
 */
public class NodoCelda {
    
    private int x;
    private int y;
    private String dato;
    private NodoCelda siguiente;
    private NodoCelda anterior;
    private NodoCelda superior;
    private NodoCelda inferior;

    public NodoCelda(int x, int y, String dato) {
        this.x = x;
        this.y = y;
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
        this.superior = null;
        this.inferior = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoCelda getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCelda siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCelda getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCelda anterior) {
        this.anterior = anterior;
    }

    public NodoCelda getSuperior() {
        return superior;
    }

    public void setSuperior(NodoCelda superior) {
        this.superior = superior;
    }

    public NodoCelda getInferior() {
        return inferior;
    }

    public void setInferior(NodoCelda inferior) {
        this.inferior = inferior;
    }
    
    
}
