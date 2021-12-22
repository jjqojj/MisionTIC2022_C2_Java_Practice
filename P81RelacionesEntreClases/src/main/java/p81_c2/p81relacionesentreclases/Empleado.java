
package p81_c2.p81relacionesentreclases;

import java.util.ArrayList;
import java.util.List;


public abstract class Empleado extends Persona{
    
    private int idEmpleado;
    private String direccion;
    private int telefono;
    private String cargo;
    private double sueldo;
    private List<Prestamo> prestamos = new ArrayList<Prestamo>();

    public Empleado(int idEmpleado, String direccion, int telefono, String cargo, double sueldo, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.idEmpleado = idEmpleado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

  
    
   

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

   
    
     public abstract String experiencia();
    
    
    
    
}
