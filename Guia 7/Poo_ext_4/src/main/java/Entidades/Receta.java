/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author bruno
 */
public class Receta {
    private  String[] ingredientes;
    private int tiempoDeCoxion;

    public Receta() {
    }

    public Receta(String[] ingredientes, int tiempoDeCoxion) {
        this.ingredientes = ingredientes;
        this.tiempoDeCoxion = tiempoDeCoxion;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = new String[2];
        this.ingredientes = ingredientes;
    }

    public int getTiempoDeCoxion() {
        return tiempoDeCoxion;
    }

    public void setTiempoDeCoxion(int tiempoDeCoxion) {
        this.tiempoDeCoxion = tiempoDeCoxion;
    }

   
    
    
}
