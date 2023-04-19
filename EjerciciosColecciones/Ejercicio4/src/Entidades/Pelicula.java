package Entidades;

public class Pelicula {
    private String titulo;
    private String directo;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String directo, double duracion) {
        this.titulo = titulo;
        this.directo = directo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirecto() {
        return directo;
    }

    public void setDirecto(String directo) {
        this.directo = directo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", directo='" + directo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
