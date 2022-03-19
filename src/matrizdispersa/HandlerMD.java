/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizdispersa;

/**
 *
 * @author Jaime Chiroy
 */
public class HandlerMD {
    private Encabezados encCols; // X
    private Encabezados encFilas; // Y

    public HandlerMD() {
//        System.out.println("No pos a mimir");
        this.encCols = new Encabezados();
        this.encFilas = new Encabezados();
    }
    
    public void insertDataCell(int x, int y, String dato){
        NodoCelda newCell = new NodoCelda(x, y, dato);
        
//        Insercion por cols
        NodoEncabezado nodoCol = encCols.getHeader(x);
        if (nodoCol == null){
            nodoCol = new NodoEncabezado(x);
            encCols.setHeader(nodoCol);
            nodoCol.setAcceso(newCell);
        } else {
            if (y == nodoCol.getAcceso().getY()){
                System.out.print("");
            }else if (y < nodoCol.getAcceso().getY()){
                newCell.setInferior(nodoCol.getAcceso());
                nodoCol.getAcceso().setSuperior(newCell);
                nodoCol.setAcceso(newCell);
            } else {
                NodoCelda aux = nodoCol.getAcceso();
                while (aux.getInferior() != null) {
                    if (y == aux.getInferior().getY()){
                        System.err.print("");
                    } else if (y < aux.getInferior().getY()){
                        newCell.setInferior(aux.getInferior());
                        aux.getInferior().setSuperior(newCell);
                        aux.setInferior(newCell);
                        newCell.setSuperior(aux);
                        break;
                    }
                    aux = aux.getInferior();
                }
                
                if (aux.getInferior() == null){
                    aux.setInferior(newCell);
                    newCell.setSuperior(aux);
                }
            }
        }
//        Insercion por filas
        NodoEncabezado nodoFil = encFilas.getHeader(y);
        if (nodoFil == null){
            nodoFil = new NodoEncabezado(y);
            encFilas.setHeader(nodoFil);
            nodoFil.setAcceso(newCell);
        } else {
            if (x == nodoFil.getAcceso().getX()){
                System.out.print("");
            }else if (x < nodoFil.getAcceso().getX()){
                newCell.setSiguiente(nodoFil.getAcceso());
                nodoFil.getAcceso().setAnterior(newCell);
                nodoFil.setAcceso(newCell);
            } else {
                NodoCelda aux2 = nodoFil.getAcceso();
                while (aux2.getSiguiente()!= null) {
                    if (x == aux2.getSiguiente().getX()){
                        System.err.print("");
                    } else if (x < aux2.getSiguiente().getX()){
                        newCell.setSiguiente(aux2.getSiguiente());
                        aux2.getSiguiente().setAnterior(newCell);
                        aux2.setSiguiente(newCell);
                        newCell.setAnterior(aux2);
                        break;
                    }
                    aux2 = aux2.getSiguiente();
                }
                
                if (aux2.getSiguiente()== null){
                    aux2.setSiguiente(newCell);
                    newCell.setAnterior(aux2);
                }
            }
        }
    }
    
    public void showMatrix(){
        NodoEncabezado aux = encCols.getHead();
        
        while (aux != null){
            NodoCelda aux2 = aux.getAcceso();
            while (aux2 != null){
                System.out.println("X:" + String.valueOf(aux2.getX()) + " Y: " + String.valueOf(aux2.getY()) + " String: " + aux2.getDato());
                aux2 = aux2.getInferior();
            }
            aux = aux.getSiguiente();
        }
    }
}
