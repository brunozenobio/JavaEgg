
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class Teorica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una oracion terminada en punto");
        String frase = read.nextLine();
        String resu = codificar(frase);
        System.out.println(resu);
        
    }
    
    public static String codificar(String palabra){
        String oracionCod = "";
        for (int i = 0; i < palabra.length(); i++) {
            String pal = palabra.substring(i,i+1);
            pal = pal.toLowerCase();
            switch (pal) {
                case "a":
                       oracionCod=oracionCod.concat("@");
                    break;
                case "e":
                    oracionCod=oracionCod.concat("#");
                    break;
                case "i":
                    oracionCod=oracionCod.concat("$");
                    break;
                case "o":    
                    oracionCod=oracionCod.concat("%");
                    break;
                case "u":
                    oracionCod=oracionCod.concat("*");
                    break;
                 
                default:
                    oracionCod=oracionCod.concat(pal);
            }
        }
        return oracionCod;
        
    }
    
}
