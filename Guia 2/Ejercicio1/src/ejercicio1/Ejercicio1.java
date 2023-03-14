/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
 * @author bruno
 */


public class Ejercicio1{
    public static void main(String[] args) {
        //DETERMINO SI UN NUMERO ES PAR
        Scanner read = new Scanner(System.in);
        int a;
        System.out.println("Ingrese un numero para verificar si es par o impar");
        a = read.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " es par");
        }else if(a == 0 ){
             System.out.println(a + " no es ni par ni impar");
        }else{
             System.out.println(a + " es impar");
        }
        
        
    }
}
