package Entidad;

import java.util.Scanner;

public class Curso {
    private String nombreurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Curso() {
    }

    public Curso(String nombreurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreurso = nombreurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;

    }

    public String getNombreurso() {
        return nombreurso;
    }

    public void setNombreurso(String nombreurso) {
        this.nombreurso = nombreurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumno(){
        String nombre;
        for (int i = 0;i<alumnos.length;i++){
            System.out.println("Ingrese el nombre del " + (i + 1) + " alumno");
            nombre = read.next();
            alumnos[i] = nombre;
        }
    }
    public void crearCurso(){
        System.out.println("Se esta creando un nuevo curso");
        System.out.print("Nombre del curso: ");
        setNombreurso(read.next());
        System.out.print("Cantidad de Horas por dia: ");
        setCantidadHorasPorDia(read.nextInt());
        System.out.print("Cantidad de dias por semana: ");
        setCantidadDiasPorSemana(read.nextInt());
        System.out.print("Turno: ");
        setTurno(read.next());
        System.out.print("Precio por hora: ");
        setPrecioPorHora(read.nextInt());
        System.out.println("Ahora los alumnos que participan");
        cargarAlumno();
    }

    public  void calcularGanaciaSemanal(){
        System.out.println("Las ganancias seran de");
        System.out.println(cantidadDiasPorSemana * cantidadHorasPorDia * precioPorHora * alumnos.length);
    }
}