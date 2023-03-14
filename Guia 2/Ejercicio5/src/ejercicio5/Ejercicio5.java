/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
 * solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

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
        Scanner read = new Scanner(System.in);
        int lim,sum,valor;
        System.out.println("Ingrese un valor limite positivo");
        lim = read.nextInt();
        sum = 0;
        while(sum <= lim){
            System.out.println("Ingrese un numero");
            valor = read.nextInt();
            sum = sum + valor;
        }
        System.out.println("La suma de los numeros ingresado ah superado al valor limite " + sum);
    }
    
}
