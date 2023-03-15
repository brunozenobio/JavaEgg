
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * 
 * Escribir un programa que lea un número entero y devuelva el número de dígitos 
 * que componen ese número. Por ejemplo, si introducimos el número 12345, 
 * el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
 * utilizando el operador de división. Nota: recordar que las variables de tipo entero 
 * truncan los números o resultados.

 *
 * @author bruno
 */
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = read.nextInt();
        
        int suma = 0;
        
        while(numero >= 1){
            numero = numero / 10;
            suma++;
        }
        System.out.println("El numero ingresado tiene " + suma++ + " digitos");
        
    }
}
