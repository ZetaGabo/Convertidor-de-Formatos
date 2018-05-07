/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class PanelConvImagen extends JPanel {
    
   
    private PanelFinal panelF;
    private PanelArchivo panelArch, panelArch2;
    
    public PanelConvImagen() {
        this.inicializarComponentes();        
    }
    
    private void inicializarComponentes() {
        this.setLayout(new GridLayout(2, 2));
        this.setBackground(Color.DARK_GRAY.brighter());
        
        
        this.panelF = new PanelFinal();
        this.panelArch = new PanelArchivo("Buscar archivo:");
        this.panelArch2 = new PanelArchivo("Buscar carpeta de destino:");
        
        add(panelArch);
        add(panelArch2);        
        add(new im2());
        add(panelF);
        
    }
    
}
