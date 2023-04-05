
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;


//CREAR CUENTA
public class CuentaBancariaServicio {
    Scanner read = new Scanner(System.in);
    public CuentaBancaria crearCuenta(){
       
        
        
        System.out.println("Ingrese el numero de cuenta.");
        int numCuenta = read.nextInt();
        System.out.println("Ingrese su numero de dni");
         long dni = read.nextLong();
        System.out.println("Ingrese su saldo actual");
       double saldo = read.nextDouble();
        return new CuentaBancaria(numCuenta,dni, (float) saldo);
    }
    
    
    //INGRESAR SALDO
    public void ingresar(CuentaBancaria cuenta){
         Scanner read = new Scanner(System.in);
         System.out.println("Ingrese el saldo a ingresar");
        double ingresar = read.nextDouble();
       cuenta.setSaldoActual((float) (cuenta.getSaldoActual() + ingresar));
        System.out.println("Saldo ingresado correctamente");

    }
    
    
    //RETIRAR SALDO
     public void retirar(CuentaBancaria cuenta){
         Scanner read = new Scanner(System.in);
         System.out.println("Ingrese el saldo a retirar");
        double ingresar = read.nextDouble();
       cuenta.setSaldoActual((float) (cuenta.getSaldoActual()  -  ingresar));
        System.out.println("Retire el dinero");

    }
     
     //RETIRAR EL 20%
     public void extraccionRapida(CuentaBancaria cuenta){
          Scanner read = new Scanner(System.in);
          System.out.println("Extraccion rapida, solo se retirara el 20% del sado");
         double saldoARetirar = cuenta.getSaldoActual() * 0.2;
         cuenta.setSaldoActual((float) (cuenta.getSaldoActual() - saldoARetirar));
         System.out.println("Se ah retirado" + saldoARetirar + "pesos.");
         
     }
     
     
     
     //COSULTAR SALDO
     public void consultarSaldo(CuentaBancaria cuenta){

         System.out.println("Su saldo actual es:");
         System.out.println(cuenta.getSaldoActual());
     }
     
     
     //MOSTRAR DATOS
     public void mostrarDatos(CuentaBancaria cuenta){
         System.out.println("================");
         System.out.println("Numero de cuenta:" + cuenta.getNumeroCuenta());
         System.out.println("Numero de dni del cliente:" + cuenta.getDniCliente());
         System.out.println("Saldo actual :" + cuenta.getSaldoActual());
          System.out.println("================");
     }
    
}
