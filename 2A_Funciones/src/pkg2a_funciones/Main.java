/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2a_funciones;

import java.util.Scanner;
/**
 *
 * @author jjqoj
 */
public class Main {
       
       //Funciones ejemplos presentación
    
    
    
    
       public static double f(double x)
       {return x*x;}
       
       
       
        
       
       
       public static int sum(int x, int y) {
               return x + y;
}
       
       public static double g(double number)
       {double y=Math.pow(number,2); return y;}
       
       
       
       
       
       public static double area_rectangulo(double l, double a)
       {double y=l*a;
       return y;}
       
       
       
       
       
       // Funciones ejercicios
       
       // Ejercicios 1, 2 y 3
       public static double volumen(double r_1,double r_2, double h)
       {double y =(Math.PI/3)*(4*Math.pow(r_1, 3)+Math.pow(r_2,2)*h);
       return y;}
       
       // Problema 1: gallinas
       
       public static double carne(double gallinas, double gallos,double pollitos)
       {double y=6*gallinas+7*gallos+pollitos;
       return y;}
       
       // Problema 2: pan
       
       public static double vueltos(int panes, int leche, int huevos, int billete)
       {int costo = 300*panes + 3300*leche + 350*huevos;
       int vueltas=billete - costo;
       return vueltas;}
       
       // Problem 3: prestamo
       
       public static double prestamo(double P, int tiempo)
       {double deuda=P*Math.pow(1+0.03,2);
       return deuda;}
       
       public static double covid(int contagiados, int dias)
       {double total=Math.pow(2,dias-1)*contagiados;
       return total;}
       
          public static void main(String[] args) {
              
              //Zona de pruebas
              //System.out.println(g(500));
              
              System.out.println(sum(10,5));
              
              
              
              
              // Ejercicios sobre funciones 1
              //Scanner sc = new Scanner (System.in);
              //double d = Double.parseDouble(sc.nextLine());
              //System.out.println(g(d));
              
              //Área de un rectángulo
              Scanner sc = new Scanner (System.in);
              System.out.println("Ingrese el valor del largo");
              int l = sc.nextInt();
              System.out.println("Ingrese el valor del ancho");
              int a= sc.nextInt();
              System.out.println("Área: "+area_rectangulo(l,a));
              
              // Ejercicio 1, 2 y 3
              //Scanner sc = new Scanner (System.in);
              //System.out.println("Ingrese el valor del radio de la esfera");
              //double r_1 = Double.parseDouble(sc.nextLine());
              //System.out.println("Ingrese el valor del radio de la base del cono");
              //double r_2 = Double.parseDouble(sc.nextLine());
              //System.out.println("Ingrese el valor de la altura cono");
              //double h = Double.parseDouble(sc.nextLine());
             // System.out.println("Volumen: " + volumen(r_1,r_2,h));
             // ¿Por qué no pasa cuando h=9/2?
   }
}

  
