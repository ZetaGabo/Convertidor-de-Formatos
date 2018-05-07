/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jev
 */
public class arch2 extends JPanel {

    private JLabel et, et2;
    public JComboBox cb;
    private JTextArea textRuta;
    private JButton bt;

    public arch2() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY.brighter());

        this.et = new JLabel("A:");
        this.et.setForeground(Color.WHITE);
        this.et.setBounds(20, 50, 50, 25);

        this.cb = new JComboBox();
        this.cb.setBounds(60, 50, 100, 20);
        //this.cb.addItem(e.values());
        this.cb.addItem("Hola ");

        this.et2 = new JLabel("Buscar carpeta de destino:");
        this.et2.setForeground(Color.WHITE);
        this.et2.setBounds(20, 110, 200, 20);

        this.textRuta = new JTextArea();
        this.textRuta.setBounds(20, 135, 185, 20);
        this.textRuta.setEnabled(false);

        this.bt = new JButton("Buscar");
        this.bt.setBounds(215, 135, 75, 20);

        this.add(et);
        this.add(cb);
        this.add(et2);
        this.add(textRuta);
        this.add(bt);

    }

}