package kniffel.Kniffel;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JPanel pnl_buttons;
	private JPanel pnl_rechts;
	private JButton btnClose;
	private JButton btnHilfe;
	private JLabel[] würfellabel;
	private JTable tbl_KniffelBlock;
	private Regelwerk Regelwerk = new Regelwerk();
	private boolean[][] tableBlock= new boolean[(KniffelSpiel.spielerCount())][13];
	private int[] regelArray = new int[13];
	private  int wurfCounter =0;
	private boolean gewürfelt = false;
	private boolean zugEnde = false;
	/**
	 * Launch the application.
	 */
	
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
	//Sounds Allgemein
	 public void playSound(String soundName)
     {
       try 
       {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
       }
       catch(Exception ex)
       {
         System.out.println("Error with playing sound.");
         ex.printStackTrace( );
       }
     }
	
	//Sounds Allgemein Ende
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		//});
	//}

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
		
		// Würfel erstellen
		Würfel würfel1 = new Würfel(1,0, 0, false);
		Würfel würfel2 = new Würfel(2,0, 0, false);
		Würfel würfel3 = new Würfel(3,0, 0, false);
		Würfel würfel4 = new Würfel(4,0, 0, false);
		Würfel würfel5 = new Würfel(5,0, 0, false);
		
		KniffelSpiel.würfelHinzufügen(würfel1);
		KniffelSpiel.würfelHinzufügen(würfel2);
		KniffelSpiel.würfelHinzufügen(würfel3);
		KniffelSpiel.würfelHinzufügen(würfel4);
		KniffelSpiel.würfelHinzufügen(würfel5);
		
		//Regelarray befüllen
		regelArray[0]= Regelwerk.einser();
		regelArray[1]= Regelwerk.zweier();
		regelArray[2]= Regelwerk.dreier();
		regelArray[3]= Regelwerk.vierer();
		regelArray[4]= Regelwerk.fuenfer();
		regelArray[5]= Regelwerk.sechser();
		regelArray[6]= Regelwerk.dreierPasch();
		regelArray[7]= Regelwerk.viererPasch();
		regelArray[8]= Regelwerk.fullHouse();
		regelArray[9]= Regelwerk.kleineStraße();
		regelArray[10]= Regelwerk.großeStraße();
		regelArray[11]= Regelwerk.kniffel();
		regelArray[12]= Regelwerk.chance();
		
		
		//Kniffelblock Array befüllen, was Jtable Zellen simuliert
		for (int x =0; x<tableBlock.length;x++){
			for (int y=0; y< 13;y++){
				tableBlock[x][y]= false;
				System.out.println("x: "+ x+ " y: " + y + ""+tableBlock[x][y]);
			}
		}
		
		
		//würfellabel 
		würfellabel = new JLabel[6];
		
		// Hier labels deklarieren
		for(int i=1;i<würfellabel.length;i++){
		würfellabel[i] = new JLabel();
		}
		
		//JPane1 placed on Contentpane
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 976, 595);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Panel 1 placed on "main Panel"
		JPanel pnl_links = new JPanel();
		pnl_links.setBorder(null);
		pnl_links.setBackground(new Color(139, 69, 19));
		pnl_links.setBounds(0, 0, 575, 595);
		panel.add(pnl_links);
		pnl_links.setLayout(null);
		
		
		// Tabelle
		tbl_KniffelBlock = new JTable();
		tbl_KniffelBlock.setBackground(SystemColor.menu);
		tbl_KniffelBlock.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		tbl_KniffelBlock.setRowHeight(24);
		tbl_KniffelBlock.setModel(new DefaultTableModel(
			new Object[][] {
				{"Spieler", null, null, null, null, null, null, null, null},
				{"Einser", null, null, null, null, null, null, null, null},
				{"Zweier", null, null, null, null, null, null, null, null},
				{"Dreier", null, null, null, null, null, null, null, null},
				{"Vierer", null, null, null, null, null, null, null, null},
				{"F\u00FCnfer", null, null, null, null, null, null, null, null},
				{"Sechser", null, null, null, null, null, null, null, null},
				{"Gesamt", null, null, null, null, null, null, null, null},
				{"Bonus", null, null, null, null, null, null, null, null},
				{"Gesamt Oben", null, null, null, null, null, null, null, null},
				{"Dreierpasch", null, null, null, null, null, null, null, null},
				{"Viererpasch", null, null, null, null, null, null, null, null},
				{"Full-House", null, null, null, null, null, null, null, null},
				{"Kleine Stra\u00DFe", null, null, null, null, null, null, null, null},
				{"Gro\u00DFe Stra\u00DFe", null, null, null, null, null, null, null, null},
				{"Kniffel", null, null, null, null, null, null, null, null},
				{"Chance", null, null, null, null, null, null, null, null},
				{"Gesamt unten", null, null, null, null, null, null, null, null},
				{"Gesamt oben", null, null, null, null, null, null, null, null},
				{"Ergebnis", null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Regeln", "Spiel 1", "Spiel 2", "Spiel 3", "Spiel 4", "Spiel 5", "Spiel 6", "Spiel 7", "Spiel 8"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbl_KniffelBlock.getColumnModel().getColumn(0).setResizable(false);
		tbl_KniffelBlock.getColumnModel().getColumn(1).setResizable(false);
		tbl_KniffelBlock.getColumnModel().getColumn(2).setResizable(false);
		tbl_KniffelBlock.getColumnModel().getColumn(3).setResizable(false);
		tbl_KniffelBlock.getColumnModel().getColumn(4).setResizable(false);
		tbl_KniffelBlock.getColumnModel().getColumn(5).setResizable(false);
		tbl_KniffelBlock.getColumnModel().getColumn(6).setResizable(false);
		tbl_KniffelBlock.setBounds(10, 108, 565, 456);
		pnl_links.add(tbl_KniffelBlock);
		//END TABLE
		
		//Spieler in Tabelle eintragen
		for(int i = 1; i<=KniffelSpiel.spielerCount();i++){
		tbl_KniffelBlock.setValueAt(KniffelSpiel.ermittleSpieler(i).getName(),0, i);
		}
		
		
		JLabel label_3 = new JLabel("Kniffelblock");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(127, 23, 473, 61);
		pnl_links.add(label_3);
		label_3.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 50));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 907, 715);
		pnl_links.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(139, 69, 19));
		lblNewLabel.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/floor-1256804_1280.jpg")));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(216, 262, 402, 47);
		pnl_links.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/floor-1256804_1280.jpg")));repaint();
	
		
		//Panel 3 placed on panel1
		pnl_rechts = new JPanel();
		pnl_rechts.setBackground(new Color(255, 255, 240));
		pnl_rechts.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_rechts.setBounds(574, 0, 402, 548);
		panel.add(pnl_rechts);
		pnl_rechts.setLayout(null);
		
		//5 Radiobuttons
		JRadioButton rdbtn_w1 = new JRadioButton("");
		rdbtn_w1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtn_w1.setBackground(SystemColor.controlShadow);
		rdbtn_w1.setBounds(80, 505, 21, 23);
		pnl_rechts.add(rdbtn_w1);
		
		JRadioButton rdbtn_w2 = new JRadioButton("");
		rdbtn_w2.setBackground(SystemColor.controlShadow);
		rdbtn_w2.setBounds(140, 505, 21, 23);
		pnl_rechts.add(rdbtn_w2);
		
		JRadioButton rdbtn_w3 = new JRadioButton("");
		rdbtn_w3.setBackground(SystemColor.controlShadow);
		rdbtn_w3.setBounds(200, 505, 21, 23);
		pnl_rechts.add(rdbtn_w3);
		
		JRadioButton rdbtn_w4 = new JRadioButton("");
		rdbtn_w4.setBackground(SystemColor.controlShadow);
		rdbtn_w4.setBounds(260, 505, 21, 23);
		pnl_rechts.add(rdbtn_w4);
		
		JRadioButton rdbtn_w5 = new JRadioButton("");
		rdbtn_w5.setBackground(SystemColor.controlShadow);
		rdbtn_w5.setBounds(320, 505, 21, 23);
		pnl_rechts.add(rdbtn_w5);
		
		JLabel lblWelcheWrfelSollen = new JLabel("Welche W\u00FCrfel sollen stehen bleiben:");
		lblWelcheWrfelSollen.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWelcheWrfelSollen.setForeground(Color.WHITE);
		lblWelcheWrfelSollen.setBounds(80, 479, 273, 14);
		pnl_rechts.add(lblWelcheWrfelSollen);
		
		JLabel label_1 = new JLabel("Kniffel");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 50));
		label_1.setBackground(new Color(139, 69, 19));
		label_1.setBounds(89, 25, 262, 61);
		pnl_rechts.add(label_1);
		
		JLabel lbl_rechts = new JLabel("New label");
		lbl_rechts.setBounds(0, 0, 402, 548);
		pnl_rechts.add(lbl_rechts);
		lbl_rechts.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/floor-1256804_1280.jpg")));
		
		
		//Panel 2 
		pnl_buttons = new JPanel();
		pnl_buttons.setBounds(574, 548, 402, 47);
		panel.add(pnl_buttons);
		pnl_buttons.setBackground(Color.WHITE);
		pnl_buttons.setBorder(null);
		pnl_buttons.setLayout(null);
		
		//Button placed on panel 2 + Actionlistener
		btnClose = new JButton("Beenden");
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
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/balken.png")));
		lblNewLabel_3.setBounds(0, 0, 402, 47);
		pnl_buttons.add(lblNewLabel_3);
		
		//würfelknopf (ruft würfelmethode aus würfelklasse auf)
		btnWrfeln.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
				
				if(wurfCounter==3|| zugEnde == true){
					JOptionPane.showMessageDialog(null, "Würfeln nicht mehr möglich.");
					btnWrfeln.setEnabled(false);
				}else{
				/*	//Sound
					playSound("C:/Users/IBM_ADMIN/git/New folder (5)/Kniffel-Gruppe-6/Kniffel/src/kniffel/Kniffel/Sound/Shake And Roll Dice-SoundBible.com-591494296.wav");	
					//Ende Sound */
					
					//Würfeln
					würfel1.würfeln(würfel1);
					würfel1.würfeln(würfel2);
					würfel1.würfeln(würfel3);
					würfel1.würfeln(würfel4);
					würfel1.würfeln(würfel5);
					
					//Jetzt Schleife für Bilder
					for(int i = 1;i<würfellabel.length;i++){	 
						//Bounds setzen
						switch(i){
						case 1: würfellabel[i].setBounds(60, 411, 56, 57);
						break;
						case 2: würfellabel[i].setBounds(120, 411, 56, 57);
						break;
						case 3:würfellabel[i].setBounds(180, 411, 56, 57);
						break;
						case 4: würfellabel[i].setBounds(240, 411, 56, 57);
						break;
						case 5: würfellabel[i].setBounds(300, 411, 56, 57);		
						break;
						}
						pnl_rechts.add(würfellabel[i]);
						int augenzahl =KniffelSpiel.ermittleWürfel(i).getAugenzahl();
						switch(augenzahl){
						case 1:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 150x50.png")));
		                break;
						case 2:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 250x50.png")));
		                break;
						case 3:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 350x50.png")));
		                break;
						case 4:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 450x50.png")));
		                break;
						case 5:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 550x50.png")));
		                break;
						case 6:  würfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 650x50.png")));
						break;
						        }
						lbl_rechts.add(würfellabel[i]);
						würfellabel[i].setVisible(true);
							
					}//Ende For 
					
					//Regelarray befüllen
					regelArray[0]= Regelwerk.einser();
					regelArray[1]= Regelwerk.zweier();
					regelArray[2]= Regelwerk.dreier();
					regelArray[3]= Regelwerk.vierer();
					regelArray[4]= Regelwerk.fuenfer();
					regelArray[5]= Regelwerk.sechser();
					regelArray[6]= Regelwerk.dreierPasch();
					regelArray[7]= Regelwerk.viererPasch();
					regelArray[8]= Regelwerk.fullHouse();
					regelArray[9]= Regelwerk.kleineStraße();
					regelArray[10]= Regelwerk.großeStraße();
					regelArray[11]= Regelwerk.kniffel();
					regelArray[12]= Regelwerk.chance();
				
					//Hier Regelprüfungen
					System.out.println("REGELPRÜFUNGEN");
					//Oberen Block prüfen
					for(int k =0; k<6;k++){
						if(tableBlock[0][k]== false){
							tbl_KniffelBlock.setValueAt(regelArray[k], k+1, 1);
						}
					}
						//Unteren Block prüfen
						for(int k =6; k<=12;k++){
							if(tableBlock[0][k]== false){
								tbl_KniffelBlock.setValueAt(regelArray[k], k+4, 1);	
							}
						
						}
					
				//Würfelliste ausgeben
				System.out.println("WÜRFEL ÜBERSCHRIEBEN");
				KniffelSpiel.würfelListeAusgeben();
				
				
				}//Ende if, die prüft ob schon 3 mal gewürfelt
				gewürfelt = true;
				wurfCounter++;
			
		}});// ENDE WÜRFEL BUTTON
		
		//Action Listener Close Button
				btnClose.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {System.exit( 0 );
					}
				});
		
		
		
		// Radiobuttonsfunktionen
		
		//eins
		rdbtn_w1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				würfel1.block(würfel1);
			}
		});
		// zwei
		rdbtn_w2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				würfel2.block(würfel2);
			}
		});
		
		//drei
		rdbtn_w3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				würfel3.block(würfel3);
			}
		});
		
		//vier
		rdbtn_w4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				würfel4.block(würfel4);
			}
		});
		
		//fünf
		rdbtn_w5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				würfel5.block(würfel5);
			}
		});
		
		
		
		
		tbl_KniffelBlock.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int row = tbl_KniffelBlock.getSelectedRow();
				if(gewürfelt == false){
					JOptionPane.showMessageDialog(null, "Bitte erst Würfeln");
				}else{
					// TODO Auto-generated method stub
					//Wert blockieren
					if(row>0&&row<=6){
						tableBlock[0][row-1]= true;
						System.out.println("blockiert: "+ "Zeile: " +row);
						zugEnde = true;
					}else{
						if(row>9 && row<17){
							tableBlock[0][row-4]= true;
							System.out.println("blockiert: "+ "Zeile: " +row);
							zugEnde = true;
						}else{
							JOptionPane.showMessageDialog(null, "Keine Eintragung in diese Felder möglich");
						}
					}
				}
			}
		});
	        
		
		}// Ende Main Gui Funktion
}

