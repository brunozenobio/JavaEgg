/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(float saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirarDinero(){
        Scanner read = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar");
        double dineroAretirar = read.nextFloat();
        if((saldo - dineroAretirar) < 0 ){
            System.out.println("Error!!! no dispone de esa cantidad");
        }else{
            saldo -= dineroAretirar;
            System.out.println("Dinero retirado correctamente");
            System.out.println("Su saldo es de :" + saldo);
            
        }
    }
}
