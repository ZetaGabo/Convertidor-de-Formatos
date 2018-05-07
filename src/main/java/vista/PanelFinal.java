/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jev
 */
public class PanelFinal extends JPanel {

    private JTextArea areaDatos;
    private JButton botonComenzar;

    public PanelFinal() {
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        this.setLayout(new BorderLayout());
        areaDatos = new JTextArea();
        areaDatos.setEditable(false);
        areaDatos.setText("- 27/23/28 23:00:04 Hora mama");
        areaDatos.setText(areaDatos.getText() + "\n- 27/23/28 23:00:04 Hora mama");

        Date fecha = new Date();
        areaDatos.setText(areaDatos.getText() + "\n" + fecha + " / Convirtiendo...");
        areaDatos.setBackground(Color.DARK_GRAY.brighter());
        areaDatos.setForeground(Color.white);
        // y = new JScrollPane(areaDatos);
        areaDatos.setFont(new Font("Verdana", Font.ITALIC, 10));

        JButton botonComenzar = new JButton("Comenzar a convertir...");

        add(areaDatos, BorderLayout.CENTER);
        add(botonComenzar, BorderLayout.SOUTH);
    }

}
