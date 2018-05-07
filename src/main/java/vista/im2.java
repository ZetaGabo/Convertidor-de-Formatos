/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jev
 */
public class im2 extends JPanel {

    private JLabel x;
    private ImageIcon im;

    public im2() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY.brighter());
        im = new ImageIcon("src/vp.png");
        x = new JLabel();
        x.setBounds(10, 10, 290, 235);
        x.setIcon(im);
        add(x);

    }

    public void setIcon(String ruta) {
        x.setIcon(new ImageIcon(ruta));
    }

}
