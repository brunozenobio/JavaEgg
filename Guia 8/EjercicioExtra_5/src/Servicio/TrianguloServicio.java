package Servicio;

import Entidad.Triangulo;

public class TrianguloServicio {


    public void mayorArea(Triangulo t1, Triangulo t2, Triangulo t3, Triangulo t4){
        Triangulo[] arreglo ={t1,t2,t3,t3};
        double max = t1.cacularArea();
        int indicemax = 0;

        for (int i = 1; i < 3;i++) {
            if(arreglo[i].cacularArea()>max){
                max = arreglo[i].cacularArea();
                indicemax = i;
            }
        }
        System.out.println("El triangulo de mayor area tiene");
        System.out.println("base: " + arreglo[indicemax].getLadob());
        System.out.println("lados iguales: " + arreglo[indicemax].getLadoa());
        System.out.println("altura: " + arreglo[indicemax].getAltura());
        System.out.println("perimetro: " + arreglo[indicemax].calcularPerimetro());
        System.out.println("Area: " + arreglo[indicemax].cacularArea());

    }
}
