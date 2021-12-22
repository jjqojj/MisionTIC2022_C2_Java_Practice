/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;


import java.util.Scanner;


/**
 *
 * @author jjqojj
 */
public class HolaMundo {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nombre=" ";
        System.out.println("Ingrese su nombre");
        nombre=sc.nextLine();
        System.out.println("Su nombre es " + nombre);
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Usted " + nombre + ", tiene " + edad);
        
     
    }
    
}
