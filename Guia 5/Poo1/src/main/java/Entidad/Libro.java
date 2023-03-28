/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*Crear una clase llamada Libro que contenga los 
siguientes atributos: ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y 
un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class Libro {
    
    public String titulo,autor;
    public int numeroPag,isbn;
    
    public Libro() {
    }

    public Libro(String titulo, String autor, int isbn, int numeroPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPag = numeroPag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public int getIsbn() {
        return isbn;
    }
    
    
    
    
    
    
    
    
    
}
