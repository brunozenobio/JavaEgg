/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Juego {
    Scanner read = new Scanner(System.in);
    private boolean turnoJugador1;
    private int numeroIntentos;
    private int victoriasJug1,victoriasJug2;
    private int numeroAleatorio;

    public Juego() {
    }

    public Juego(boolean turnoJugador1, int numeroIntentos, int victoriasJug1, int victoriasJug2,int numeroAleatorio) {
        this.turnoJugador1 = turnoJugador1;
        this.numeroIntentos = numeroIntentos;
        this.victoriasJug1 = victoriasJug1;
        this.victoriasJug2 = victoriasJug2;
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
    
    
    public boolean isTurnoJugador1() {
        return turnoJugador1;
    }

    public void setTurnoJugador1(boolean turnoJugador1) {
        this.turnoJugador1 = turnoJugador1;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public int getVictoriasJug1() {
        return victoriasJug1;
    }

    public void setVictoriasJug1(int victoriasJug1) {
        this.victoriasJug1 = victoriasJug1;
    }

    public int getVictoriasJug2() {
        return victoriasJug2;
    }

    public void setVictoriasJug2(int victoriasJug2) {
        this.victoriasJug2 = victoriasJug2;
    }
    
    public void iniciar_juego(){
        turnoJugador1 = true;
        numeroIntentos = 5;
        System.out.println("======================");
        System.out.println("El juego ah iniciado");
        System.out.println("El jugador 1 ingresara un numero");
        System.out.println("El jugador 2 intentara adivinarlo");
        System.out.println("Jugador 2 usted tiene " + numeroIntentos + " intentos");
        System.out.println("======================");
        jugar(numeroIntentos);
    }
    public void jugar(int numeroIntentos){
        if(turnoJugador1){
            System.out.println("======================");
            System.out.println("Jugador 1 ingrese un numero");
            numeroAleatorio = read.nextInt();
            turnoJugador1 = false;
        }
        if(numeroIntentos != 0 ){
            System.out.println("======================");
            System.out.println("Jugador 2 ingrese un numero para adivinar");
            int numeroIng = read.nextInt();
            this.numeroIntentos--;
            comprobar(numeroIng);
        }else{
            System.out.println("======================");
            System.out.println("Jugador 2 se ah quedado sin intentos");
            System.out.println("El jugador 1 ah ganado");
            victoriasJug1++;
            System.out.println("Desean volver a jugar s/n");
            String volverAJugar = read.nextLine();
            if(volverAJugar.equalsIgnoreCase("s")){
                iniciar_juego();
            }else{
                System.out.println("El juego ah terminado y:");
                System.out.println("Jugador 1: " + victoriasJug1 + "victorias");
                 System.out.println("Jugador 1: " + victoriasJug2 + "victorias");
            }
        }
    }
    
    public void comprobar(int numeroIng){
        if(numeroIng == numeroAleatorio){
            System.out.println("======================");
            System.out.println("El jugador 2 ah ganado");
            victoriasJug2++;
            System.out.println("Desean volver a jugar s/n");
            String volverAJugar = read.next();
            if(volverAJugar.equalsIgnoreCase("s")){
                iniciar_juego();
            }else{
                System.out.println("El juego ah terminado y:");
                System.out.println("Jugador 1: " + victoriasJug1 + "victorias");
                 System.out.println("Jugador 1: " + victoriasJug2 + "victorias");
            }
        }else{
            if(numeroIng < numeroAleatorio){
                System.out.println("======================");
                System.out.println("Jugador 2 le quedan " + numeroIntentos + " intetos");
                System.out.println("Intente un numero mayor");
            }else{
                System.out.println("======================");
                System.out.println("Jugador 2 le quedan " + numeroIntentos + " intetos");
                System.out.println("Intente un numero menor");
            }
            jugar(numeroIntentos);
        }
    }

    
}
