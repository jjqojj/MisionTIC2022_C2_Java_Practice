/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81.champions;

/**
 *
 * @author jjqoj
 */
public class Jugador {
    //private int id;
    private int numero;
    private String nombre;
    private String equipo;
    private String puesto;

    public Jugador( int numero, String nombre, String equipo, String puesto) {
        //this.id = id;
        this.numero = numero;
        this.nombre = nombre;
        this.equipo = equipo;
        this.puesto = puesto;
    }

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    
    @Override
    public String toString(){
        return this.numero+"|"+this.nombre+ "|" +this.puesto+"|"+this.equipo;
    }
    
}
