
import java.util.Scanner;

/*
Declarar cuatro variables de tipo entero A, B, C y D y 
asignarle un valor diferente a cada una. A continuación, 
realizar las instrucciones necesarias para que: B tome el valor de C, C 
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 */

/**
 *
 * @author bruno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int A,B,C,D,aux;
        System.out.println("Ingresar cuatro variables");
        System.out.println("A:");
        A = read.nextInt();
        System.out.println("B:");
        B = read.nextInt();
        System.out.println("C:");
        C = read.nextInt();     
        System.out.println("D:");
        D = read.nextInt();
        
        System.out.println("A:" + A);
        System.out.println("B:" + B);
        System.out.println("C:" + C);
        System.out.println("D:" + D);
   
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("-----------4");
        System.out.println("A:" + A);
        System.out.println("B:" + B);
        System.out.println("C:" + C);
        System.out.println("D:" + D);
        
      
        
          
        
        
    }
    
}
