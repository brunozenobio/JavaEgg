
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Realizar un programa que llene una matriz de tamaño NxM 
 * con valores aleatorios y muestre la suma de sus elementos.

 * @author bruno
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese las filas");
        int n = read.nextInt();
        System.out.println("Ingrese las columnas");
        int m = read.nextInt(),suma = 0;
        int[][] matriz= new int[n][m];
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100 - Math.random() * 100);
                suma += matriz[i][j];
            }
        }
        
        for (int[] elemento:matriz) {
            for (int elemento2:elemento) {
                System.out.print("[" + elemento2 + "]");
            }
            System.out.println("");
        }
        System.out.println("La suma es " + suma);
        
    }
    
}
