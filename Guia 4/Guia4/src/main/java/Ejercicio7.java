
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada
 * por números del 1 al 9 donde la suma de sus filas, sus columnas y sus d
 * iagonales son idénticas. Crear un programa que permita introducir un cuadrado 
 * por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar 
 * que los números introducidos son correctos, es decir, están entre el 1 y el 9.

 *
 * @author bruno
 */



public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        

        int[][] matriz = new int[3][3];
        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese el valor matriz["+i+"]["+j+"]" );
                    matriz[i][j] = read.nextInt();
                } while (matriz[i][j]<1 || matriz[i][j]>9);
                
            }
        }

        boolean esMagica = true;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        // Calcular la suma de la diagonal principal y secundaria
        for (int i = 0; i < 3; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][3 - i - 1];
        }

        // Verificar si la suma de las filas, columnas y diagonales es igual
        if (sumaDiagonal1 != sumaDiagonal2) {
            esMagica = false;
        }
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != sumaColumna || sumaFila != sumaDiagonal1) {
                esMagica = false;
                break;
            }
        }

        if (esMagica) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
    }
    }
    
    

