package Entidad;

public class Triangulo {
        private double ladoa,ladob,altura;

    public Triangulo() {
    }

    public Triangulo(double ladoa, double ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double encontrarAltura(){
        return altura = Math.pow(Math.pow(ladoa,2) - Math.pow(ladob / 2,2),0.5);
    }

    public double cacularArea(){
        encontrarAltura();
        return ladob * altura / 2;
    }

    public double calcularPerimetro(){
       return 2 * ladoa + ladob;
    }


}
