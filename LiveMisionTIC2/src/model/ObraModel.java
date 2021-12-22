/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jjqoj
 */
public class ObraModel {
    private int id; //atributo interpretado de la tabla
    private String nombre; //atributo interpretado de la tabla
    private String tipo; //atributo interpretado de la tabla
    private double costo; //atributo interpretado de la tabla
    private String museo; //Adicional para vista del usuario
    private int idExposicionFK; //Adicional para vista del usuario
    private String exposicion; //Adicional para vista del usuario
    private String presentacion; //Adicional para vista del usuario

    public ObraModel(int id, String nombre, String tipo, double costo, int idExposicionFK) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.idExposicionFK = idExposicionFK;
    }

    public ObraModel(int id, String nombre, String tipo, double costo, String museo, String exposicion, String presentacion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.museo = museo;
        this.exposicion = exposicion;
        this.presentacion = presentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMuseo() {
        return museo;
    }

    public void setMuseo(String museo) {
        this.museo = museo;
    }

    public int getIdExposicionFK() {
        return idExposicionFK;
    }

    public void setIdExposicionFK(int idExposicionFK) {
        this.idExposicionFK = idExposicionFK;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    
    public Object[] toArray(){
        Object[] data={id,nombre,tipo,costo, museo,exposicion,presentacion};
        return data;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


