

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Crea una aplicación que a través de una función nos convierta 
 * una cantidad de euros introducida por teclado a otra moneda, estas 
 * pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
 * la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá 
 * ningún valor y mostrará un mensaje indicando el cambio (void).

* 
 * @author bruno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Esta funcion convierte euros a dolares,yenes o libras");
        System.out.println("Ingrese la cantidad de euros");
        float euros = read.nextFloat();
        System.out.println("A que moneda desea convertir");
        String conversor = read.next();
        conversor = conversor.toLowerCase();
        convertir(euros,conversor);
        
    }
    
    public static void convertir(float moneda,String monedaDestino){
        switch (monedaDestino) {
            case "dolares":
                System.out.println(moneda + " euros equivalen a " + 1.28611*moneda + " " + monedaDestino);
                break;
            case "libras":
                System.out.println(moneda + " euros equivalen a " +  0.86*moneda + " " + monedaDestino);
                break;
            case "yenes":
                System.out.println(moneda + " euros equivalen a " + 129.852*moneda + " " + monedaDestino);
                break;
            default:
                throw new AssertionError();
        }
        
        
    
        
        
    
    }
    
}
