package Service;

import Entidad.Estudiante;

import java.util.Scanner;

public class EstudianteServicio {
    private Scanner read = new Scanner(System.in);

    public Estudiante crearEstudiante(){
        System.out.println("Ingrese el nombre del estudiante");
        System.out.print("Nombre: ");
        String nombre = read.next();
        System.out.println("Ahora ingrese la nota del estudiante");
        System.out.print("Nota: ");
        double nota = read.nextDouble();
        return new Estudiante(nombre,nota);
    }

    public Estudiante[] listEstudiante(){
        Estudiante[] estudArray = new Estudiante[3];
        for (int i = 0; i < estudArray.length; i++) {
            estudArray[i] = crearEstudiante();
        }
        return estudArray;
    }

    public double calcularPromedio(Estudiante[] arrayProm){
        double suma = 0;

        for(Estudiante est:arrayProm){
            suma += est.getNota();
        }
        System.out.println("El promedio de todas las notas es: " + suma/arrayProm.length );
        return suma/arrayProm.length;
    }

    public String[] nombresArray(Estudiante[] arrayNombre){
        int longitudMayProm = 0;
        double promedio = calcularPromedio(arrayNombre);
        for(Estudiante est: arrayNombre){
            if(est.getNota() > promedio){
                longitudMayProm++;
            }
        }

        String[] estuNotMay = new String[longitudMayProm];
        int k = 0;

        for (int i = 0; i < arrayNombre.length; i++) {
            if(arrayNombre[i].getNota() > promedio){
                estuNotMay[k] = arrayNombre[i].getNombre();
                k++;
            }
        }
        return estuNotMay;



    }
    public void mostrarNotMayor(String[] nomNots){

        System.out.println("Los alumnos con nota mayor al promedio son " + nomNots.length);
        for(String nombre:nomNots){
            System.out.println("Alumno: " + nombre);
        }

    }

}
