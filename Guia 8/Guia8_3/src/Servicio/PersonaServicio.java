/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Persona;

import java.util.Scanner;

public class PersonaServicio {
    private Scanner read = new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        System.out.println("Ingrese su edad");
        int edad = read.nextInt();
        System.out.println("Ingrese su sexo ('H'/'M'/'O')");
        String sexo;
        do {
            sexo =  (read.next());
        }while((!sexo.equalsIgnoreCase("H") || !sexo.equalsIgnoreCase("M") || !sexo.equalsIgnoreCase("O")));


        if(sexo != "H" || sexo != "M" || sexo!= "O"){
            System.out.println("El sexo ingresado no es correcto");
        }
        System.out.println("Ingrese su atura en metros");
        double altura = read.nextDouble();
        System.out.println("Ingrese su peso en kilogramos");
        double peso = read.nextDouble();

        return new Persona(nombre,sexo,edad,peso,altura);
    }

    public Boolean esMayorDeEdad(Persona per1){
        if(per1.getEdad()<18){
            return false;
        }else{
            return true;
        }
    }

    public int calcularIMC(Persona per1){
        double imc = per1.getPeso()/(Math.pow(per1.getAltura(),2));
        if(imc < 20){
            return -1;
        }else if(imc <= 25 && imc >= 20){
            return 0;
        }else{
            return 1;
        }


    }
}

