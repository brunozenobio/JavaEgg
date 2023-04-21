package Services;

import Entidades.Cadena;

import java.util.Scanner;

public class CadenaService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");


    public Cadena crearCadena(){
        Cadena c1 = new Cadena();
        System.out.print("Ingrese una cadea: ");
        String frase = read.nextLine();
        return new Cadena(frase);
    }
    public void mostrarVocales(Cadena c1){
        int contadorVocales = 0;
        String vocales = "aeiouAEIOU";
        for (char letra: c1.getFrase().toCharArray()) {
            if (vocales.contains(String.valueOf(letra))) {
                contadorVocales++;
            }
        }
        System.out.println("La frase " + c1.getFrase() + " tiene " + contadorVocales + " vocales");

    }

    public void invertirFrase(Cadena c1){
        String invFrase = "";
        for (int i = c1.getLongitudFrase() - 1; i >= 0; i--){
            invFrase += c1.getFrase().substring(i,i+1);
        }
        System.out.println(invFrase);
    }

    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrese un caracter y se buscara la veces que se repite en la frase '" + c1.getFrase() + "'");
        String c = read.next();
        int contadorRepetido = 0;
        for(String letra:c1.getFrase().split("")){
            if (letra.equals(c)){
                contadorRepetido++;
            }
        }
        System.out.println("El caracter " + c + "se ah repetido " + contadorRepetido + " veces");
    }

    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese una frase y se comparara su longitud con " + c1.getFrase() );
        String frase = read.next();
        System.out.println(c1.getLongitudFrase() + " " + frase.length());
        if (c1.getLongitudFrase() == frase.length()){
            System.out.println("Las longitudes son iguales");
        }else{
            System.out.println("Las longitudes no son iguales");
        }

    }

    public void unirFrase(Cadena c1){
        System.out.println("Ingrese una frase y se unira a la frase " + c1.getFrase()) ;
        String frase = read.next();
        String frase1 = c1.getFrase().concat(" ");
        String frase2 = frase1.concat(frase);

        System.out.println(frase2);

    }
    public void remplazar( Cadena c1){
        System.out.println("Ingrese un caracter para remplazar por las letras a en " + c1.getFrase());
        String letra = read.next();
        String fraseNueva = c1.getFrase().replace("a",letra);
        System.out.println(fraseNueva);

    }

    public Boolean contine(Cadena c1){
        System.out.println("Ingrese un caracter para verificar su existencia en la frase");
        String letra = read.next();
        return c1.getFrase().contains(letra);

    }


}
