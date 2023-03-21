
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
 * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una
 * matriz A se denota 
 * por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author bruno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean esAnt = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                
                matriz[i][j] = read.nextInt();
            }
        }
        for (int[] fila:matriz) {
            for (int columna:fila) {
                System.out.print(columna+" ");
            } 
            System.out.println("");
        }
        
        System.out.println("-------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(-1 * matriz[j][i] + " ");
            }
            System.out.println("");
        }
        

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if(matriz[i][j] == -1 * matriz[j][i]){
                    esAnt = false;
                    break;
                }else{
                    
                }
                    
            }
        }
        if(esAnt){
            System.out.println("Es antisimetrica");
        }else{
            System.out.println("No es antisimetrica");
        }
    }
    
}
