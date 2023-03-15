
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Crear un programa que dibuje una escalera de números, 
 * donde cada línea de números comience en uno y termine en el número de la línea. 
 * Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:

* 
 * @author bruno
 */
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int numero = read.nextInt();
        
        for(int i = 1;i <= numero;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}
