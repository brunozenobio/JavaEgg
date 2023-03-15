
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 * Escriba un programa que lea números enteros. Si el número es 
 * múltiplo de cinco debe detener la lectura y mostrar la cantidad 
 * de números leídos, la cantidad de números pares y la cantidad de números impares. 
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
 * Nota: recordar el uso de la sentencia break.

 * @author bruno
 */
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        int suma = 0,sumaPares = 0,sumaImpares = 0,valor;
        
        do{
            System.out.println("Ingrese un numero, si este es multiplo de 5 se detendra la lectura");
            valor = read.nextInt();
            
            
            if(valor >= 0){
               suma++; 
                if (valor % 2 == 0) {
                    sumaPares++;
                } else {
                    sumaImpares++;
            }
            }
            
            
            if(valor % 5 == 0){
                suma--;
                sumaImpares--;    
                break;
            }
            
            
        }while(5==5);
        
        System.out.println("Usted a ingresado un total de: " + suma);
        System.out.println("De los cuales");
        System.out.println(sumaPares + " son pares ");
        System.out.println("y " + sumaImpares + " son impares");
               
    }
}
