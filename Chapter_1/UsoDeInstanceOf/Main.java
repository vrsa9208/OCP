package Chapter_1.UsoDeInstanceOf;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Uso de instanceof");

        List<String> arrayList = new ArrayList<String>();
        List<String> linkedList = new LinkedList<String>();

        System.out.println("Comprobando la variable arrayList");
        comprobarTipoDeLista(arrayList);

        System.out.println("Comprobando la variable linkedList");        
        comprobarTipoDeLista(linkedList);

        System.out.println("Comprobando un valor nulo");        
        comprobarTipoDeLista(null);
    }

    public static void comprobarTipoDeLista(List lista){
        if(lista instanceof ArrayList){
            System.out.println("Es de tipo ArrayList");
        }
        else if(lista instanceof LinkedList){
            System.out.println("Es de tipo LinkedList");
        }
        else {
            System.out.println("Se desconoce el tipo");
        }
    }
}