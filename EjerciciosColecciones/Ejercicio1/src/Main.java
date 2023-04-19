import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList<>();
        String eleccion;
        Scanner read = new Scanner(System.in).useDelimiter("\n");


       do {
           System.out.println("Desea ingresar una nueva raza de perro s/n?");
           eleccion = read.next();
           if(eleccion.equalsIgnoreCase("S")){
               System.out.print("Raza: ");
               razas.add(read.next());
           }
       }while(!eleccion.equalsIgnoreCase("n"));

       for(String raza:razas){
           System.out.println(raza);
       }
        Iterator iterator = razas.iterator();
        System.out.println("Ingrese una raza de perro");
        String razaNueva = read.next();

        while (iterator.hasNext()){
            if(iterator.next().equals(razaNueva)){
                iterator.remove();
                System.out.println("La raza se " + razaNueva +  " encuentra y se eliminara de la lista");
            }else{
                System.out.println("La raza se " + razaNueva +  " no se encontro");

            }

        }

        Collections.sort(razas);
        iterator = razas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }



    }
}