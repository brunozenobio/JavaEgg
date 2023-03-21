
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
 * Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.

 * @author bruno
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese hasta que termino de la sucecion desea calcular");
        int n = read.nextInt();
        int fibonaccii = 0;
        int[] fibonacci = new int[n];
        
        for (int i = 0; i <= n; i++) {
            fibonacci[i] = fibo(fibonaccii,i);
            System.out.println(fibonacci[i] + " ");
        }
        
        
    }
    public static int fibo(int fibonacci,int n){
        int termino;
        if(n == 0){
            fibonacci = 0;
            return fibonacci;
        }else if(n == 1){
            fibonacci = 1;
            return fibonacci;
        }else{
            fibonacci = fibo(fibonacci,n - 1) + fibo(fibonacci,n - 2) ;
            return fibonacci;
            
            
        }
       
        
        
        
    }
    
}
