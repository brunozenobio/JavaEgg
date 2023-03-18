
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**Crea una aplicación que nos pida un número por teclado y 
 * con una función se lo pasamos por parámetro para que nos indique 
 * si es o no un número primo, debe devolver true si es primo, sino false.

 *
 * @author bruno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero para verificar si es primo");
        int numero = read.nextInt();
        
        if(primo(numero)){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
           
    }
    public static boolean primo(int n){
        
            for (int i = 2; i < n; i++) {
            
            if(n % i == 0){
                return false;
            }
            
        }
        return true;
        
    }
    
}
