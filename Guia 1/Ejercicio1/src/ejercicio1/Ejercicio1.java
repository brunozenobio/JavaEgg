/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
/**
 *
 * @author bruno
 */
import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int a,b;
        System.out.println("Este programa suma dos numeros");
        System.out.println("Ingrese el primero");
        a= read.nextInt();
        System.out.println("Ahora ingrese el segundo");
        
        
        b= read.nextInt();
        System.out.println("La suma de los numeros es:");
        System.out.println(a+b);
    }
    
}
