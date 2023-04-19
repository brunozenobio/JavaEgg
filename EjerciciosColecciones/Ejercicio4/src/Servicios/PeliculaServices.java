package Servicios;

import Entidades.Pelicula;

import java.util.Scanner;

public class PeliculaServices {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula(){
        Pelicula p1 = new Pelicula();
        System.out.println("Vamos a crear una pelicula");
        System.out.println("Para esto ingrese los siguientes datos.");
        System.out.print("Titulo: ");
        p1.setTitulo(read.next());
        System.out.print("Director: ");
        p1.setDirecto(read.next());
        System.out.print("Duracion en horas: ");
        p1.setDuracion(read.nextDouble());
        return p1;

    }
}
