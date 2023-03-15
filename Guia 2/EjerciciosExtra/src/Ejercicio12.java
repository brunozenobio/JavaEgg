/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 
 * 0-0-0 al 9-9-9, con la particularidad que 
 * cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
 *
 * @author bruno
 */
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        //Contador X-X-X
        String cadena1,cadena2,cadena3;
        
        
        for(int i = 0;i <= 9; i++ ){
            for(int j = 0; j < 9;j++){
                for(int k = 0; k <= 9;k++){
                    
                    cadena1 = String.valueOf(i);
                    cadena2 = String.valueOf(j);
                    cadena3 = String.valueOf(k);
                    
                    if(cadena1.equals("3")){
                        System.out.println("E" + "-" + j + "-" + k);
                    }else if(cadena2.equals("3")){
                        System.out.println(i+ "-" + "E" + "-" + k);
                    }else if(cadena3.equals("3")){
                        System.out.println(i+ "-" + j + "-" + "E");
                    }else{
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }
            }
        }
            
        
    }
}
