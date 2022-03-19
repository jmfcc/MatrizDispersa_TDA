/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizdispersa;

/**
 *
 * @author Jaime Chiroy
 */
public class Encabezados {
    
    private NodoEncabezado head;

    public Encabezados() {
        this.head = null;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public NodoEncabezado getHeader(int pos){
        NodoEncabezado aux = head;
        while (aux != null) {
            if (aux.getPosicion() == pos){
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }
    
    public void setHeader(NodoEncabezado newNode){
        if (isEmpty()){
            head = newNode;
        } else if (newNode.getPosicion() < head.getPosicion()){
            newNode.setSiguiente(head);
            head.setAnterior(newNode);
            head = newNode;
        } else {
            NodoEncabezado aux = head;
            while (aux.getSiguiente() != null) {
                if (newNode.getPosicion() < aux.getSiguiente().getPosicion()){
                    newNode.setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(newNode);
                    newNode.setAnterior(aux);
                    aux.setSiguiente(newNode);
                    break;
                }
                aux = aux.getSiguiente();
            }
            
            if (aux.getSiguiente() == null){
                aux.setSiguiente(newNode);
                newNode.setAnterior(aux);
            }
        }
    }

    public NodoEncabezado getHead() {
        return head;
    }

    public void setHead(NodoEncabezado head) {
        this.head = head;
    }
}
