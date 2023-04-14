import Entidad.Triangulo;
import Servicio.TrianguloServicio;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4,5);
        Triangulo t2 = new Triangulo(8,7);
        Triangulo t3 = new Triangulo(1,9);
        Triangulo t4 = new Triangulo(2,5);
        TrianguloServicio tServicio = new TrianguloServicio();

        tServicio.mayorArea(t1,t2,t3,t4);

    }
}