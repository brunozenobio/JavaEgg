package Service;

import Entidad.ParDeNumeros;

public class ParDeNumerosService {

    public static void mostrarValores(ParDeNumeros p1){
        System.out.println("El valor de a = " + p1.getA());
        System.out.println("El valor de b = " + p1.getB());
    }

    public static void devolverMayor(ParDeNumeros p1){
        if(p1.getA() >  p1.getB()){
            System.out.println(p1.getA() + ">" + p1.getB());
        }else{
            System.out.println(p1.getB() + ">" + p1.getA());
        }
    }

    public static void calcularPotencia(ParDeNumeros p1){

        double a = Math.round(p1.getA());
        double b = Math.round(p1.getB());
        if(p1.getA() >  p1.getB()){


            System.out.println("A elevado a B = " + Math.pow(a,b));
        }else{
            System.out.println("B elevado a A = " +  Math.pow(b,a));

        }
    }

    public static void calcularRaiz(ParDeNumeros p1){
        double a = Math.abs(p1.getA());
        double b = Math.abs(p1.getB());
        System.out.println("La raiz cuadrada de A = " + p1.getA() + " es " + Math.pow(a,0.5));
        System.out.println("La raiz cuadrada de B = " + p1.getB() + " es " + Math.pow(b,0.5));
    }



}
