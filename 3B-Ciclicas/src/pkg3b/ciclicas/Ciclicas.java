/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3b.ciclicas;

/**
 *
 * @author jjqoj
 */
public class Ciclicas {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        //Problema 1: Imprimir un listado con los numeros del 1 al 100 cada uno con su
       //respectivo cuadrado.
      int[] x= new int[100];
        
     System.out.println("Ejercicio 1");
      for(int i=1;i<=100;i++)
      {x[i-1]=i;
      System.out.print(x[i-1]);
      System.out.print(" ");
      System.out.print(Math.pow(x[i-1],2));
      System.out.println(" ");}
      
    // Problema 2: Imprimir un listado con los numeros impares desde 1 hasta 999 y
    //seguidamente otro listado con los numeros pares desde 2 hasta 1000
     System.out.println("Ejercicio 2");
     for(int i=1;i<=1000;i++)
     {if(i%2!=0)
     {System.out.print(i);
     System.out.print(" ");
     }}
     System.out.println(" ");
     for(int i=1;i<=1000;i++)
     {if(i%2==0)
     {System.out.print(i);
     System.out.print(" ");}}
      System.out.println(" ");
      

      
      
    }
    
}
