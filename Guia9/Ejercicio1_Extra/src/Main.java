import Entidades.Mes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Mes mes = new Mes();
        String mesopcion;

        do{
            System.out.println("Ingrese un mes del año");
            System.out.print("Mes: ");
            mesopcion = read.next();

        }while(!mes.getMesSecreto().equalsIgnoreCase(mesopcion));
        System.out.println("Felicidades a adivinado");

    }
}