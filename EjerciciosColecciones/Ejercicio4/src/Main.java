import Entidades.Pelicula;
import Servicios.PeliculaServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PeliculaServices ps = new PeliculaServices();
        Pelicula pelicula;
        ArrayList<Pelicula> peliculas = new ArrayList();
        System.out.println("Creando una pelicula...");
        pelicula = ps.crearPelicula();
        peliculas.add(pelicula);
        String opcion;
        do{
            System.out.print("Desea agregar otra pelicula s/n?: ");
            opcion = read.next();
            if(opcion.equalsIgnoreCase("S")){
                pelicula = ps.crearPelicula();
                peliculas.add(pelicula);
            }
        }while (opcion.equalsIgnoreCase("s"));

        for (Pelicula pelis:peliculas
             ) {
            System.out.println(pelis);
        }

    }
}