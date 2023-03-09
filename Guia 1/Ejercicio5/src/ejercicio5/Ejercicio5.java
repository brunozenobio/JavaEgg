/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author bruno
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        System.out.println("El numero a " + a );
        System.out.println("el doble de a es " + 2 * a);
        System.out.println("el triple de a es " + 3 * a);
        System.out.println45("Y su raiz cuadrada es " + Math.sqrt(a));
    }
    
}
