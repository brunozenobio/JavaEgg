import Entidad.Fecha;

public class Main {
    public static void main(String[] args) {
        Fecha fechaactual = new Fecha();
        fechaactual.verificarAnio();
        fechaactual.mostrarDiaAnterior();
        fechaactual.mostrarDiaPosterior();
    }
}