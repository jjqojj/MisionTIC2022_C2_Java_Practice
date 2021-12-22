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
public class PresentacionModel {
    private int preId;
    private int preMuID;
    private int preObID;
    private String preFechaInicio;

    public PresentacionModel(int preId,String preFechaInicio, int preObID ,int preMuID) {
        this.preId = preId;
        this.preMuID = preMuID;
        this.preObID = preObID;
        this.preFechaInicio = preFechaInicio;
    }

    /**
     * @return the preId
     */
    public int getPreId() {
        return preId;
    }

    /**
     * @return the proMuID
     */
    public int getPreMuID() {
        return preMuID;
    }

    /**
     * @return the preObID
     */
    public int getPreObID() {
        return preObID;
    }

    /**
     * @return the preFechaInicio
     */
    public String getPreFechaInicio() {
        return preFechaInicio;
    }

    /**
     * @param preFechaInicio the preFechaInicio to set
     */
    public void setPreFechaInicio(String preFechaInicio) {
        this.preFechaInicio = preFechaInicio;
    }
    
    @Override
    public String toString(){
        return this.preFechaInicio;
    }
    
    
    
}
