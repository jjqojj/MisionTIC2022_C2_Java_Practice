
package p81_c2.p81relacionesentreclases;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        int idCargo=(new Scanner(System.in)).nextInt();
        String descripCargo = (new Scanner(System.in)).nextLine();
        int idEmpleado=(new Scanner(System.in)).nextInt();
        String direccion = (new Scanner(System.in)).nextLine();
        int telefono = (new Scanner(System.in)).nextInt();
        String cargo = (new Scanner(System.in)).nextLine();
        double sueldo = (new Scanner(System.in)).nextDouble();
        String nombre = (new Scanner(System.in)).nextLine();
        int edad = (new Scanner(System.in)).nextInt();
        String genero = (new Scanner(System.in)).nextLine();
        
        
        Coordinador coord1= new Coordinador(idCargo,descripCargo,idEmpleado,direccion,telefono,cargo,sueldo,nombre,edad,genero);
    }

    
}
