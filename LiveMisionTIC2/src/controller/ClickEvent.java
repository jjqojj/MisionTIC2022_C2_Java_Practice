/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import access.ObraDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.ObraModel;
import model.MuseoModel;
import model.PresentacionModel;
import view.AddArtPiece;
import view.ControlsPanel;

/**
 *
 * @author casierrav
 */
public class ClickEvent implements ActionListener {

    private ControlsPanel controlsPanel;
    
    /**
     * Constructor of the class
     * @param controlsPanel 
     */
    public ClickEvent(ControlsPanel controlsPanel){
        this.controlsPanel = controlsPanel;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.controlsPanel.getBtnSearch()) {
            int idMuseum            = ((MuseoModel)this.controlsPanel.getCbxMuseumsList().getSelectedItem()).getId();
            int idPresentation      = ((PresentacionModel)this.controlsPanel.getCbxPresentationsList().getSelectedItem()).getPreId();
            String datePresentation = ((PresentacionModel)this.controlsPanel.getCbxPresentationsList().getSelectedItem()).getPreFechaInicio();
            String artPieceName     = (String)this.controlsPanel.getTxtName().getText();
            
            //System.out.println(idMuseum + " " + idPresentation + " " + datePresentation + " " + artPieceName);
            ObraDAO artPieceDAO = new ObraDAO();
            ArrayList<ObraModel> artPieces = artPieceDAO.getFilteredArtPieces(idMuseum, idPresentation, datePresentation, artPieceName);
            
            this.controlsPanel.setTblResults(artPieces);
        }
        else if(actionEvent.getSource() == this.controlsPanel.getBtnAddArtPiece()) {
            AddArtPiece addArtPieceView = new AddArtPiece();
            addArtPieceView.setVisible(true);
    }   }
}