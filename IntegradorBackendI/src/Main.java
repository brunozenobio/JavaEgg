import Entidad.Estudiante;
import Service.EstudianteServicio;

public class Main {
    public static void main(String[] args) {
        EstudianteServicio eServs = new EstudianteServicio();
        Estudiante[] listAlumnos = eServs.listEstudiante();
        String[] nomNotMay = eServs.nombresArray(listAlumnos);
        eServs.mostrarNotMayor(nomNotMay);
    }
}