/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import access.ObraDAO;
import java.util.ArrayList;
import access.ExposicionDAO;
import model.ExposicionModel;
import access.MuseoDAO;
import model.MuseoModel;
import access.PresentacionDAO;
import model.ObraModel;
import model.PresentacionModel;


/**
 *
 * @author casierrav
 */
public class InitialData {
    private ArrayList<MuseoModel>       museums       = null;
    private ArrayList<ExposicionModel>   exhibitions   = null;
    private ArrayList<PresentacionModel> presentations = null;
    private ArrayList<ObraModel>     artPieces = null;
    
    /**
     * Zero-parameters constructor
     */
    public InitialData(){
        MuseoDAO museumDAO = new MuseoDAO();
        this.museums = museumDAO.getAllMuseums();
        this.museums.add(0, new MuseoModel(-1, "Todos los museos"));
        
        ExposicionDAO exhibitionDAO = new ExposicionDAO();
        this.exhibitions = exhibitionDAO.getAllExhibitions();
        this.exhibitions.add(0, new ExposicionModel(-1, "Todas las exposiciones"));
        
        PresentacionDAO presentationDAO = new PresentacionDAO();
        this.presentations = presentationDAO.getAllPresentations();
        this.presentations.add(0, new PresentacionModel(-1, "Todas las presentaciones", -1, -1));
        
        ObraDAO artPieceDAO = new ObraDAO();
        this.artPieces = artPieceDAO.getAllArtPieces();
    }

    /**
     * @return the museums
     */
    public ArrayList<MuseoModel> getMuseums() {
        return museums;
    }

    /**
     * @return the exhibitions
     */
    public ArrayList<ExposicionModel> getExhibitions() {
        return exhibitions;
    }

    /**
     * @return the presentations
     */
    public ArrayList<PresentacionModel> getPresentations() {
        return presentations;
    }

    /**
     * @return the artPieces
     */
    public ArrayList<ObraModel> getArtPieces() {
        return artPieces;
    }
}