
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 
 * 1 y 10 y se muestre su equivalente en romano.
 * 
 * @author bruno
 */
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10 para convertir en romano");
        int numero = read.nextInt();
        
        switch(numero){
            case 1:
                System.out.println(numero + " :I");
                break;
            case 2:
                System.out.println(numero + " :II");
                break;
            case 3:
                System.out.println(numero + " :III");
                break;
            case 4:
                System.out.println(numero + " :IV");
                break;
            case 5:
                System.out.println(numero + " :V");
                break;
            case 6:
                System.out.println(numero + " :VI");
                break;
            case 7:
                System.out.println(numero + " :VII");
                break;
            case 8:
                System.out.println(numero + " :VIII");
                break;
            case 9:
                System.out.println(numero + " :IX");
                break;
            case 10:
                System.out.println(numero + " :X");
                break;
        }
    }
}
