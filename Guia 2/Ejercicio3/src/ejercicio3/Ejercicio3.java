/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;


/**
 *
 * @author bruno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VERIFICAR CANTIDAD DE PALABRAS
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase de 8 digitos");
        frase = read.nextLine();
        if(frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
        
        
    }
    
}
