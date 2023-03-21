
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**Recorrer un vector de N enteros contabilizando cuántos 
 * números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 *
 * @author bruno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        vector = new int[n];
        int cot1D = 0,cot2D = 0, cot3D = 0,cot4D = 0,cot5D = 0;
        for (int i = 0;i<vector.length;i++) {
            vector[i]= (int) (Math.random()*99999);
            if(vector[i] < 10){
                cot1D++;
            }else if(vector[i] < 100){
                cot2D++;
            }else if(vector[i] < 1000){
                cot3D++;
            }else if(vector[i] < 10000){
                cot4D++;
            }else if(vector[i] < 100000){
                cot5D++;
            }
            System.out.println(vector[i]);
        }
        System.out.println("1 Digito: " + cot1D + "\n 2 Digitos: " + cot2D + "\n 3 Digitos: "+ cot3D);
        System.out.println("4 Digitos: " + cot4D + "\n 5 Digitos: " + cot5D);
        System.out.println(vector[4]);
    }
    
}
