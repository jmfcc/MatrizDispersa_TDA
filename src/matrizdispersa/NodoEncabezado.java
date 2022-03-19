/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizdispersa;

/**
 *
 * @author Jaime Chiroy
 */
public class NodoEncabezado {
    private NodoEncabezado siguiente;
    private NodoEncabezado anterior;
    private int posicion;
    private NodoCelda acceso;

    public NodoEncabezado(int posicion) {
        this.siguiente = null;
        this.anterior = null;
        this.acceso = null;
        this.posicion = posicion;
    }

    public NodoEncabezado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEncabezado siguiente) {
        this.siguiente = siguiente;
    }

    public NodoEncabezado getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEncabezado anterior) {
        this.anterior = anterior;
    }

    public NodoCelda getAcceso() {
        return acceso;
    }

    public void setAcceso(NodoCelda acceso) {
        this.acceso = acceso;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
}
