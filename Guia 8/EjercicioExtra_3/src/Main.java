import Entidad.Pass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Pass usuario = new Pass("bruno1231.","Bruno",40613855);
        int eleccion;
        do{
            System.out.println("MENU");
            System.out.println("1.Crear contraseña");
            System.out.println("2.NIVEL DE SEGURIDAD DE LA CONTRASEÑA");
            System.out.println("3.Modificar nombre");
            System.out.println("4.Modificar DNI");
            System.out.println("5. SALIR");
            eleccion = read.nextInt();
            switch (eleccion){
                case 1:
                    usuario.crearPass();
                    break;
                case 2:
                    usuario.analizarPass();
                    break;
                case 3:
                    usuario.cambiarNombre();
                    break;
                case 4:
                    usuario.cambiarDNI();
                    break;
                case 5:
                    System.out.println("PROGRAMA FINALIZADO");
            }
        }while(eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4);

    }
}