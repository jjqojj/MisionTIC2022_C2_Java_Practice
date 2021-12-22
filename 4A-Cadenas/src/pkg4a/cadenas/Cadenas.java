/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4a.cadenas;





/**
 *
 * @author jjqoj
 */
public class Cadenas {

    
public static double problema_1(char x, String y)
{int contador=0;
for(int i=0;i<=(y.length()-1);i++)
    {if(x==y.charAt(i))
        {contador++;}
    }
    return contador;}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        String a="hola mundo";
        String b="hola";
        System.out.println(b.length());
        System.out.println(a.contains(b));
        System.out.println(problema_1('o', "Hola mundo"));
        
        int[] vector =new int[50];
        System.out.println(vector[0]);
        String myUnicodeSymbol = "\u0041";
        char x='a';
        System.out.println(myUnicodeSymbol);
        System.out.println(x);
        
    }
    
}
