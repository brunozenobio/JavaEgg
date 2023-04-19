import Services.CadenaService;
import Entidades.Cadena;
public class Main {
    public static void main(String[] args) {
        CadenaService cs = new CadenaService();
        Cadena cadena = cs.crearCadena();
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        //cs.vecesRepetido(cadena);
        cs.compararLongitud(cadena);
        cs.unirFrase(cadena);
        cs.remplazar(cadena);
        boolean contiene = cs.contine(cadena);
        if(contiene){
            System.out.println("Si contiene");
        }else {
            System.out.println("No contiene");
        }






    }
}