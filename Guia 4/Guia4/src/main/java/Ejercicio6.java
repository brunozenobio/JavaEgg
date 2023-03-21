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
        int[][] matriz = new int[4][4];
        boolean esAnt = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random()*10 - Math.random()*9);
                System.out.println(matriz[i][j]);
            }
            System.out.print("");
        }
        for (int[] fila:matriz) {
            for (int columna:fila) {
                System.out.print(columna+" ");
            } 
            System.out.println("");
        }
        int contador = 0;
        System.out.println("Traspuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[i][j] == -1 * matriz[j][i]){
                    contador++;
                }else{
                    esAnt = false;
                    break;
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
