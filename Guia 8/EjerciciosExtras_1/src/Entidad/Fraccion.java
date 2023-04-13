package Entidad;

public class Fraccion {
    private int numerador1,numerador2,denominador1,donominador2;

    public Fraccion() {
    }

    public Fraccion(int numerador1, int numerador2, int denominador1, int donominador2) {
        this.numerador1 = numerador1;
        this.numerador2 = numerador2;
        this.denominador1 = denominador1;
        this.donominador2 = donominador2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public int getDonominador2() {
        return donominador2;
    }

    public void setDonominador2(int donominador2) {
        this.donominador2 = donominador2;
    }
}
