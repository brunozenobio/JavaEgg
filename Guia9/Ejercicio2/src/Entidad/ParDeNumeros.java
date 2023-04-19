package Entidad;

public class ParDeNumeros {
    private double a;
    private double b;

    public ParDeNumeros() {
        a = Math.random() * 99;
        b = Math.random() * 99;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
