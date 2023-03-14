/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import java.util.Scanner;
/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

 * @author bruno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir cuadrado
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de asteriscos del cuadrado");
        int n = read.nextInt();
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        
        
        
    
        
        
        
    }
    
}
