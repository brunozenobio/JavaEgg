
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Se dispone de un conjunto de N familias, cada una de las cuales tiene 
 * una M cantidad de hijos. Escriba un programa que pida la cantidad de familias 
 * y para cada familia la cantidad de hijos para averiguar la media de edad de los hijos 
 *de todas las familias.

* 
 * @author bruno
 */
public class Ejercicio14 {
     public static void main(String[] args){
        Scanner read = new Scanner(System.in);
         System.out.println("Ingresar el numero de familias");
         int N = read.nextInt(),sumaEdad = 0;
         
         for(int i = 1;i <= N;i++){
             System.out.println("Familia: " + i + " ingrese el numero de hijos");
             int M = read.nextInt();
             for(int j = 1; j <= M;j++){
                 System.out.println("Ingrese la de edad del " + j + " hijo");
                 int edad = read.nextInt();
                 sumaEdad +=edad;
             }
             System.out.println("Familia " + i + " el promedio de edad de sus " + M + " hijos es");
             float promedio = ((float) sumaEdad) / ((float) M);
             System.out.println(promedio);
             
         }
        
        
    }
}
