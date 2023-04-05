    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Servicio;

    import Entidad.Cafetera;
    import java.util.Scanner;

    /**
     *
     * @author bruno
     */
    public class CafeteraServicio {
        private Scanner read = new Scanner(System.in);

        //METODO LLENAR CAFETERA
        public Cafetera llenarCafetera(){
            System.out.println("Ingrese la capacidad maxima de la cafetera");
            int capMax = read.nextInt();
            System.out.println("LLenando la cafetera....");
            System.out.println("La cafetera ahora tiene " + capMax + " mililitros de cafe");
            return new Cafetera(capMax,capMax);
        }

        //METODO SERVIR TAZA

        public Cafetera servirTaza(int capTaza,Cafetera caf1){
            System.out.println("La taza deseada tiene " + capTaza + " miliitros de capacidad");
            System.out.println("Se servira cafe en la taza");
            if(caf1.getCantidadActual() < capTaza){
                System.out.println("La cantidad actual de cafe es menor a la capacidad de la taza");
                System.out.println("Se ah servido la taza con " + caf1.getCantidadActual() + "mililitros");
            }else{
                System.out.println("Sirviendo taza......");
                System.out.println("La taza se ah llenado");
                caf1.setCantidadActual(caf1.getCantidadActual() - capTaza);

            }
            return caf1;
        }

        //METODO VACIAR CAFETERA

        public void vaciarCafetera(Cafetera caf){
            caf.setCantidadActual(0);
            System.out.println("Vaciando cafetera");
        }

        //METODO AGREGAR CAFETERA

        public void agregarCafe(Cafetera caf){

            System.out.println("Ingrese la cantidad de cafe a ingresar");
            int llenar = read.nextInt();

            if(llenar > caf.getCapacidadMaxima()){
                System.out.println("Usted esta ingresando mas cafe del cual puede ingresar a la cafetera");
                System.out.println("Por lo tanto esta se llenara");
                caf.setCantidadActual(caf.getCapacidadMaxima());
            }else if(llenar + caf.getCantidadActual() > caf.getCapacidadMaxima()){
                int agregar = caf.getCapacidadMaxima() - caf.getCantidadActual();
                System.out.println("La cafeteria ya disponia de cafe");
                System.out.println("por lo tanto solo se agregaran " + agregar + "mililitros para llenarla");
                caf.setCantidadActual(agregar);

            }else{
                System.out.println("Agregando cafe");
                caf.setCantidadActual(llenar);
                System.out.println("Se ah agregado correctamente ");
                System.out.println("Cantidad actual: " + caf.getCantidadActual());
            }
        }
    }
