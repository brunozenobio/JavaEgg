/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *

 */
public class Rectangulo {
    Scanner read = new Scanner(System.in);
    private double base,altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        base = read.nextDouble();
        System.out.println("Ingrese ahora la altura");
        altura = read.nextDouble();
        
    }
    public double superficie(){
        return base * altura;
    }
    public double perimetro(){
        return (base + altura) * 2;
        
    }
    public void dibujarRectanguloSuperficie(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    public void dibujarRectanguloPerimetro(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }
    
}
