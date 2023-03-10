/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author bruno
 */

import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        System.out.println("Con todas sus letras en mayusculas es");
        System.out.println(frase.toUpperCase());
        System.out.println();
        System.out.println("Con todas sus letras en minusculas es");
        System.out.println(frase.toLowerCase());
    }
    
}
