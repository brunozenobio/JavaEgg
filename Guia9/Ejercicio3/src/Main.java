import Service.ArregloService;

public class Main {
    public static void main(String[] args) {
        double[] A = new double[50];
        double [] B = new double[20];

        ArregloService as = new ArregloService();

        as.inicializarA(A);
        as.mostrar(A);
        as.ordenar(A);
        as.mostrar(A);
        as.inicializarB(A,B);
        as.mostrar(B);




    }
}