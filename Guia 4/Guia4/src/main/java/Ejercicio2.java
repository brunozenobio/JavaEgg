
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Realizar un algoritmo que llene un vector de 
 * tamaño N con valores aleatorios y le pida al usuario un número a 
 * buscar en el vector. El programa mostrará dónde se encuentra el numero y
 * si se encuentra repetido

 * @author bruno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector;
        int contador = 0, indice = 0;
        System.out.println("Ingrese la dimension del vector");
        int n = read.nextInt();
        vector = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)( Math.random()*10);
            System.out.println(vector[i]);
            
        }
        
        System.out.println("Ingrese un numero a buscar");
        int num = read.nextInt();
        
        
        
        for (int i = 0; i < n; i++) {
            if(vector[i] == num){
                indice = i;
                contador++;
                System.out.println("El numero " + num + " se encontro en la posicion " + indice);
            }
            
        }
        ;
        System.out.println("Finalmente se repitio " + contador + " veces");
    }
    
}
