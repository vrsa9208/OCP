package Chapter_1.ListasOrdenadas;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.sort;

public class Main{

  public static void main(String[] args) {
      System.out.println("Listas Ordenadas");

      List<String> listaDesordenada = new ArrayList<String>();

      listaDesordenada.add("Perro");
      listaDesordenada.add("Gato");
      listaDesordenada.add("Antilope");

      System.out.println("Lista desordenada: ");
      System.out.println(listaDesordenada);

      sort(listaDesordenada);   //Trabaja sobre la referencia, por tanto afecta directamente a la lista.

      System.out.println("Lista ordenada: ");
      System.out.println(listaDesordenada);
  }
}