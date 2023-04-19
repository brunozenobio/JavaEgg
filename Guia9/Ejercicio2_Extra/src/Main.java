import Entidades.Ahorcado;
import Services.AhorcadoService;

public class Main {
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado ahorcado = as.crearJuego();
        System.out.println(ahorcado);
        as.juego(ahorcado);

    }
}