/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_clases;

/**
 *
 * @author jjqoj
 */
public class Perro {
    
    //Atributos
public String nombre;
public int edad;
public String colorOjos;

    

// Constructor

public Perro(int edad, String nombre, String colorOjos){
this.nombre = nombre;
this.edad=edad;
this.colorOjos=colorOjos;
}



// Métodos

public void ladrar(){
    System.out.println("Guau guau");
}


public void saludar(){
    System.out.println("Hola, mi nombre es "+nombre);
}


public void quienEsMayor(Perro otroPerro){
    if(this.edad>otroPerro.edad){
        System.out.println("Soy mayor que "+otroPerro.nombre);
    }
        else if(this.edad==otroPerro.edad){
     System.out.println("Tenemos la misma edad");
                }
        else{
        System.out.println(otroPerro.nombre+" es mayor que yo");}
        }


public void saludarOtroPerro(Perro otroPerro){
    System.out.println("Hola "+otroPerro.nombre+", yo soy "+this.nombre);
}

    

public static void main(String[] args){
    Perro miPerro = new Perro(5, "Toby","Azul");
    Perro miPerro1 = new Perro(5,"Toby","Azul");
    Perro miPerro2 = new Perro(7,"Vainilla","Negro");
    Perro miPerro3 = new Perro(5,"Bony","Amarillo");
    
    //System.out.println(miPerro2.edad);
    //miPerro2.saludar();
    miPerro3.quienEsMayor(miPerro2);
    miPerro1.saludarOtroPerro(miPerro2);
}

    
    
}
