/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia3.poo_ext_5;
import Entidades.Cuenta;
public class Poo_ext_5 {

    public static void main(String[] args) {
        Cuenta bruno = new Cuenta();
        bruno.setTitular("Bruno Zenobio");
        bruno.setSaldo((float) 24000.54);
        System.out.println("Su saldo es de: " + bruno.getSaldo());
        bruno.retirarDinero();
    }
}
