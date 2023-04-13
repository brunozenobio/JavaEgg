import Entidad.Pass;

public class Main {
    public static void main(String[] args) {
        Pass usuario = new Pass("bruno1231.","Bruno",40613855);
        usuario.cambiarDNI();
        usuario.crearPass();
        usuario.cambiarNombre();

    }
}