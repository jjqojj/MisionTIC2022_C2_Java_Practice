/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.MuseoModel;
import access.PresentacionDAO;
import model.PresentacionModel;
import view.ControlsPanel;

/**
 *
 * @author casierrav
 */
public class ChangeEvent implements ActionListener {

    private ControlsPanel controlsPanel;
    
    
    public ChangeEvent(ControlsPanel controlsPanel){
        this.controlsPanel = controlsPanel;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this.controlsPanel.getCbxMuseumsList()) {
            PresentacionDAO presentationDAO = new PresentacionDAO();
            ArrayList<PresentacionModel> presentations = null;
            int museum     = ((MuseoModel)this.controlsPanel.getCbxMuseumsList().getSelectedItem()).getId();
            if(museum == -1) {
                presentations = presentationDAO.getAllPresentations();
                presentations.add(0, new PresentacionModel(-1, "Todas las presentaciones", -1, -1));
            }
            else {
                presentations = presentationDAO.getPresentationsByMuseum(museum);
                presentations.add(0, new PresentacionModel(-1, "Todas las presentaciones", -1, -1));
            }
            this.controlsPanel.setCbxPresentationsList(presentations);
        }
    }
    
}