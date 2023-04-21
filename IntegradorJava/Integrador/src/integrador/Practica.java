package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practica {

    
//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
     
    public Boolean numeroCapicua(Integer num) {
        if(num == null){
            return false;
        }
  
        num = Math.abs(num);
        String numeroString = num.toString();
        boolean esCapicua = true;
        
        for (int i = 0; i < numeroString.length() / 2; i++) {
            if(numeroString.charAt(i) != numeroString.charAt(numeroString.length() - i - 1)){
                
              esCapicua = false;
                break;
                }
              
        }
        
        return esCapicua;
    }

    
//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
     
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        //Aca escribir la logica necesaria
        
        int resto = cantidadCaramelos % cantidadLadrones;
        int resto1 = (resto + inicio - 1) % cantidadLadrones ;
        if(cantidadCaramelos < cantidadLadrones){
            return cantidadCaramelos + inicio - cantidadLadrones - 1;
        }else if(cantidadCaramelos > cantidadLadrones){
            return (resto1);
        }else{
            return cantidadLadrones -1 + inicio;
        }
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
    
    public List<String> mediasAmigas(List<String> pasajeros) {
        //Aca escribir la logica necesaria
        List<String> mediasConPares = new ArrayList();
        int contador = 0;
        Collections.sort(pasajeros);
        
        String elementoAnterior = pasajeros.get(0);
        
        for (int i = 1; i < pasajeros.size(); i++) {
            if(pasajeros.get(i).equals(elementoAnterior) && contador < 1){
                mediasConPares.add(elementoAnterior);
                elementoAnterior = pasajeros.get(i);
                contador++;
                
            }else{
                elementoAnterior = pasajeros.get(i);
                contador = 0;
            }
            
            
        }
        
        
        
        
        return mediasConPares;
    }
}
