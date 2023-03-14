/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
 * lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: 
 * tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
 * X y el último tiene que ser una O.Las secuencias leídas que respeten el formato se 
 * consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
 * toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.Al finalizar el proceso, 
 * se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el 
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 * @author bruno
 */
public class Ejercicio7 {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //RS232
        
        String secuencia;//Defino la variable para introducir las secuencias
        int sumaCorrect,sumaIncorrect; //Suma la cantidad de lecturas correctas e incorrectas
        
        Scanner read = new Scanner(System.in);//Defino read para leer datos
        
        System.out.println("Este programa lee cadenas RS232 y define si son correctas o no");
        System.out.println("Recuerde que estas inicician con 'X' y finalizan con 'O' y cuentan con 5 carcteres ");
        System.out.println("Y finaliza con &&&&&");
        sumaCorrect = 0;
        sumaIncorrect = 0;
        do{
            System.out.println("Ingrese una secuencia RS232");
            secuencia = read.nextLine();
            if(secuencia.length() == 5){
                if(secuencia.substring(0,1).equals("X") && secuencia.substring(secuencia.length() -1).equals("O")){
                    sumaCorrect += 1;
                }else{
                    sumaIncorrect += 1; 
                }
            }else{
                sumaIncorrect += 1; 
            }
        }while(!secuencia.equals("&&&&&"));
        
        System.out.println("El programa a finalizado y este tiene");
        System.out.println(sumaCorrect - 1 + " :secuencias correctas ");
        System.out.println(sumaIncorrect - 1 + " :secuencias incorrectas ");
        
    }
    
}
