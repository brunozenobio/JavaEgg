package Service;

import Entidad.Curso;

import java.util.Scanner;

public class CursoService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    public String[] cargarAlumno(){
        String nombre;
        String[] aux = new String[5];
        for (int i = 0;i<aux.length;i++){
            System.out.println("Ingrese el nombre del " + (i + 1) + " alumno");
            nombre = read.next();
            aux[i] = nombre;
        }
        return aux;
    }
    public Curso crearCurso(){
        Curso c = new Curso();
        System.out.println("Se esta creando un nuevo curso");
        System.out.print("Nombre del curso: ");
        c.setNombreurso(read.next());
        System.out.print("Cantidad de Horas por dia: ");
        c.setCantidadHorasPorDia(read.nextInt());
        System.out.print("Cantidad de dias por semana: ");
        c.setCantidadDiasPorSemana(read.nextInt());
        System.out.print("Turno: ");
        c.setTurno(read.next());
        System.out.print("Precio por hora: ");
        c.setPrecioPorHora(read.nextInt());
        System.out.println("Ahora los alumnos que participan");
        c.setAlumnos(cargarAlumno());
        return c;
    }

    public  void calcularGanaciaSemanal(Curso c){
        System.out.println("Las ganancias seran de");
        System.out.println(c.getCantidadDiasPorSemana() * c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length);
    }
}
