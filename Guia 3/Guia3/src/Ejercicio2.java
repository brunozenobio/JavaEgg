
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Diseñe una función que pida el nombre y la edad de N personas 
 * e imprima los datos de las personas ingresadas por teclado e indique si
 * son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al 
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 * 
 * 
 * @author bruno
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas");
        int N = read.nextInt(),edad;
        String nombre,seguir;
        for (int i = 1; i < N; i++) {
            System.out.println("Usuario " + i + " ingrese su nombre");
            nombre = read.next();
            System.out.println("Ahora su edad");
            edad = read.nextInt();
            personas(N,nombre,edad);
            System.out.println("Desea seguir ingresando nombres?");
            seguir = read.next();
            if(seguir.equals("No")){
                break;
            }
        }
        
    }
    
    public static void personas(int n,String nombre,int edad){
        if(edad < 18){
            System.out.println("Nombre: " + nombre );
            System.out.println("edad:" + String.valueOf(edad));
            System.out.println( "Es menor de edad");
        }else{
           System.out.println("Nombre: " + nombre );
            System.out.println("edad:" + String.valueOf(edad));
            System.out.println( "Es mayor de edad");
        }
        
    }
}
