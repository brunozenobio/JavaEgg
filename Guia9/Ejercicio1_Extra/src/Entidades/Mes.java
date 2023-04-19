package Entidades;

public class Mes {
    private String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","nobiembre","diciembre"};
    private String mesSecreto;

    public Mes() {
        mesSecreto = mes[(int) (Math.random()*12)];
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
