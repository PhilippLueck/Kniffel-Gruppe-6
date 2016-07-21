package kniffel.Kniffel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Anleitung extends JFrame {

	private JPanel contentPane;

	
	public Anleitung() throws HeadlessException, IOException, URISyntaxException {
		//Erstellt das Anleitungsfenster, mit der Anleitung als png Datei
		
		JFrame f = new JFrame();
    	f.setContentPane(new JLabel(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/Kniffel Anleitung.png"))));
    	f.pack();
    	f.setVisible(true);
    	f.setResizable(false);
    	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
	}

}

