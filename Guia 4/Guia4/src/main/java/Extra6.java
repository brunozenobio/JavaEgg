
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
* medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
* de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
* en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
* de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
* Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
* de Java substring(), Length() y Math.random().






* 
 * @author bruno
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[][] sopaLetras = new String[20][20];
        System.out.println("Ingrese palabras que tengan entre 3 y 5 caracteres");
        String palabra = null;
        for (int i = 0; i < 5; i++) {
            
            do {
                System.out.println("Palabra " + (i + 1));
                palabra = read.next();
           
            }while (palabra.length() < 3 || palabra.length() > 5);
             agregarPalabra(sopaLetras,palabra);
        }
        completar(sopaLetras);
        for (String[] elemento:sopaLetras) {
            for (String elemento2:elemento) {
                System.out.print("[" + elemento2 + "]");
            }
            System.out.println();
        }
    }
    public static String[][] agregarPalabra(String[][] sopaLetras,String palabra){
        String pal = null;
        int col = (int) (Math.random() * 15);
         int fila = (int) (Math.random() * sopaLetras.length);
            for (int j = 0; j < palabra.length(); j++) {
                pal = palabra.substring(j,j+1);
                sopaLetras[fila][j + col] = pal;
            }
            
        return sopaLetras;
        
    }
    public static String[][] completar(String[][] sopaLetras){
        for (int i = 0;i< sopaLetras.length;i++) {
            for (int j = 0;j< sopaLetras[0].length;j++) {
                if(sopaLetras[i][j] == null){
                    sopaLetras[i][j] = String.valueOf((int) (Math.random()*9));
                }
            }
        }
        return sopaLetras;
    }
    
    
    
}
