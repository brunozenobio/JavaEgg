package Entidad;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pass {
    private String pass,nombre;
    private int dni;
    private Scanner read = new Scanner(System.in);



    public Pass() {
    }

    public Pass(String pass, String nombre, int dni) {
        if(pass.length() == 10){
            this.pass = pass;
        }else{
            System.out.println("La contraseña ingresada es incorrecta");
        }
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void crearPass(){
        System.out.println("Ingrese una nueva contraseña");

        do{
            System.out.print("Contraseña nueva: ");
            String pass = read.next();
            if(pass.length() == 10){
                this.pass = pass;
            }else{
                System.out.println("La contraseña no tiene el formato correcto,vuelva a intentarlo");
            }
        }while(pass.length() != 10);
    }
    public  void analizarPass(){
        int contadorz = 0;
        int contadora = 0;
        for(char c: pass.toCharArray()){
            if(c == 'z'){
                contadorz++;
            }else if(c == 'a'){
                contadora++;
            }else{

            }
        }
        if(contadorz > 0 && contadora > 1){
            System.out.println("NIVEL ALTO");
        }else if(contadorz > 0 && contadora <= 1){
            System.out.println("NIVEL MEDIO");
        }else{
            System.out.println("NIVEL BAJO");
        }

    }

    public void cambiarDNI(){
        System.out.println("Cambiar DNI: ");
        System.out.println("Ingrese su contraseña: ");
        String pass;
        do{
            pass = read.next();

        }while (!this.pass.equals(pass));
        System.out.println("Ingrese el DNI");
        this.nombre = read.next();
    }
    public void cambiarNombre(){
        System.out.println("Cambiar nombre: ");
        System.out.println("Ingrese su contraseña: ");
        String pass;
        do{
            pass = read.next();

        }while (!this.pass.equals(pass));
        System.out.println("Ingrese el nombre: ");
        this.nombre = read.next();
    }
}
