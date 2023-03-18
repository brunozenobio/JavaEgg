
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
 * y el promedio de n números (n>0). El valor de n se solicitará al principio del
 * programa y los números serán introducidos por el usuario. Realice dos versiones del programa,
 * una usando el bucle “while” y otra con el bucle “do - while”.

 * 
 * 
 * 
 * @author bruno
 */
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor de la cantidad de numeros a ingresar");
        int n = read.nextInt();
        int maximo,minimo;
        float suma,promedio;
        suma = 0;
        

        
        maximo = 0;
        minimo = 0;
        int valor = 0;
        float tot = n;
        int cont = 0;
        while(cont != n){
            System.out.println("Ingrese el " + (cont + 1) + " valor" );
            valor = read.nextInt();
            suma += valor;
            if(cont == 0){
                minimo = valor;
                maximo = valor;
            }else{
                maximo = Math.max(maximo, valor);
                minimo = Math.min(minimo, valor);
            }
            
            cont++;
            
            
            
        }
            
        promedio = suma / tot;
        System.out.println("El promedio es " + promedio );
        System.out.println("El maximo es " + maximo);
         
        System.out.println("El minimo es " + minimo);
        
        
        
        
    }
    
}
