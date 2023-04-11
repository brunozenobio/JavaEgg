package Servicio;

import Entidad.NIF;

import java.util.Scanner;

public class NIFService {
    private Scanner read = new Scanner(System.in);
    public NIF crearNif(){

        NIF numNif = new NIF();
        char nif;
        int valr;
        System.out.println("Ingrese su numero de dni");
        long numeroDni = read.nextLong();
        valr = Math.toIntExact(numeroDni % 23);

        char[] arrayPos = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        nif = arrayPos[valr];


        return new NIF(numeroDni,nif);


    }

    public void mostrar(NIF numNIf){

        System.out.println("NIF: " + numNIf.getNumDni() + "-" + numNIf.getNifC());
    }

}
