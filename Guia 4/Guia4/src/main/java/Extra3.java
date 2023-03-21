
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class Extra3 {

    /**Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
     * Después haremos otra función o procedimiento que imprima el vector.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector;
        System.out.println("Ingrese la dimension del vector");
        int n = read.nextInt();
        vector = new int[n];
        rellenar(vector);
        printvec(vector);
    }
    public static int[] rellenar(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*9);
        }
        return vector;
    }
    public static void printvec(int[] vector){
        for (int elemento:vector) {
            System.out.println(elemento);
        }
    }
    
}
