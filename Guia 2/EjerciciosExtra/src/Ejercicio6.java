
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * 
 * Leer la altura de N personas y determinar el promedio de estaturas 
 * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas 
 * en general.
 *
 * @author bruno
 */
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        float altura,promedioUno6,promedio;
        int suma,sumaUno6;
        System.out.println("Ingrese la cantidad de personas");
        int n = read.nextInt();
        
        
        promedioUno6 = 0;
        promedio = 0;
        sumaUno6 = 0;
        suma = 0;
        for(int i = 1;i <= n; i++){
            System.out.println("Ingrese la altura de la " + i + "persona");
            altura = read.nextFloat();
            if(altura < 1.6){
                promedioUno6 += altura;
                sumaUno6++;
            }
            promedio += altura;
            suma++;
        }
        
        promedioUno6 = promedioUno6 / sumaUno6;
        promedio = promedio / suma;
        
        System.out.println("Promedio menor a 1.60 mts:" + promedioUno6);
        System.out.println("Promedio total: " + promedio);
    }
}

