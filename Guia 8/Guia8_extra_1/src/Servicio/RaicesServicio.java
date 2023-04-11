package Servicio;

import Entidad.Raices;

public class RaicesServicio {

    public double getDiscriminante(Raices r1){

        return Math.pow(r1.getB(),2) - 4 * r1.getA() * r1.getC();
    }

    public boolean tieneRaices( Raices r1){
        if(getDiscriminante(r1) > 0){
            return true;

        }else{
            return false;
        }
    }

    public boolean tieneRaiz(Raices r1){
        if(getDiscriminante(r1) == 0){
            return true;
        }else{
            return false;
        }
    }

    public void obtenerRaices(Raices r1){
        if(tieneRaices(r1)){
            System.out.println("Primer raiz:");
            System.out.println((-r1.getB() + Math.pow(getDiscriminante(r1),0.5))/ (2 * r1.getA()));
            System.out.println("Segunda raiz:");
            System.out.println((-r1.getB() - Math.pow(getDiscriminante(r1),0.5)) / ( 2 * r1.getA()));
        }
    }

    public void obtenerRaiz(Raices r1){
        if(tieneRaiz(r1)){
            System.out.println("Raiz:");
            System.out.println(-r1.getB() / (2 * r1.getA()));
        }
    }

    public void calcular(Raices r1){
        if(tieneRaices(r1)){
            System.out.println("Tiene una dos raices");
            obtenerRaices(r1);
        }else if (tieneRaiz(r1)){
            System.out.println("Tiene una sola raiz");
            obtenerRaiz(r1);
        }else{
            System.out.println("No tiene raices dentro de conjunto de los reales");
        }
    }

}
