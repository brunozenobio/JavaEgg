package Service;

import Entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    private Scanner read = new Scanner(System.in);

    public Persona crearPersona(){
        Persona p = new Persona();
        Date fechaNacimineto = new Date();
        System.out.print("Ingrese su nombre");
        p.setNombre(read.next());
        System.out.println("Ingre su fecha de nacimineto");
        System.out.print("Dia: ");
        fechaNacimineto.setDate(read.nextInt());
        System.out.print("Mes: ");
        fechaNacimineto.setMonth(read.nextInt() - 1);
        System.out.print("Año: ");
        fechaNacimineto.setYear(read.nextInt() - 1900);
        p.setFechaDeNacimiento(fechaNacimineto);
        return p;


    }

    public int calcularEdad(Persona p1){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - p1.getFechaDeNacimiento().getYear();
        if(fechaActual.getMonth() > p1.getFechaDeNacimiento().getMonth()){
            edad--;
        }else if(fechaActual.getMonth() == p1.getFechaDeNacimiento().getMonth() && fechaActual.getDate() < p1.getFechaDeNacimiento().getDate()) {
            edad--;
        }


        return edad;
    }

    public boolean menorQue(Persona p1,int edad){
        if(calcularEdad(p1)<edad){
            return true;
        }else{
            return false;
        }

    }

    public void mostarPersona(Persona p1){
        System.out.println(p1);
    }

}
