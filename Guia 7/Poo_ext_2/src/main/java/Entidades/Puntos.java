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
public class Puntos {
    private float x1,y1,x2,y2;

    public Puntos() {
    }

    public Puntos(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
    
    
    public void crearPuntos(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese las cordadas x y de dos puntos");
        System.out.println("Ingrese x1");
        x1 = read.nextFloat();
        System.out.println("Ingrese y1");
        y1 = read.nextFloat();
        System.out.println("Ingrese x2");
        x2 = read.nextFloat();
        System.out.println("Ingrese y2");
        y2 = read.nextFloat();
    }
    public float distanciaPuntos(){
        float distanciaCuadrado;
        distanciaCuadrado = (float) (Math.pow(y2 - y1 ,2) + Math.pow(x2 - x1,2));
        return ((float) Math.pow(distanciaCuadrado, 0.5));
    }
}
