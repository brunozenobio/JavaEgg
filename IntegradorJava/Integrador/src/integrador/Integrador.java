package integrador;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        System.out.println( (int) Math.log10(1000)+1);
        
        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D","A", "C", "D", "A"}));

        System.out.println(practica.mediasAmigas(medias));
        System.out.println("===========================");
        System.out.println(practica.numeroCapicua(2));
        System.out.println(practica.prisioneroDulce(0,10,6));
         System.out.println(practica.prisioneroDulce(7,4,8));
          System.out.println(practica.prisioneroDulce(1,5,2));
           System.out.println(practica.prisioneroDulce(0,10,1));
            System.out.println(practica.prisioneroDulce(455,1585,500));
            
    }
}
