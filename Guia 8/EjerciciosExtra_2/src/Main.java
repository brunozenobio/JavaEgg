import Entidad.Tiempo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese horas minutos y segundos");
        System.out.print("Hora: ");
        int hora = read.nextInt();
        System.out.print("Minutos: ");
        int minutos = read.nextInt();
        System.out.print("Segundos: ");
        int segundos = read.nextInt();
        Tiempo tiempoActual = new Tiempo(hora,minutos,segundos);

        int cont = 0;

        while(cont < 400){
            if (segundos >59){
                segundos = 0;
            }else{
                segundos++;
            }
            tiempoActual.verificarHora(hora,minutos, segundos);
            tiempoActual.imprimirHoraCompleta();
            cont++;
        }


    }


}