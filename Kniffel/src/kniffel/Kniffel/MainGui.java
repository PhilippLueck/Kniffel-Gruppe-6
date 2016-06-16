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
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JPanel pnl_buttons;
	private JPanel pnl_rechts;
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
		JPanel pnl_links = new JPanel();
		pnl_links.setBorder(null);
		pnl_links.setBackground(new Color(139, 69, 19));
		pnl_links.setBounds(0, 0, 575, 595);
		panel.add(pnl_links);
		pnl_links.setLayout(null);
		
		JPanel pnl_überschrift = new JPanel();
		pnl_überschrift.setBackground(new Color(139, 69, 19));
		pnl_überschrift.setBorder(null);
		pnl_überschrift.setBounds(0, 0, 574, 57);
		pnl_links.add(pnl_überschrift);
		pnl_überschrift.setLayout(null);
		
		//Ergebnis Label
		
		JLabel lblErgebnis = new JLabel("Kniffelblock");
		lblErgebnis.setBounds(200, 0, 189, 61);
		pnl_überschrift.add(lblErgebnis);
		lblErgebnis.setFont(new Font("Script MT Bold", Font.PLAIN, 35));
		
		//Ergebnis Panel
		JPanel pnl_block = new JPanel();
		pnl_block.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl_block.setBackground(new Color(139, 69, 19));
		pnl_block.setBounds(10, 56, 564, 528);
		pnl_links.add(pnl_block);
		pnl_block.setLayout(null);repaint();
		
		
		//Panel 3 placed on panel1
		pnl_rechts = new JPanel();
		pnl_rechts.setBackground(new Color(255, 255, 240));
		pnl_rechts.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_rechts.setBounds(574, 0, 402, 548);
		panel.add(pnl_rechts);
		pnl_rechts.setLayout(null);
		
		//Panel 5 placed on Panel 3
		JPanel pnl_Überschriftlinks = new JPanel();
		pnl_Überschriftlinks.setBackground(new Color(139, 69, 19));
		pnl_Überschriftlinks.setBorder(null);
		pnl_Überschriftlinks.setBounds(0, 0, 402, 57);
		pnl_rechts.add(pnl_Überschriftlinks);
		pnl_Überschriftlinks.setLayout(null);
		
		//Kniffel Label placed on Panel 5
		JLabel lblKniffel = new JLabel("Kniffel");
		lblKniffel.setBackground(new Color(139, 69, 19));
		lblKniffel.setBounds(10, 2, 262, 61);
		lblKniffel.setFont(new Font("Script MT Bold", Font.PLAIN, 50));
		pnl_Überschriftlinks.add(lblKniffel);
		
		//Copyright :D
		JLabel lblByGruppe = new JLabel("by Gruppe 6");
		lblByGruppe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblByGruppe.setBounds(174, 14, 162, 53);
		pnl_Überschriftlinks.add(lblByGruppe);
		
		JRadioButton rdbtn_w1 = new JRadioButton("");
		rdbtn_w1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtn_w1.setBackground(SystemColor.controlShadow);
		rdbtn_w1.setBounds(89, 505, 21, 23);
		pnl_rechts.add(rdbtn_w1);
		
		JRadioButton rdbtn_w2 = new JRadioButton("");
		rdbtn_w2.setBackground(SystemColor.controlShadow);
		rdbtn_w2.setBounds(138, 505, 21, 23);
		pnl_rechts.add(rdbtn_w2);
		
		JRadioButton rdbtn_w3 = new JRadioButton("");
		rdbtn_w3.setBackground(SystemColor.controlShadow);
		rdbtn_w3.setBounds(183, 505, 21, 23);
		pnl_rechts.add(rdbtn_w3);
		
		JRadioButton rdbtn_w4 = new JRadioButton("");
		rdbtn_w4.setBackground(SystemColor.controlShadow);
		rdbtn_w4.setBounds(235, 505, 21, 23);
		pnl_rechts.add(rdbtn_w4);
		
		JRadioButton rdbtn_w5 = new JRadioButton("");
		rdbtn_w5.setBackground(SystemColor.controlShadow);
		rdbtn_w5.setBounds(278, 505, 21, 23);
		pnl_rechts.add(rdbtn_w5);
		
		JLabel lblWelcheWrfelSollen = new JLabel("Welche W\u00FCrfel sollen stehen bleiben:");
		lblWelcheWrfelSollen.setBounds(89, 484, 273, 14);
		pnl_rechts.add(lblWelcheWrfelSollen);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 45, 555, 537);
		pnl_rechts.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(139, 69, 19));
		lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/floor-1256804_1280.jpg")));
		
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
		pnl_buttons = new JPanel();
		pnl_buttons.setBounds(574, 548, 402, 47);
		panel.add(pnl_buttons);
		pnl_buttons.setBackground(new Color(139, 69, 19));
		pnl_buttons.setBorder(null);
		pnl_buttons.setLayout(null);
		
		//Button placed on panel 2 + Actionlistener
		btnClose = new JButton("Beenden");
		
		//Action Listener
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.exit( 0 );
			}
		});
		
		btnClose.setBounds(303, 11, 89, 23);
		pnl_buttons.add(btnClose);
		
		//Hilfebutton placed on panel2
		btnHilfe = new JButton("Hilfe");
		btnHilfe.setBounds(20, 11, 89, 23);
		pnl_buttons.add(btnHilfe);
		//Würfelbutton placed on panel 2
		JButton btnWrfeln = new JButton("W\u00FCrfeln");
		btnWrfeln.setBounds(161, 11, 89, 23);
		pnl_buttons.add(btnWrfeln);
		
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
				pnl_rechts.add(würfellabel[i]);
				
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
