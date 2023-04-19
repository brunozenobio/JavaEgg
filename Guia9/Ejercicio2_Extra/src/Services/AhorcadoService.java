package Services;

import Entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego(){
        Ahorcado juego = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar");
        System.out.print("Palabra: ");
        String palabra = read.next();
        System.out.println("Ahora ingrese la cantidad de jugadas");
        System.out.print("Cantidad jugadas: ");
        juego.setCantidadDeJugadas( read.nextInt());
        juego.setCantidadLetras(palabra.length());
        String[] arrayPal = new String[palabra.length()];
        juego.setLetrasRestantes(juego.getCantidadLetras());
       for(int i = 0;i<palabra.length();i++){
          arrayPal[i]=palabra.substring(i,i+1);

       }
       juego.setPalabra(arrayPal);

    return juego;
    }

    public void longitud(Ahorcado ahorcado){
        System.out.println("La longitud de la palabra es: " + ahorcado.getPalabra().length);
    }

    public void buscar(Ahorcado ahorcado){
        System.out.println("Ingrese una letra para buscar en la palabra");
        System.out.print("Letra: ");
        String letra = read.next();
        Boolean confirmarPalabra = false;
        for(String pal:ahorcado.getPalabra()){
            if(pal.equalsIgnoreCase(letra)){
                confirmarPalabra = true;
            }
        }
        if(confirmarPalabra){
            System.out.println("La letra estaba en la palabra buscada");
        }else{
            System.out.println("La letra no estaba en la palabra");
        }


    }

    public void encontradas(Ahorcado ahorcado){
        System.out.println("Ingrese una letra para para empezar a buscar");
        System.out.print("Letra: ");
        String letra = read.next();
        boolean seEncontraron = false;
        int letrasRestantes = ahorcado.getCantidadLetras();
        int contadorEncontradas = 0;
        int cantidadIntentos = ahorcado.getCantidadDeJugadas();

        for(String pal:ahorcado.getPalabra()){
            if(pal.equalsIgnoreCase(letra)){
                contadorEncontradas++;
                ahorcado.setLetrasRestantes(ahorcado.getLetrasRestantes() - 1);
                seEncontraron = true;
            }
        }

        if(!seEncontraron){
            cantidadIntentos--;
            ahorcado.setCantidadDeJugadas(cantidadIntentos);
        }


        System.out.println("Se han encontrado " + contadorEncontradas + " letras, y le faltan " + ahorcado.getLetrasRestantes()  + " letras");



    }

    public void intentos(Ahorcado ahorcado){
        System.out.println("Le quedan: " + ahorcado.getCantidadDeJugadas() + " intentos");
    }

    public  void juego(Ahorcado ahorcado){
        ahorcado.setGanador(false);
        do{
            encontradas(ahorcado);
            intentos(ahorcado);
            if(ahorcado.getLetrasRestantes() == 0){
                ahorcado.setGanador(true);
            }
        }while(ahorcado.getCantidadDeJugadas() !=0 && !ahorcado.getGanador());

        if(ahorcado.getGanador()){
            System.out.println("Usted ah gando el juego");
            System.out.println("==============El juego ah finalizado==============");
        }else{
            System.out.println("Usted a perdido");
            System.out.println("==============El juego ah finalizado==============");
        }






    }




}
