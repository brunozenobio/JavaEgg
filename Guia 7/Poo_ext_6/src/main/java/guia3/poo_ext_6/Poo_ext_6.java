/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia3.poo_ext_6;
import Entidades.Empleado;
public class Poo_ext_6 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Bruno");
        empleado1.setEdad(25);
        empleado1.setSalario(50000);
        System.out.println("El salario de " + empleado1.getNombre());
        System.out.println("es de:  " + empleado1.getSalario());
        System.out.println("Y como tiene " + empleado1.getEdad() + " años, su sueldo con el aumento es: " + empleado1.calcularAumento());
        
    }
}
