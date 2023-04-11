package Entidad;

public class NIF {
    private long numDni;
    private char nifC;

    public NIF() {
    }

    public NIF(long numDni, char nifC) {
        this.numDni = numDni;
        this.nifC = nifC;
    }

    public long getNumDni() {
        return numDni;
    }

    public void setNumDni(long numDni) {
        this.numDni = numDni;
    }

    public char getNifC() {
        return nifC;
    }

    public void setNifC(char nifC) {
        this.nifC = nifC;
    }
}
