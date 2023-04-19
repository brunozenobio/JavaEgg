package Entidades;

public class Cadena {

    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        longitudFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }


}
