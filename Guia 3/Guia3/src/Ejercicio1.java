
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        System.out.println("Numero 1:");
        int a = read.nextInt();
        System.out.println("Numero 2:");
        int b = read.nextInt();
        
        System.out.println("1.Que desea hacer con estos");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("Elija una opcion");
        
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                int res = sumar(a,b);
                System.out.println(a + "+" + b + "=" + res);
                break;
            case 2:
                res = restar(a,b);
                System.out.println(a + "-" + b + "=" + res);
                break;
            case 3: 
                res = multiplicar(a,b);
                System.out.println(a + "*" + b + "=" + res);
                break;
            case 4:   
                res = dividir(a,b);
                System.out.println(a + "/" + b + "=" + res);
                break;
            default:
                throw new AssertionError();
        }
        
    }
    public static int sumar(int x,int y){
            return x + y;
        }
        public static int restar(int x,int y){
            return x - y;
        }
        public static int multiplicar(int x,int y){
            return x * y;
        }
        public static int dividir(int x,int y){
            return x / y;
        }
    
}

