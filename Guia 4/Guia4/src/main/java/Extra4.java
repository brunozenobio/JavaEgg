
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 *
 *
 *
 *
 *
 *
 *
 * @author bruno
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float[] promedio = new float[10];

        int tp1, tp2, int1, int2, cont = 0;
        float sum;
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.println("Ingrese la nota del primer trabajo practico");
            tp1 = read.nextInt();
            System.out.println("Ingrese la nota del segundo trabajo practico");
            tp2 = read.nextInt();
            System.out.println("Ingrese la nota del primer integrador");
            int1 = read.nextInt();
            System.out.println("Ingrese la nota del segundo integrador");
            int2 = read.nextInt();

            sum = (float) ((tp1 * 0.1 + tp2 * 0.15 + int1 * 0.25 + int2 * 0.5));
            promedio[i] = sum;
            if (promedio[i] >= 7) {
                cont++;

            }
        }
        System.out.println("La cantidad de alumnos aprobados es " + cont);
        System.out.println("Y la cantidad de desaprobados es " + (10 - cont));

    }

}
