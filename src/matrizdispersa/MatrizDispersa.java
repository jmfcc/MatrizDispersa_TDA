/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizdispersa;

/**
 *
 * @author Jaime Chiroy
 */
public class MatrizDispersa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ya no sale");
        // TODO code application logic here
        HandlerMD matrix = new HandlerMD();
        
        matrix.insertDataCell(1, 1, "A");
        matrix.insertDataCell(1, 5, "B");
        matrix.insertDataCell(3, 5, "C");
        matrix.insertDataCell(3, 3, "D");
        matrix.insertDataCell(1, 2, "E");
        matrix.insertDataCell(4, 2, "F");
        matrix.insertDataCell(2, 2, "G");   
        matrix.showMatrix();
    }
    
}
