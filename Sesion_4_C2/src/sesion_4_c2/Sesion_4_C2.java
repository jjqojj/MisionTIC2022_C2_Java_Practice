/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion_4_c2;



import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * Funciones
 */
public class Sesion_4_C2 {

    
    
    //Aquí definimos la función
    
    public static void lee_arreglo_enteros(Scanner sc, int n){  // al quitar void *** quitar return
       int[] x = new int[n];
    for( int i=0; i<n; i++ ){
    System.out.println("Componente "+i+"-esima?");
    x[i] = sc.nextInt();
    }
    System.out.println(x[0]);
}

    
    public static void escribe_arreglo_reales(double[] x){
    int n = x.length; // 
    System.out.println(n);
    for( int i=0; i<n; i++ ){
    System.out.println("x["+i+"]="+x[i]);
}
}
    
    
    public static int[][] cuadrados_matriz(int[][] X){
int[][] Y = new int[X.length][X[0].length];
for(int i=0; i<X.length; i++){
for(int j=0; j<X[i].length; j++){
Y[i][j] = X[i][j]*X[i][j];
}
}
return Y;

}

    
    
    
    ///   [5,8,7,9]
    
    public static void main(String[] args) {
        
        
        //String unicode_prueba = "\u0042";
        //System.out.println(unicode_prueba);
        
        //char ejemplo_c = 'h';
        //System.out.println(ejemplo_c);
        
        
        //Scanner sc = new Scanner (System.in);
        //System.out.println("Ingrese alguna información: ");
        //String prueba = sc.nextLine();
        //System.out.println(prueba);
        
        
        //System.out.println("Comparando ");
        //String a="hola";
        //String b="Hola";
        //String c="Somos el mejor grupo";
        //String d="el mejor";
        
        
        //System.out.println(a.equals(b));
        //System.out.println(c.contains(d));  // larga vs cade peque
        //System.out.println(a+" "+c+" aquí puede adicionar más información ...");
        //System.out.println(c.length());
        
        
        //System.out.println(c[2]);
                
        //int[] vector= new int[10];  // vector de ceros 000000
        
        //for(int i=1;i<=10;i++)
        //{vector[i-1]=i;
        //System.out.println(vector[i-1]);}
        
        
        //System.out.println(vector[9]); // [0,0,0,0,0,0,0,0,0,0]
        
        //lee_arreglo_enteros(new Scanner(System.in), 4); // Este es el llamado de la función
        
        //double[] vector_2={5,7,8,10};  //new double[] {5,7,8,10}
        
        //escribe_arreglo_reales(vector_2); ///????
        
        int[][] X={{1,2,3},{4,5,6},{7,8,9}};
        
        
        int[][] Y=cuadrados_matriz(X);
        
        //System.out.println(Arrays.toString(Y)); // invocar
        
        for (int matriz[] : Y) 
        {System.out.println(Arrays.toString(matriz)); }
    }
    
}
