import Services.FechaService;

public class Main {
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        fs.diferencia(fs.fechaActual(),fs.fechaNacimiento());
    }
}