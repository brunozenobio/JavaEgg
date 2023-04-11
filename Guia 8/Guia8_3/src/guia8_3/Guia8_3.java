/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_3;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Guia8_3 {
    public static void main(String[] args) {
        Persona person = new Persona();
        PersonaServicio personServico = new PersonaServicio();

        Boolean[] esMayor = new Boolean[4];
        int[] iCM = new int[4];


        for (int i = 0 ; i< 4; i++){
            person = personServico.crearPersona();
            System.out.println(person.getNombre() + ":");
            System.out.println("Es mayor de edad?");
            esMayor[i] = personServico.esMayorDeEdad(person);
            iCM[i] = personServico.calcularIMC(person);
            if (personServico.esMayorDeEdad(person)){
                System.out.println("Si");
            }else{
                System.out.println("No");
            }

            System.out.println("Esta en su peso ideal?");
            if (personServico.calcularIMC(person)==0){
                System.out.println("SI");
            }else if(personServico.calcularIMC(person)==-1){
                System.out.println("Esta por debajo de su peos ideal");
            }else{
                System.out.println("Tiene sobrepeso");
            }
        }

        int contF = 0,mayor = 0,contI = 0, contS = 0;

        for (int i = 0 ; i< 4; i++){
            if(esMayor[i]){
                mayor++;
            }
        }

        for (int i = 0 ; i< 4; i++){
            if(iCM[i] == 1){
                contS++;
            }else if(iCM[i] == -1){
                contF++;
            }else{
                contI++;
            }
        }

        System.out.println(mayor + "personas son mayores de edad");
        System.out.println(contF + "personas estan por debajo del peso ideal");
        System.out.println(contS + "personas tienen sobrepeso");
        System.out.println(contI + "personas tinen el peso ideal");










    }
    
}
