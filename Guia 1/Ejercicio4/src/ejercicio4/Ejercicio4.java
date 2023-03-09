/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author bruno
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float gCent,gFh;
        Scanner read = new Scanner(System.in);
        gCent = read.nextFloat();
        gFh = 32 + ( 9 * gCent / 5 );
        System.out.println(gCent + " grados centigrados equivalen a " + gFh + " grados farenheint");
    }
    
}
