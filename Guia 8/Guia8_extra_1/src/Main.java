import Entidad.Raices;
import Servicio.RaicesServicio;

public class Main {
    public static void main(String[] args) {
        Raices cuadratic1 = new Raices(3,5,1);
        RaicesServicio r1 = new RaicesServicio();

        System.out.println("Discriminante: " + r1.getDiscriminante(cuadratic1));
        r1.calcular(cuadratic1);





    }
}