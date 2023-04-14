package Entidad;

import java.util.Scanner;

public class Fecha {
    private int dia=1,mes=1,anio=1900;
    private Scanner read = new Scanner(System.in);

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void verificarAnio(){
        System.out.println("Ingrese una fecha");
        System.out.print("Dia: ");
        int dia = read.nextInt();
        System.out.print("Mes: ");
        int mes = read.nextInt();
        System.out.print("Año: ");
        int anio = read.nextInt();

        if(anio >=1900 || anio <= 2021){
            System.out.println("La fehca es correcta");
            this.anio = anio;
            this.mes = mes;
            this.dia = mes;
        }else{
            System.out.println("Fecha incorrecta se tendran los valores por defecto");
        }

    }

    public void cantidadDias(){
        switch (mes){
            case 2:
                System.out.println("Tiene 28 dias");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("Tiene 31 dias");
                break;
            case 4,6,9,11:
                System.out.println("Tiene 30 dias");
                break;

        }
    }
    public void mostrarDiaAnterior(){

        if(mes == 1 && dia == 1){
            System.out.println("Dia anterior");
            System.out.println("31 de diciembre de " + anio--);
        } else if (dia == 1) {
            switch (mes){
                case 3:
                   if(verificarBisiesto()){
                       System.out.println("El dia anterior es 29 de febrero");
                   }else{
                       System.out.println("El dia anterior es 28 de frebrero");
                   }
                    break;
                case 2,4,6,9,11:
                    System.out.println("Dia anterior 31 del mes " + mes--);
                    break;
                case 5,7,8,10,12:
                    System.out.println("Dia anterior 30 del mes " + mes--);
                    break;
            }

        }else{
            System.out.println("Dia anterior  es + " + dia-- + "del mes " + mes);
        }


    }

    public void mostrarDiaPosterior(){
        switch (mes){
            case 2:
                if(dia == 29 || dia == 28){
                    System.out.println("El dia posterior es 1 de marzo");
                }else{
                    System.out.println("El dia posterior es " + dia++ + "de febrero");
                }
                break;
            case 3,5,7,8,10:
                if(dia == 31){
                    System.out.println("El dia posterior es 1 del mes "  + mes++) ;
                }else{
                    System.out.println("El dia posterior es " + dia++ + "del mes " + mes) ;
                }
                break;
            case 4,6,9:
                if(dia == 30){
                    System.out.println("El dia posterior es 1 del mes "  + mes++) ;
                }else{
                    System.out.println("El dia posterior es " + dia++ + "del mes " + mes) ;
                }
                break;
            case 12:
                    System.out.println("El dia posterior es 1 de enero de " + anio ++) ;
                    break;

        }
    }
    public boolean verificarBisiesto(){
        if(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)){
            return true;
        } else if (anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) {
            return true;

        }else{
            return  false;
        }
    }
}
