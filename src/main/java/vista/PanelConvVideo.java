/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jev
 */
public class PanelConvVideo extends JPanel {

    public PanelConvVideo() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        add(new JTextField(20));
        this.setBackground(Color.DARK_GRAY.brighter());
    }
    
    
    
}
