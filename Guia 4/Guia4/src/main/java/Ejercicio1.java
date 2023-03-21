/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**Realizar un algoritmo que llene un vector con 
 * los 100 primeros números enteros y los muestre por 
 * pantalla en orden descendente.

 *
 * @author bruno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         
         int[] vector = new int[100];
         
         for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
            
        }
         for (int i = 99; i >= 0; i--) {
             System.out.println(vector[i]);
        }
          
         
    }
    
}
