
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
 * generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta.
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
 * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 * 
 * 
 * @author bruno
 */
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Este programa multiplica dos numeros aleatorios entre 0 y 10");
        System.out.println("Usted debe adivinar el producto");
        int num1 = (int) (Math.random() * 10 + 1),num2 = (int) (Math.random() * 10 + 1);
        
        int producto = num1 * num2, intento = 0;
        
        do{
            System.out.println("Intene un numero");
            intento = read.nextInt();
            if(intento != producto ){
                System.out.println("Lo siento no es el valor correcto, vuelva a probar");
                
            }else{
                System.out.println("Felicidades usted ah acertado");
            }
            
        }while(intento != producto);
        
        
        
    }
}
