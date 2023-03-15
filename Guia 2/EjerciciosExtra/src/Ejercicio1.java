/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas.
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
 * calcular su equivalente: 1 día, 2 horas.

 * @author bruno
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        float horas,dias,min;
        System.out.println("Ingrese la hora en minutos");
        
        min = read.nextInt();
        
        horas = min / 60 ;
        dias = horas * 24;
        
        System.out.println(min + "minutos equivalen a:");
        System.out.println(horas + "horas ");
        System.out.println("y" + dias + "dias");
        
        
        
    }
}
