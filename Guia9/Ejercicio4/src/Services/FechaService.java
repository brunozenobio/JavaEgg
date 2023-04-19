package Services;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    private Scanner read = new Scanner(System.in);
    public Date fechaNacimiento(){
        System.out.print("Ingrese su dia de nacimiento");
        int dia = read.nextInt();
        System.out.print("Ahora su mes de nacimiento");
        int mes = read.nextInt();
        System.out.print("Ahora su año de nacimiento");
        int anio = read.nextInt();
        return new Date(anio - 1900,dia - 1,mes);
    }

    public Date fechaActual(){
        return new Date();
    }

    public void diferencia(Date fA,Date Nac){
        System.out.print("La edad es: ");
        System.out.println(fA.getYear() - Nac.getYear());


    }
}
