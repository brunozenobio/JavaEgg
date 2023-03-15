
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 
* 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% 
* de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
* sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y 
* luego un valor real que represente el costo del tratamiento (previo al descuento) y 
* determine el importe en efectivo a pagar por dicho socio.

 * @author bruno
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la letra correspondiende a su clase social A B o C");
        
        String cSocial = read.nextLine();
        System.out.println("Ahora ingrese el costo del tratamiento");
        float costo = read.nextFloat();
        
        
        switch(cSocial){
            case "A":
                System.out.println("Usted es de clase A");
                System.out.println("por lo tanto tiene un 50% de descuento");
                System.out.println("Aplicando el descuento el tratamiento le costara");
                System.out.println(costo*0.5 + " pesos");
                break;
            case "B":
                System.out.println("Usted es de clase B");
                System.out.println("por lo tanto tiene un 35% de descuento");
                System.out.println("Aplicando el descuento el tratamiento le costara");
                System.out.println(costo - (costo * 0.35) + " pesos");
                break;
            case "C":
                System.out.println("Usted es de clase C");
                System.out.println("por lo tanto no se le aplicara descuento");
                System.out.println("Aplicando el descuento el tratamiento le costara");
                System.out.println(costo + " pesos");
                break; 
            default:
                System.out.println("Clase social inexistente");
                break;                      
        }
        
        
        
    }
}
