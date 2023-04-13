package Servicio;

import Entidad.Fraccion;

import java.util.Scanner;

public class FraccionServicio {
    private Scanner read = new Scanner(System.in);

    public Fraccion crearFraccion(){
        System.out.println("Ingrese la primer fraccion");
        System.out.print("Numerador: ");
        int numerador1 = read.nextInt();
        System.out.print("Denominador: ");
        int denominador1 = read.nextInt();
        System.out.println("Ingrese la segunda fraccion");
        System.out.print("Numerador: ");
        int numerador2 = read.nextInt();
        System.out.print("Denominador: ");
        int denominador2 = read.nextInt();
        return new Fraccion(numerador1,numerador2,denominador1,denominador2);
    }
    public void sumar(Fraccion frac){
        int numeradors,denominadors;

        numeradors = frac.getNumerador1() * frac.getDonominador2() + frac.getNumerador2() * frac.getDenominador1();
        denominadors = frac.getDenominador1() * frac.getDonominador2();
        System.out.print(frac.getNumerador1() + "/" + frac.getDenominador1() + "+" + frac.getNumerador2() + "/" + frac.getDonominador2() );
        System.out.println(" = " + numeradors + "/" + denominadors);
    }

    public void restar(Fraccion frac){
        int numeradorr,denominadorr;

        numeradorr = frac.getNumerador1() * frac.getDonominador2() - frac.getNumerador2() * frac.getDenominador1();
        denominadorr = frac.getDenominador1() * frac.getDonominador2();
        System.out.print(frac.getNumerador1() + "/" + frac.getDenominador1() + "-" + frac.getNumerador2() + "/" + frac.getDonominador2() );
        System.out.println(" = " + numeradorr + "/" + denominadorr);
    }

    public void multiplicar(Fraccion frac){
        int numeradorm,denominadorm;

        numeradorm = frac.getNumerador1() * frac.getNumerador2();
        denominadorm = frac.getDenominador1() * frac.getDonominador2();

        System.out.print(frac.getNumerador1() + "/" + frac.getDenominador1() + "*" + frac.getNumerador2() + "/" + frac.getDonominador2() );
        System.out.println(" = " + numeradorm + "/" + denominadorm);
    }

    public void dividir(Fraccion frac){
        int numeradord,denominadord;

        numeradord = frac.getNumerador1() * frac.getDonominador2();
        denominadord = frac.getDenominador1() * frac.getNumerador2();

        System.out.print(frac.getNumerador1() + "/" + frac.getDenominador1() + "/" + frac.getNumerador2() + "/" + frac.getDonominador2() );
        System.out.println(" = " + numeradord + "/" + denominadord);
    }



}
