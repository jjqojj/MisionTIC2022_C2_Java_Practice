/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3a.ciclicas;



import java.util.Scanner;
/**
 *
 * @author jjqoj
 */
public class Ciclicas {

    //Ejemplos
    
    
    public static double minMaquina() {
    double Xo = 1.0;
    double Xi = Xo / 2.0;
    while (Xi > 0.0) {
    Xo = Xi;
    Xi = Xo / 2.0;
    }
    return Xo;
    }
   
    
    
public static double minMaquina2() {
double Xo = 1.0;
double Xi = Xo / 2;
do {
Xo = Xi;
Xi = Xo / 2.0;
} while (Xi > 0.0);
return Xo;
}
    
    
    
    
 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           

// Ejemplos
        
        
           int i = 0;
           while (i <= 6) {
           System.out.println(i);
           i = i + 1;
           }
           
           
 //Ejemplo 2
    
int k = 2; // inicializa a k en 2
int j = 25; // inicializa a j en 25
while (k < j) { // mientras i sea menor a j
// imprime los valores de i y j
System.out.println(k + ", " + j);
k = k * 2; // i se multplica por 2 en cada paso
j = j + 10; // se incrementa de 10 en 10
}
// se ejecuta al terminar el ciclo
System.out.println("the end.");
System.out.println(k + ", " + j);// valores finales de i y j
      
//Ejemplo 3


System.out.println(minMaquina());


Scanner sc = new Scanner (System.in);
int suma = 0;
while (true) {
System.out.print("Ingrese un numero entero ");
System.out.println("a sumar o 0 para salir: ");
int dato = Integer.parseInt(sc.nextLine());
if (dato == 0) break;
suma += dato;
}
System.out.println("La suma es: " + suma);
           
           }}


















