/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class PanelConvAudio extends JPanel {

    public PanelConvAudio() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(new GridLayout(2,2));
        this.setBackground(Color.DARK_GRAY.brighter());
        add(new PanelArchivo("ffg"));
        add(new arch2());
        add(new PanelFinal());
    }
    
    
    
}
