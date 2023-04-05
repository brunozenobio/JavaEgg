
package gui18_1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;

public class Gui18_1 {

    public static void main(String[] args) {
        CuentaBancariaServicio cuenta1 = new  CuentaBancariaServicio();
        CuentaBancaria cuentaPers1 = cuenta1.crearCuenta();
        cuenta1.ingresar(cuentaPers1);
        cuenta1.retirar(cuentaPers1);
       cuenta1.extraccionRapida(cuentaPers1);
       cuenta1.consultarSaldo(cuentaPers1);
       cuenta1.mostrarDatos(cuentaPers1);
       
        
    }
    
}
