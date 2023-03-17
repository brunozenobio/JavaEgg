
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class Teorica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos multiplos para comprobar que el primero sea multiplo del segundo");
        System.out.println("Primero numero:");
        int a = read.nextInt();
        System.out.println("Segundo numero:");
        int b = read.nextInt();
        EsMultiplo(a,b);
    }
    
    public static void EsMultiplo(int x,int y){
        System.out.println("Para que un numero a sea multiplo de b");
        System.out.println("a = b.k es decir el resto de dividr a por b debe ser 0");
        if(x % y == 0 ){
            System.out.println(x + " es multiplo de " + y);
        }else{
            System.out.println(x + " no es multiplo de " + y);
        }
    }
    
}
