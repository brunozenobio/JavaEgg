import Entidad.ParDeNumeros;
import Service.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {
        ParDeNumerosService ps = new ParDeNumerosService();
        ParDeNumeros pn = new ParDeNumeros();

        ps.mostrarValores(pn);
        ps.devolverMayor(pn);
        ps.calcularPotencia(pn);
        ps.calcularRaiz(pn);

    }
}