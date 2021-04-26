//2.	Realice una función que retorne los números que repiten dentro de una lista recibida de números enteros

package exam2;

import java.util.ArrayList;
import java.util.Collection;

public class ListaMain{
  public static void main(String args[]){
    ArrayList<Lista> vector = new ArrayList();
    Lista lista = new Lista();
    lista.ingresar(vector);
    lista.ordenar(vector);
    System.out.println("Lista ordenada");
    lista.mostrar(vector);
    lista.repetidos(vector);
  }
}
