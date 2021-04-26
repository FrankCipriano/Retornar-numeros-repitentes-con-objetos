package exam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Lista{
  private int value,valor,indice,indice1,i;
  public Lista(){
  }
  public Lista(int value){
    this.value=value;
  }
  public void setValue(int value){
    this.value=value;
  }
  public int getValue(){
    return value;
  }
  public void ingresar(ArrayList<Lista> arreglo){
  Scanner type = new Scanner(System.in);
   do{
     System.out.println("Ingrese un numero");
     valor = type.nextInt();
     Lista elemento = new Lista(valor);
     arreglo.add(elemento);
   }while(arreglo.size()<10);
  }
  //Metodo de ordenaamiento por Insercion
  public void ordenar(ArrayList<Lista> arreglo){
    Lista cero = new Lista(0);
    Lista j = new Lista();
    Lista aux = new Lista();
    Lista sw = new Lista();;
    Lista aux1 = new Lista();
    for(i=0;i<arreglo.size();i++){
      aux=arreglo.get(i);
      indice=i-1;
      j.setValue(indice);
      sw.setValue(0);
      while(sw.equal(cero)&&j.m_equal(cero)){
        aux1=arreglo.get(indice);
        if(aux.menor(aux1)){
          indice1=indice+1;
          arreglo.set(indice1,aux1);
          indice=indice-1;
          j.setValue(indice);
        }else{
          sw.setValue(1);
        }
      }
      indice1=indice+1;
      arreglo.set(indice1,aux);
    }
  }
  public void repetidos(ArrayList<Lista> arreglo){
  ArrayList<Lista> lista = new ArrayList();
  Lista repetido = new Lista();
   for(int i=0;i<arreglo.size();i++) {
     indice=i+1;
     if(indice<arreglo.size()){
       repetido = arreglo.get(indice);
       if(arreglo.get(i).equal(repetido)){
         lista.add(arreglo.get(i));
       }
     }
   }
   if(lista.size()>0){
     System.out.println("Numeros repitentes");
     repetido.mostrar(lista);
   }else{
     System.out.println("No existen numeros repitentes en la lista");
   }
  }
  public void mostrar(ArrayList<Lista> arreglo){
    for(int i=0;i<arreglo.size();i++){
      System.out.println(arreglo.get(i));
    }
  }
  public boolean menor(Lista c){
    if(this.value<c.getValue()){
      return true;
    }else{
      return false;
    }
  }
  public boolean equal(Lista a){
    if(this.value==a.getValue()){
      return true;
    }else{
      return false;
    }
  }
  public boolean m_equal(Lista b){
    if(this.value>=b.getValue()){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){
    return String.format("%s",this.value);
  }
}