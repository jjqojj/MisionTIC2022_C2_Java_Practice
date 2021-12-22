/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81_c2.s1ejemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jjqoj
 */
public class Ejemplo1 {
    
    
    public static int div(int n1,int n2){
        return (n1/n2);
    }
    
    
    
    public static void main(String[] args) {
        int numero=3;
        char letra='A';
        String cadena="Hola";
        long enteroLargo = 1234599999L;
        boolean dato = true;
        float decimal= 2.4f;
        System.out.println("Los datos son: ");
        System.out.println(numero);
        System.out.println(letra);
        System.out.println(cadena);
        System.out.println(enteroLargo);
        System.out.println(dato);
        System.out.println(decimal);
        
        
        
        
        Scanner sc= new Scanner(System.in);
        try{
        
        System.out.println("Ingrese el primer valor");
        int n1=sc.nextInt();
        System.out.println("Ingrese el segundo valor");
        int n2=sc.nextInt();
        System.out.println("Divisón a/b= "+div(n1,n2));}
        catch (InputMismatchException e)
        {System.out.println("ERROR, digíte un número");}
        catch (ArithmeticException e_2){
    {System.out.println("ERROR, el denominador debe ser diferente de cero");}}
        
    
    
    
    
    
    
    }

    public Ejemplo1() {
    }
    
}
