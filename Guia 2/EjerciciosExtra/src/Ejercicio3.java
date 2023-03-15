
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
 * de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() 
 * de la clase String.

 * @author bruno
 */
public class Ejercicio3 {
     public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     System.out.println("Ingrese una vocal");
     String frase = read.nextLine();

    
     
     if(frase.toLowerCase().equals("a") && frase.toLowerCase().equals("i") && frase.toLowerCase().equals("e") && frase.toLowerCase().equals("o") && frase.toLowerCase().equals("u")){
         System.out.println("Es una vocal");
     }else{
         System.out.println("No lo es");
     }
           
     
     
     }
     
}
