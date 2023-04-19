import Entidades.Persona;
import Service.PersonaService;

public class Main {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        System.out.println("Edad " + ps.calcularEdad(persona));
        if(ps.menorQue(persona,32)){
            System.out.println("Tiene menos edad que la ingresada");
        }else{
            System.out.println("Tiene mas edad que la ingresada");
        }
        ps.mostarPersona(persona);
    }
}