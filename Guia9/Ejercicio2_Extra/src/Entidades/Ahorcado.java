package Entidades;

import java.util.Arrays;

public class Ahorcado {
    String[] palabra;
    int cantidadLetras;
    int cantidadDeJugadas;

    int letrasRestantes;
    private boolean ganador ;

    public Ahorcado() {

    }

    public Ahorcado(String[] palabra, int cantidadLetras, int cantidadDeJugadas,int letrasRestantes) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.cantidadDeJugadas = cantidadDeJugadas;
        this.letrasRestantes = letrasRestantes;

    }

    public boolean getGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadDeJugadas() {
        return cantidadDeJugadas;
    }

    public void setCantidadDeJugadas(int cantidadDeJugadas) {
        this.cantidadDeJugadas = cantidadDeJugadas;
    }

    public int getLetrasRestantes() {
        return letrasRestantes;
    }

    public void setLetrasRestantes(int letrasRestantes) {
        this.letrasRestantes = letrasRestantes;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabra=" + Arrays.toString(palabra) +
                ", cantidadLetras=" + cantidadLetras +
                ", cantidadDeJugadas=" + cantidadDeJugadas +
                '}';
    }
}
