import Entidad.ParDeNumeros;
import Service.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {

        ParDeNumeros pn = new ParDeNumeros();
        ParDeNumerosService.mostrarValores(pn);
        ParDeNumerosService.devolverMayor(pn);
        ParDeNumerosService.calcularPotencia(pn);
        ParDeNumerosService.calcularRaiz(pn);

    }
}