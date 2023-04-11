import Entidad.NIF;
import Servicio.NIFService;

public class Main {
    public static void main(String[] args) {
        NIF nuevoNif = new NIF();
        NIFService nuevoNifSer = new NIFService();
        nuevoNif = nuevoNifSer.crearNif();
        nuevoNifSer.mostrar(nuevoNif);
    }
}