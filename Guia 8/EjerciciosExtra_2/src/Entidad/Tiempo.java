package Entidad;

public class Tiempo {
    private int hora,minuto,segundo;

    public Tiempo() {
    }

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void verificarHora(int hora, int minuto,int segundo){
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }

        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
            this.hora++;
        }

        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
            this.minuto ++;
        }

    }

    public void imprimirHoraCompleta(){
        System.out.println("Horario : " + this.hora + "h : " + this.minuto + "m : " + this.segundo + "s");

    }
}
