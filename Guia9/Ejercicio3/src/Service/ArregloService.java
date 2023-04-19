package Service;

import java.util.Arrays;

public class ArregloService {

    public void inicializarA(double[] arrayA){
        for (int i = 0;i < arrayA.length;i++){
            arrayA[i] = (Math.random() * 100);
        }
    }
    public void mostrar(double[] Array){
        System.out.print("A = ");
        for (double var:Array){
            System.out.print("[" + var + "]");
        }
        System.out.println("");
    }

    public void ordenar(double[] Array){
        Arrays.sort(Array);
        for (int i = 0; i < Array.length / 2; i++) {
            double temp = Array[i];
            Array[i] = Array[Array.length - 1 - i];
            Array[Array.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] A,double[] B){
        for(int i = 0;i<10;i++){
            B[i] = A[i];
        }
        Arrays.fill(B,10,B.length,.5);

    }











}
