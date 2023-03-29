/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia3.poo3;
import Entidades.Operacion;
/**
 *
 * @author bruno
 */
public class Poo3 {

    public static void main(String[] args) {
        Operacion cuenta1 = new Operacion();
        cuenta1.crearOperacion();
        System.out.println(cuenta1.getNumero1());
         System.out.println(cuenta1.getNumero2());
        cuenta1.sumar();
        System.out.println("Resta: " + cuenta1.restar());
        cuenta1.multiplicar();
        System.out.println("Cociente: " + (cuenta1.dividir()));
        cuenta1.setNumero1(9);
        cuenta1.setNumero2(5);
         System.out.println(cuenta1.getNumero1());
         System.out.println(cuenta1.getNumero2());
        cuenta1.sumar();
        System.out.println("Resta: " + cuenta1.restar());
        cuenta1.multiplicar();
        System.out.println("Cociente: " + (cuenta1.dividir()));

        
        
    }
}
