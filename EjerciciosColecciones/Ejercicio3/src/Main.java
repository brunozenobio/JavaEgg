import Entidades.Alumno;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        Alumno alumno;
        System.out.println("Agregando alumnos a la lista");
        String opcion = "no";

        do{
            System.out.println("Ingrese el nuevo del nuevo alumno");
            System.out.print("Nombre: ");
            String nombre = read.next();
            System.out.println("Ingrese las 3 notas del alumno");
            System.out.print("Nota 1: ");
            int nota1 = read.nextInt();
            System.out.print("Nota 2: ");
            int nota2 = read.nextInt();
            System.out.print("Nota 3: ");
            int nota3 = read.nextInt();
            ArrayList<Integer> notas = new ArrayList();
            notas.add(nota1);
            notas.add(nota2);

            notas.add(nota3);
            alumno = new Alumno(nombre,notas);
            alumnos.add(alumno);
            System.out.println("Alumno ingresado");
            System.out.println("Desea agregar otro alumno s/n");
            opcion = read.next();

        }while(opcion.equalsIgnoreCase("S"));

        for(Alumno al:alumnos){
            System.out.println(al);
        }

        System.out.println("Ingrese el nombre de un alumno si este esta en la lista se calculara su promedio");
        System.out.print("Nombre: ");
        String nombreNuevo = read.next();

        Iterator iterator = alumnos.iterator();

        for(Alumno al:alumnos){
            if(al.getNombre().equalsIgnoreCase(nombreNuevo)){
                System.out.println("El promedio de " + nombreNuevo + " es");
                System.out.println("Primedio: " + al.notaFinal());
            }
        }




    }
}