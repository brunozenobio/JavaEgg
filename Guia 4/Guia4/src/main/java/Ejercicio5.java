
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
 * se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author bruno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                System.out.println(matriz[i][j]);
            }
            System.out.print("");
        }
        for (int[] fila:matriz) {
            for (int columna:fila) {
                System.out.print(columna+" ");
            } 
            System.out.println("");
        }
        System.out.println("Traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
        
        
    }
    
}
