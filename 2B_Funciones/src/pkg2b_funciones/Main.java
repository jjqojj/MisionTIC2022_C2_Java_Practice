/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_funciones;

import java.util.Scanner;
/**
 *
 * @author jjqoj
 */
public class Main {
    
    // Funciones de ejemplo
    public static double v_absoluto(double x)
    {double valor;
    if (x>=0)
        {valor=x;}
    else
    {valor=-x;}
    return valor;}
    
    
    
    public static double max(double a, double b) {
    if (a > b) {
        return a;}
    else {
    return b;}}
    
    
    public static double valorAbsoluto2(double x) {
    double valor;
    valor = (x >= 0) ? x : -x;
    return valor;
    }
    
    public static void imprimirNumero(double x){
    if(x >= 0.0){
    System.out.print("+");
    }
    System.out.println(x);
    }
    
    
    
    public static boolean condicional(boolean p, boolean q) {
    return p&&!q;
    }    
    
    public static boolean condicional2(boolean p, boolean q) {
    if (p) {
    return q;
    } else {
    return true;
    }
    }
    
    
    
    
    
    public static double pagoFinal(int n, double precio) {
    double valor;
    if (n <= 5) {
    valor = n * precio;
    } else if (5 < n && n <= 10) {
    valor = n * precio * 0.95;
    } else if (10 < n && n <= 20) {
    valor = n * precio * 0.90;
    } else {
    valor = n * precio * 0.80;
    }
    return valor;
    }
    
    
    
    public static boolean esVocalMinuscula(char ch) {
    boolean value;
    switch (ch) {
    case 'a':
    value = true;
    break;
    case 'e':
    value = true;
    break;
    case 'i':
    value = true;
    break;
    case 'o':
    value = true;
    break;
    case 'u':
    value = true;
    break;
    default:
    value = false;
    break;
    }
    return value;
    }
    
    
   // Problemas Varios
    
    /** Dado un número entero, determinar si ese número corresponde al 
     código ASCII de una vocal minuscula.
     * @param x */
    
    public static void verificador_vocal(int x)
    {switch(x)
    {case 97:
    System.out.println("El valor ingresado corresponde a la vocal minúscula a");
    break;
    case 101:
    System.out.println("El valor ingresado corresponde a la vocal minúscula e");
    break;
    case 105:
    System.out.println("El valor ingresado corresponde a la vocal minúscula i");
    break;
    case 111:
    System.out.println("El valor ingresado corresponde a la vocal minúscula o");
    break;
    case 117:
    System.out.println("El valor ingresado corresponde a la vocal minúscula u");
    break;
    default: 
    System.out.println("El valor ingresado no corresponde a una vocal minúscula");}}
    
    
    /** Dada una cadena de longitud 1, determine si el código ASCII de
primera letra de la cadena es par o no.
     * @param ch */
    
    public static void verificador2(char ch)
    {int codigo=(int)ch;
    if (codigo%2==0)
    {System.out.println("La letra "+ch+" con código ASCII "+codigo+ " es par.");}
    else {{System.out.println("La letra <<"+ch+">> con código ASCII <<"+codigo+ ">> no es par.");}
    }}
    
    
    
    /** Dado un numero real x, construya una funcion que permita
determinar si el numero es positivo, negativo o cero
     * @param x */
    
    public static void tricotomia(double x)
    {if(x<0)
    {System.out.println("El número "+ x+ " es negativo");}
    else if(x==0){{System.out.println("El número "+ x+ " es el neutro para la suma");}}
    else {System.out.println("El número "+ x+ " es positivo");}
    }
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        // Ejemplo Valor Absoluto
        //Scanner sc= new Scanner(System.in);
       //System.out.println("n?");
        //double n=sc.nextDouble();
        //System.out.println("abs("+n+")="+v_absoluto(n));
        
        
        // Ejemplo Máximo dos números
        //System.out.println(max(-5,3));
        
        
        // Ejemplo Valor Absoluto 2
        //System.out.println(valorAbsoluto2(-15));
        
        
        // Ejemplo Signo
        //imprimirNumero(-0);
        
        
        //Ejemplo Condicional
        //System.out.println(condicional(true,true));
        //System.out.println(condicional2(true,true));
        
        
        //Ejemplo tienda
        //System.out.println(pagoFinal(5, 1000));
        
        // Ejemplo vocal
        //System.out.println(esVocalMinuscula('a'));
        
        //EJERCICIOS
        
        // Ejercicio 1
        
       verificador_vocal(80);
        
        // Ejercicio 2
        
        verificador2('a');
        
        // Ejercicio 3
        
        tricotomia(-7);
    }
    
}
