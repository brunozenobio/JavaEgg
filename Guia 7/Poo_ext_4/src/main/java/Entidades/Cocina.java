/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Cocina {
    private Receta receta1;
    private Receta receta2;

    public Cocina() {
    }

    public Cocina(Receta receta1, Receta receta2) {
        this.receta1 = receta1;
        this.receta2 = receta2;
    }

    public Receta getReceta1() {
        return receta1;
    }

    public void setReceta1(Receta receta1) {
        this.receta1 = receta1;
    }

    public Receta getReceta2() {
        return receta2;
    }

    public void setReceta2(Receta receta2) {
        this.receta2 = receta2;
    }
    
    public Receta agregarRecetas(){
        Receta receta3 = new Receta();
        
        receta3.setIngredientes(new String[]{"Huevo","harina"});
        return receta3;
    }
}
