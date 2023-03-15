
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**Simular la división usando solamente restas. Dados dos números enteros 
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando 
 * sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el 
 * divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 *
 * @author bruno
 */
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        //Restas sucesivas para dividir a / b
        
        System.out.println("Ingrese el dividendo");
        int a = read.nextInt();
        System.out.println("Ahora ingrese el divisor");
        int b = read.nextInt();
        int divisor = a;
        int contador = 0,resto = 0;
        
        while(a >= b){
             resto = a - b;
             a = resto;
             contador++;
        }
        
        System.out.println("Se ah hecho la division por metodo de restas");
        System.out.println("de " + divisor + "/" + b);
        System.out.println("El resultado fue");
        System.out.println("Cociente: " + contador);
        System.out.println("Resto: " + resto);
        
        
        
    }
}
