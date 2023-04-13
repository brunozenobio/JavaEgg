import Entidad.Fraccion;
import Servicio.FraccionServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Fraccion fraccion = new Fraccion();
        FraccionServicio fraccionServicio = new FraccionServicio();

        System.out.println("Usted tiene dos fracciones");
        fraccion = fraccionServicio.crearFraccion();
        System.out.println("Que desea hacer con etas?");

        int elecciones;

        do{
            System.out.println("MENU");
            System.out.println("1. Sumar fracciones");
            System.out.println("2. Restar fracciones");
            System.out.println("3. Multiplicar fracciones");
            System.out.println("4. Dividir fracciones");
            System.out.println("5.Salir del programa");
            elecciones = read.nextInt();
            switch (elecciones){
                case 1:
                    fraccionServicio.sumar(fraccion);
                break;
                case 2:
                    fraccionServicio.restar(fraccion);
                    break;
                case 3:
                    fraccionServicio.multiplicar(fraccion);
                    break;
                case 4:
                    fraccionServicio.dividir(fraccion);
                    break;
                case 5:
                    System.out.println("Programa Finalizado");
                    System.out.println("==================");



            }

        }while(elecciones == 1 || elecciones == 2 || elecciones == 3 || elecciones == 4);









    }
}