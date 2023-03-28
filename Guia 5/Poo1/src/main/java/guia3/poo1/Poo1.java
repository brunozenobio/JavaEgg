/*Crear una clase llamada Libro que contenga los 
siguientes atributos: ISBN, Título, Autor, Número de páginas,
y un constructor con todos los atributos pasados por parámetro y 
un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package guia3.poo1;

import Entidad.Libro;

        



/**
 *
 * @author bruno
 */
public class Poo1 {

    public static void main(String[] args){
        Libro libro1 = new Libro();

        libro1.setTitulo("titulo del libro");
        libro1.setAutor("Juan cruz");
        libro1.setNumeroPag(345);
        libro1.setIsbn(15545345);
        
        System.out.println("Autor : " + libro1.getAutor() + "\n Titulo: " + libro1.getTitulo() + "\n Numero de paginas : " + libro1.getNumeroPag());
        System.out.println("Isbn: " + libro1.getIsbn());
   
    
    }
}
