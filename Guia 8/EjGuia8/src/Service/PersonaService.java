
package Service;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    public void crearPersona(Persona persona){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        persona.setNombre(read.nextLine());
        System.out.println("Nombre: " + persona.getNombre());
    }
}
