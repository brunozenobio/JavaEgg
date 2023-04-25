import Entidad.Curso;
import Service.CursoService;

public class Main {
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso curso = cs.crearCurso();
        cs.calcularGanaciaSemanal(curso);

    }
}