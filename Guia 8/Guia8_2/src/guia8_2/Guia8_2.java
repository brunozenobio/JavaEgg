/*

 */
package guia8_2;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author bruno
 */
public class Guia8_2 {

    public static void main(String[] args) {
        CafeteraServicio cafS = new CafeteraServicio();
        Cafetera cafetera = cafS.llenarCafetera();
        cafS.servirTaza(200, cafetera);
        cafS.vaciarCafetera(cafetera);
        cafS.agregarCafe(cafetera);
        
    }
    
}
