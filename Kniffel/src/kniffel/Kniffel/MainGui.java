package kniffel.Kniffel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnClose;
	private JButton btnHilfe;
	int[] augenzahl = new int[5];
	JLabel[] würfellabel = new JLabel[5];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	// Main frame
	public MainGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JPane1 placed on Contentpane
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 976, 595);
		contentPane.add(panel);
		panel.setLayout(null);
		System.out.println("null");
		
		//Panel 1 placed on "main Panel"
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 0, 575, 595);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(0, 0, 574, 57);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		//Ergebnis Label
		
		JLabel lblErgebnis = new JLabel("Kniffelblock");
		lblErgebnis.setBounds(200, 0, 189, 61);
		panel_4.add(lblErgebnis);
		lblErgebnis.setFont(new Font("Script MT Bold", Font.PLAIN, 35));
		
		//Ergebnis Panel
		JPanel ERGBENIS = new JPanel();
		ERGBENIS.setBounds(10, 68, 555, 516);
		panel_1.add(ERGBENIS);
		ERGBENIS.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/floor-1256804_1280.jpg")));
		lblNewLabel.setBounds(0, 0, 555, 516);
		ERGBENIS.add(lblNewLabel);repaint();
		
		
		//Panel 3 placed on panel1
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 240));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(574, 0, 402, 548);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Panel 5 placed on Panel 3
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(0, 0, 402, 57);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		//Kniffel Label placed on Panel 5
		JLabel lblKniffel = new JLabel("Kniffel");
		lblKniffel.setBounds(10, 2, 262, 61);
		lblKniffel.setFont(new Font("Script MT Bold", Font.PLAIN, 50));
		panel_5.add(lblKniffel);
		
		//Copyright :D
		JLabel lblByGruppe = new JLabel("by Gruppe 6");
		lblByGruppe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblByGruppe.setBounds(174, 14, 162, 53);
		panel_5.add(lblByGruppe);
		
		JRadioButton rdbtnWrfelBehalten = new JRadioButton("");
		rdbtnWrfelBehalten.setBounds(89, 505, 21, 23);
		panel_3.add(rdbtnWrfelBehalten);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(138, 505, 21, 23);
		panel_3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(183, 505, 21, 23);
		panel_3.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBounds(235, 505, 21, 23);
		panel_3.add(radioButton_4);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(278, 505, 21, 23);
		panel_3.add(radioButton);
		
		JLabel lblWelcheWrfelSollen = new JLabel("Welche W\u00FCrfel sollen stehen bleiben:");
		lblWelcheWrfelSollen.setBounds(89, 484, 273, 14);
		panel_3.add(lblWelcheWrfelSollen);
		
		//Wurefel Bilder einfügen 
		ImageIcon img =
				new ImageIcon("Bilder/wuerfel 1.png");
		/*
		JLabel lblNewLabel_1 = new JLabel("");
		int zahl1 = 2;
		 switch (zahl1) {
         case 1:  lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 150x50.png")));
                  break;
         case 2:  lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 250x50.png")));
                  break;
         case 3:  lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 350x50.png")));
                  break;
         case 4:  lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 450x50.png")));
                  break;
         case 5:  lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 550x50.png")));
                  break;
         case 6:  lblNewLabel_1.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 650x50.png")));
         		  break;
		 }
		
		panel_3.add(lblNewLabel_2);
		*/
		
		//Panel 2 
		panel_2 = new JPanel();
		panel_2.setBounds(574, 548, 402, 47);
		panel.add(panel_2);
		panel_2.setBackground(UIManager.getColor("Button.background"));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		
		//Button placed on panel 2 + Actionlistener
		btnClose = new JButton("Beenden");
		
		//Action Listener
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.exit( 0 );
			}
		});
		
		btnClose.setBounds(303, 11, 89, 23);
		panel_2.add(btnClose);
		
		//Hilfebutton placed on panel2
		btnHilfe = new JButton("Hilfe");
		btnHilfe.setBounds(20, 11, 89, 23);
		panel_2.add(btnHilfe);
		//Würfelbutton placed on panel 2
		JButton btnWrfeln = new JButton("W\u00FCrfeln");
		btnWrfeln.setBounds(161, 11, 89, 23);
		panel_2.add(btnWrfeln);
		
		//würfelknopf (ruft würfelmethode aus würfelklasse auf)
		btnWrfeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//checken, wie oft button geklickt
				
			for(int i = 1;i<=5;i++){	 
				// Hier checken ob geblockt
				// Hier die Würfel Methoden
				
				// Hier Bilder darstellen
				würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 150x50.png")));
				würfellabel[i].setBounds(176, 411, 56, 57);
				panel_3.add(würfellabel[i]);
				
				augenzahl[i] = KniffelSpiel.ermittleWürfel(i).getAugenzahl();
				switch(augenzahl[i]){
				case 1:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 150x50.png")));
				         break;
				case 2:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 250x50.png")));
				         break;
				case 3:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 350x50.png")));
				         break;
				case 4: würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 450x50.png")));
				         break;
				case 5:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 550x50.png")));
				         break;
				case 6:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 650x50.png")));
						 break;
				        }
					
				}//Ende For
			
				//Hier Regelprüfungen
			
			
				//Hier in Liste eintragen
		}});
		
		}
}
