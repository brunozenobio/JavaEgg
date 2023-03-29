/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.Scanner;
/**
 *

 */
public class Operacion {
    Scanner read = new Scanner(System.in);
    private double numero1,numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        System.out.println("Ingrese dos numeros");
        System.out.println("Numero1:");
        numero1 = read.nextInt();
        System.out.println("Numero2:");
        numero2 = read.nextInt();
    }
    public void sumar(){
        System.out.println("Suma: " + (this.numero1 + this.numero2));
    }
    public double restar(){
        return numero1 - numero2;
        
    }
    public void multiplicar(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println(0 + " error se ah multiplicado por 0");
        }else{
            System.out.println("Producto: "  + (numero1 * numero2));
        }
                
    }
    public double dividir(){
        if(numero2 == 0){
            System.out.println("Error al divir por 0");
            return 0;
        }else{
           return (numero1/numero2);
        }

              
        
        
    }
}
