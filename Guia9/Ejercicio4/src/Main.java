import Services.FechaService;

public class Main {
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        System.out.println("Edad = " + fs.diferencia(fs.fechaActual(),fs.fechaNacimiento()));
    }
}