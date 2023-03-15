/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre 
 * por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
 * deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
 * ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
 * la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
 * de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el 
 * usuario selecciona el carácter ‘S’ se sale del programa, 
 * caso contrario se vuelve a mostrar el menú.
 * @author bruno
 */

import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int a,b,opcion;
        String seg = null;
        System.out.println("Ingrese un numero");
        a = read.nextInt();
        System.out.println("Ingrese otro numero");
        b = read.nextInt();
        
        do{
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opcion:");
        opcion = read.nextInt();
         read.nextLine();
         seg = "NO";
        switch(opcion){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println("Esta seguro de que desea salir del programa (S/N)?");
                seg = read.nextLine();
                break;

                
        }
        

        
    }while((!seg.equals("S")));
    
}
}