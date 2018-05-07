/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Jev
 */
public class VentanaPrincipal extends JFrame {

    private PanelBotones botones;
    private JScrollPane scrollPaneles;
    private PanelConvAudio audio;
    private PanelConvImagen imagen;
    private PanelConvVideo video;

    public VentanaPrincipal() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setTitle("Convertidor");
        this.setSize(800, 550);
        this.setLocationRelativeTo(null);
      //  this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.scrollPaneles = new JScrollPane();
        this.botones = new PanelBotones();

        this.audio = new PanelConvAudio();
        //this.audio.setVisible(false);
        this.imagen = new PanelConvImagen();
        //this.imagen.setVisible(false);
        this.video = new PanelConvVideo();
        //this.video.setVisible(false);

        this.add(scrollPaneles, BorderLayout.CENTER);

        this.botones.botonAudio.addActionListener(e -> {
            this.definirPanel(this.audio);
        });

        this.botones.botonImagen.addActionListener(e -> {
            this.definirPanel(this.imagen);
        });

        this.botones.botonVideo.addActionListener(e -> {
            this.definirPanel(this.video);
        });

        this.add(botones, BorderLayout.WEST);
        //add(new Panel2(), BorderLayout.CENTER);

        this.setVisible(true);

    }

    private void definirPanel(JPanel mipanel) {
        this.scrollPaneles.setViewportView(mipanel);
    }

}
