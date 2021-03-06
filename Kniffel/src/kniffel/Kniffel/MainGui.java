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
	private JButton btn_nextZug;
	private JButton btnHilfe;
	private JLabel[] w�rfellabel;
	private JTable tbl_KniffelBlock;
	
	private Regelwerk Regelwerk = new Regelwerk();
	
	//Variablen f�r korrekten Ablauf initialisieren
	private boolean[][] tableBlock= new boolean[(KniffelSpiel.spielerCount())][13];
	private boolean gew�rfelt = false;
	private boolean zugEnde = false;
	private boolean spielEnde= false;
	private int row= 0;
	private int[] regelArray = new int[13];
	private  int wurfCounter =0;
	private int actPlayer = KniffelSpiel.ermittleSpieler(1).getSpielerID();
	private int[] upPoints= new int[KniffelSpiel.spielerCount()+1];
	private int[] bottomPoints =new int[KniffelSpiel.spielerCount()+1];
	private int[] pointList = new int[KniffelSpiel.spielerCount()+1];
	private int entryCount =0;
	private int bottomRuleCount=0;
	private int kniffelBonus=0;
	
	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		

	/**
	 * Create the frame.
	 */	
			
	// Main frame
	public MainGui() {
		setResizable(false);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		/*Zunn�chst wird das Spiel vorbereitet mit den n�tigen Initialisierungen/Deklarierungen*/
		
		// W�rfel erstellen
		W�rfel w�rfel1 = new W�rfel(1,0, false);
		W�rfel w�rfel2 = new W�rfel(2,0, false);
		W�rfel w�rfel3 = new W�rfel(3,0, false);
		W�rfel w�rfel4 = new W�rfel(4,0, false);
		W�rfel w�rfel5 = new W�rfel(5,0, false);
		
		//W�rfel in W�rfelTreeSet
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel1);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel2);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel3);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel4);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel5);
		
		
		/*Kniffelblock Array bef�llen, was Jtable Zellen simuliert um sp�ter die Kontrolle �ber blockierte Felder zu haben*/
		for (int x =0; x<tableBlock.length;x++){
			for (int y=0; y< 13;y++){
				tableBlock[x][y]= false;
			}
		}
/*-----------------------------------------Panel-----------------------------------------------------------------------------------------------------*/
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 976, 595);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Panel links platziert auf "main Panel"
		JPanel pnl_links = new JPanel();
		pnl_links.setBorder(null);
		pnl_links.setBackground(new Color(139, 69, 19));
		pnl_links.setBounds(0, 0, 575, 595);
		panel.add(pnl_links);
		pnl_links.setLayout(null);
		
		//Panel rechts platziert auf panel1
		pnl_rechts = new JPanel();
		pnl_rechts.setBackground(new Color(255, 255, 240));
		pnl_rechts.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_rechts.setBounds(574, 0, 402, 548);
		panel.add(pnl_rechts);
		pnl_rechts.setLayout(null);
		 
		pnl_buttons = new JPanel();
		pnl_buttons.setBounds(574, 548, 402, 47);
		panel.add(pnl_buttons);
		pnl_buttons.setBackground(Color.WHITE);
		pnl_buttons.setBorder(null);
		pnl_buttons.setLayout(null);
/*-----------------------------------------Table-----------------------------------------------------------------------------------------------------*/		
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
		
		//Hilfebutton platziert auf panel2
		btnHilfe = new JButton("Hilfe");
		btnHilfe.setBounds(21, 44, 71, 23);
		pnl_links.add(btnHilfe);
		tbl_KniffelBlock.setBounds(10, 108, 565, 456);
		pnl_links.add(tbl_KniffelBlock);
		
		//�ffnet Hilfe Button
	       btnHilfe.addActionListener(new ActionListener() {
	          	public void actionPerformed(ActionEvent e) {
	          		 JOptionPane.showMessageDialog(null,"Informationen zur Nutzung des Programms erh�ltst du in der beiliegenden Anleitung");
	          		
	          	}
	         
	          });
		
		//tabelle erstmals bef�llen
		for(int i=1;i<=KniffelSpiel.spielerCount();i++){
			for(int y=1; y<=19;y++){
			tbl_KniffelBlock.setValueAt(0, y, i);
			}
		}
		//END TABLE
	/*-----------------------------------------Label-----------------------------------------------------------------------------------------------------*/		
		//w�rfellabel 
		w�rfellabel = new JLabel[6];
		for(int i=1;i<w�rfellabel.length;i++){
			w�rfellabel[i] = new JLabel();
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
		
		JLabel lbl_points = new JLabel("");
		lbl_points.setForeground(Color.WHITE);
		lbl_points.setFont(new Font("Old English Text MT", Font.PLAIN, 30));
		lbl_points.setBounds(207, 157, 185, 38);
		pnl_rechts.add(lbl_points);
		
		JLabel lblPunkte = new JLabel("Punkte:");
		lblPunkte.setForeground(Color.WHITE);
		lblPunkte.setFont(new Font("Old English Text MT", Font.PLAIN, 30));
		lblPunkte.setBounds(35, 157, 220, 38);
		pnl_rechts.add(lblPunkte);
		
		JLabel lbl_frontName = new JLabel("");
		lbl_frontName.setForeground(Color.WHITE);
		lbl_frontName.setFont(new Font("Old English Text MT", Font.PLAIN, 30));
		lbl_frontName.setBounds(207, 108, 185, 38);
		pnl_rechts.add(lbl_frontName);
		
		JLabel lbl_fuehrung = new JLabel("In F\u00FChrung:");
		lbl_fuehrung.setForeground(Color.WHITE);
		lbl_fuehrung.setFont(new Font("Old English Text MT", Font.PLAIN, 30));
		lbl_fuehrung.setBounds(35, 108, 220, 38);
		pnl_rechts.add(lbl_fuehrung);
		
		JLabel lblWelcheWrfelSollen = new JLabel("Welche W\u00FCrfel sollen stehen bleiben:");
		lblWelcheWrfelSollen.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWelcheWrfelSollen.setForeground(Color.WHITE);
		lblWelcheWrfelSollen.setBounds(80, 479, 273, 14);
		pnl_rechts.add(lblWelcheWrfelSollen);
		lblWelcheWrfelSollen.setVisible(false);
		
		JLabel label_1 = new JLabel("Kniffel");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 50));
		label_1.setBackground(new Color(139, 69, 19));
		label_1.setBounds(89, 25, 262, 61);
		pnl_rechts.add(label_1);
		
		
	
		
/*-----------------------------------------Buttons-----------------------------------------------------------------------------------------------------*/		
		
		//5 Radiobuttons, die sp�ter zum Blockieren der W�rfel dienen
		JRadioButton rdbtn_w1 = new JRadioButton("");
		rdbtn_w1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtn_w1.setBackground(SystemColor.controlShadow);
		rdbtn_w1.setBounds(80, 505, 21, 23);
		pnl_rechts.add(rdbtn_w1);
		rdbtn_w1.setVisible(false);
		
		JRadioButton rdbtn_w2 = new JRadioButton("");
		rdbtn_w2.setBackground(SystemColor.controlShadow);
		rdbtn_w2.setBounds(140, 505, 21, 23);
		pnl_rechts.add(rdbtn_w2);
		rdbtn_w2.setVisible(false);
		
		JRadioButton rdbtn_w3 = new JRadioButton("");
		rdbtn_w3.setBackground(SystemColor.controlShadow);
		rdbtn_w3.setBounds(200, 505, 21, 23);
		pnl_rechts.add(rdbtn_w3);
		rdbtn_w3.setVisible(false);
		
		JRadioButton rdbtn_w4 = new JRadioButton("");
		rdbtn_w4.setBackground(SystemColor.controlShadow);
		rdbtn_w4.setBounds(260, 505, 21, 23);
		pnl_rechts.add(rdbtn_w4);
		rdbtn_w4.setVisible(false);
		
		JRadioButton rdbtn_w5 = new JRadioButton("");
		rdbtn_w5.setBackground(SystemColor.controlShadow);
		rdbtn_w5.setBounds(320, 505, 21, 23);
		pnl_rechts.add(rdbtn_w5);
		rdbtn_w5.setVisible(false);
		
			//Hintergrund 
			JLabel lbl_rechts = new JLabel("New label");
			lbl_rechts.setBounds(0, 0, 402, 548);
			pnl_rechts.add(lbl_rechts);
			lbl_rechts.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/floor-1256804_1280.jpg")));
		
		
		//Button placed on panel 2 + Actionlistener
		btn_nextZug = new JButton("N\u00E4chster Spieler");
		btn_nextZug.setEnabled(false);
		btn_nextZug.setBounds(221, 11, 120, 23);
		pnl_buttons.add(btn_nextZug);
		//W�rfelbutton placed on panel 2
		JButton btnWrfeln = new JButton("W\u00FCrfeln");
		btnWrfeln.setBounds(77, 11, 89, 23);
		pnl_buttons.add(btnWrfeln);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/balken.png")));
		lblNewLabel_3.setBounds(0, 0, 402, 47);
		pnl_buttons.add(lblNewLabel_3);
		
		/*----------------------------------Functions-------------------------------------------------------------------------------------------------*/
		
		/*w�rfelknopf (ruft w�rfelmethode aus w�rfelklasse auf) und l�sst verf�gbare Punkte in Tabelle eintragen, auch Sonderregelungen werden gepr�ft*/
		btnWrfeln.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
				if(wurfCounter==3|| zugEnde == true){
					JOptionPane.showMessageDialog(null, "W�rfeln nicht mehr m�glich.");
					btnWrfeln.setEnabled(false);
					
				}else{
					//Werte vom vorherigen W�rfeln zur�cksetzen (f�r Sonderregeln)
					boolean fullPoints = false;
					boolean streichen = false;
					
					//Radiobuttons visible setzen
					lblWelcheWrfelSollen.setVisible(true);
					rdbtn_w1.setVisible(true);
					rdbtn_w2.setVisible(true);
					rdbtn_w3.setVisible(true);
					rdbtn_w4.setVisible(true);
					rdbtn_w5.setVisible(true);
					
					//W�rfeln
					w�rfel1.w�rfeln(w�rfel1);
					w�rfel1.w�rfeln(w�rfel2);
					w�rfel1.w�rfeln(w�rfel3);
					w�rfel1.w�rfeln(w�rfel4);
					w�rfel1.w�rfeln(w�rfel5);
					
					//Jetzt Schleife f�r Bilder
					for(int i = 1;i<w�rfellabel.length;i++){	 
						//Bounds setzen
						switch(i){
						case 1: w�rfellabel[i].setBounds(60, 411, 56, 57);
						break;
						case 2: w�rfellabel[i].setBounds(120, 411, 56, 57);
						break;
						case 3:w�rfellabel[i].setBounds(180, 411, 56, 57);
						break;
						case 4: w�rfellabel[i].setBounds(240, 411, 56, 57);
						break;
						case 5: w�rfellabel[i].setBounds(300, 411, 56, 57);		
						break;
						}
						pnl_rechts.add(w�rfellabel[i]);
						System.out.println("Augenzahlen"+KniffelSpiel.ermittleW�rfel(i).augenzahl);
						int augenzahl =KniffelSpiel.ermittleW�rfel(i).getAugenzahl();
						switch(augenzahl){
						case 1:  w�rfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 150x50.png")));
		                break;
						case 2:  w�rfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 250x50.png")));
		                break;
						case 3:  w�rfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 350x50.png")));
		                break;
						case 4:  w�rfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 450x50.png")));
		                break;
						case 5:  w�rfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 550x50.png")));
		                break;
						case 6:  w�rfellabel[i].setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/wuerfel 650x50.png")));
						break;
						        }
						lbl_rechts.add(w�rfellabel[i]);
						w�rfellabel[i].setVisible(true);
							
					}//Ende For 
					
					//Pr�fen ob Kniffel (F�r Kniffel Sonderregel)
					//Wenn Kniffel, dann Bl�cke pr�fen und dementsprechend Regelpr�fung �bergabeparameter anpassen um Punkte in Regelmethoden anzupassen
					if(w�rfel1.getAugenzahl()==w�rfel2.getAugenzahl()&&w�rfel2.getAugenzahl()==w�rfel3.getAugenzahl()&&w�rfel3.getAugenzahl()==w�rfel4.getAugenzahl()&&w�rfel4.getAugenzahl()==w�rfel5.getAugenzahl()){
						if(tableBlock[actPlayer-1][11]==true){//Kniffel schonmal?
							if(tableBlock[actPlayer-1][w�rfel1.getAugenzahl()]==true){
								if(bottomRuleCount==0){
									streichen=true;				
								}else{
									fullPoints=true;	
								}
							}else{
								kniffelBonus=50;
							}
						}
					}
					
					//Regelarray bef�llen
					regelArray[0]= Regelwerk.einser(streichen);
					regelArray[1]= Regelwerk.zweier(streichen);
					regelArray[2]= Regelwerk.dreier(streichen);
					regelArray[3]= Regelwerk.vierer(streichen);
					regelArray[4]= Regelwerk.fuenfer(streichen);
					regelArray[5]= Regelwerk.sechser(streichen);
					regelArray[6]= Regelwerk.dreierPasch();
					regelArray[7]= Regelwerk.viererPasch(fullPoints);
					regelArray[8]= Regelwerk.fullHouse(fullPoints);
					regelArray[9]= Regelwerk.kleineStra�e(fullPoints);
					regelArray[10]= Regelwerk.gro�eStra�e(fullPoints);
					regelArray[11]= Regelwerk.kniffel();
					regelArray[12]= Regelwerk.chance();
				
					//Oberen Block pr�fen
					for(int k =0; k<6;k++){
						if(tableBlock[actPlayer-1][k]== false){
							tbl_KniffelBlock.setValueAt(regelArray[k], k+1, actPlayer);
						}
					}
						//Unteren Block pr�fen
						for(int k =6; k<=12;k++){
							if(tableBlock[actPlayer-1][k]== false){
								tbl_KniffelBlock.setValueAt(regelArray[k], k+4, actPlayer);	
							}
						
						}
					
				}//Ende if, die pr�ft ob schon 3 mal gew�rfelt
				gew�rfelt = true;
				wurfCounter++;
			
		}});// ENDE W�RFEL BUTTON
		
		
		/*Action Listener f�r n�chsten Zug, hier werden alle wichtigen Komponenten zur�ckgesetzt und die Punkte zusammenaddiert.
		 * Punkte werden in eine Punkteliste eingetragen und der aktuelle Spieler wird aktualisiert
		 * Des Weiteren wird bei Erreichen des Spielendes die Siegerehrung in einem neuen Fenster gestartet*/
		 
		btn_nextZug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(spielEnde==true){
					btn_nextZug.setEnabled(false);
					btnWrfeln.setEnabled(false);
					Highscore wnd2 = new Highscore();
     				wnd2.setVisible(true);
     				dispose();
				}else{
					//f�r Sonderregeln zur�ckgesetzt
					bottomRuleCount=0;
					
					for(int i=1;i<=5;i++){
						w�rfellabel[i].setVisible(false);
					
					}
					//Buttons zur�cksetzen
					btnWrfeln.setEnabled(true);
					lblWelcheWrfelSollen.setVisible(false);
	
					rdbtn_w1.setSelected(false);
					rdbtn_w1.setEnabled(true);
					rdbtn_w1.setVisible(false);
					
					rdbtn_w2.setSelected(false);
					rdbtn_w2.setEnabled(true);
					rdbtn_w2.setVisible(false);
					
					rdbtn_w3.setSelected(false);
					rdbtn_w3.setEnabled(true);
					rdbtn_w3.setVisible(false);
					
					rdbtn_w4.setSelected(false);
					rdbtn_w4.setEnabled(true);
					rdbtn_w4.setVisible(false);
					
					rdbtn_w5.setSelected(false);
					rdbtn_w5.setEnabled(true);
					rdbtn_w5.setVisible(false);
					
					//W�rfel deblockiert
					w�rfel1.block(w�rfel1,false);
					w�rfel2.block(w�rfel2,false);
					w�rfel3.block(w�rfel3,false);
					w�rfel4.block(w�rfel4,false);
					w�rfel5.block(w�rfel5,false);
					
					//Nicht eingetragene Werte zur�ckgesetzt
					for(int k =0; k<6;k++){
						
						if(tableBlock[actPlayer-1][k]== false){
							tbl_KniffelBlock.setValueAt("", k+1, actPlayer);
						}
						
					}
						//Unteren Block pr�fen
						for(int k =6; k<=12;k++){
							if(tableBlock[actPlayer-1][k]== false){
								tbl_KniffelBlock.setValueAt("", k+4, actPlayer);	
								bottomRuleCount++; //f�r Sonderregeln hochz�hlen, um zu sehen, ob unterer Block voll
							}
						
						}
					//Punkte oben zusammenz�hlen	
					if(row<=6){
							upPoints[actPlayer] =upPoints[actPlayer] + Integer.parseInt(tbl_KniffelBlock.getValueAt(row, actPlayer).toString());
							tbl_KniffelBlock.setValueAt(upPoints[actPlayer], 7, actPlayer);
					//Punkte unten zusammenz�hlen		
					}else{
							bottomPoints[actPlayer] = bottomPoints[actPlayer] +Integer.parseInt(tbl_KniffelBlock.getValueAt(row, actPlayer).toString());
							tbl_KniffelBlock.setValueAt(bottomPoints[actPlayer], 17, actPlayer);
					}
					//Gesamtpunkte oben (+Bonus)
					tbl_KniffelBlock.setValueAt(upPoints[actPlayer]+Integer.parseInt(tbl_KniffelBlock.getValueAt(8, actPlayer).toString()), 9, actPlayer);
					//Bonus pr�fen
					if(upPoints[actPlayer]>=63){
						tbl_KniffelBlock.setValueAt(35, 8, actPlayer);
					}
					
					//Gesamtpunkte (oben+unten)+ Eventueller Kniffelbonus
					int gesamtPunkte =upPoints[actPlayer]+bottomPoints[actPlayer]+kniffelBonus;
					System.out.println("Gesamtpunkte:"+gesamtPunkte);
					tbl_KniffelBlock.setValueAt(upPoints[actPlayer]+bottomPoints[actPlayer]+kniffelBonus,18,actPlayer);
					
					//Punkte in PunkeListe hinzuf�gen
					KniffelSpiel.punkteHinzufuegen(gesamtPunkte,KniffelSpiel.ermittleSpieler(actPlayer).getName());
					
					//SpielerListe aktualisieren
					KniffelSpiel.spielerHinzuf�gen(KniffelSpiel.ermittleSpieler(actPlayer).getName(),actPlayer, upPoints[actPlayer]+bottomPoints[actPlayer]+kniffelBonus);
					
					//Spieler aktualisieren
					if(actPlayer==KniffelSpiel.spielerCount()){
						actPlayer = KniffelSpiel.ermittleSpieler(1).getSpielerID();
					}else{
						actPlayer++;
					}
					
					//F�hrung anzeigen
					lbl_frontName.setText(KniffelSpiel.punkteListe.last().getName());
					lbl_points.setText(Integer.toString(KniffelSpiel.punkteListe.last().getPunkte()));
					
					//N�chsten Zug anzeigen
					JOptionPane.showMessageDialog(null, KniffelSpiel.ermittleSpieler(actPlayer).getName() +"ist dran!");
					tbl_KniffelBlock.changeSelection(0,actPlayer, false, false);
					wurfCounter =0;
					gew�rfelt = false;
					zugEnde = false;
					btn_nextZug.setEnabled(false);
					
				}
			}
		});
		
				//Spieler in Tabelle eintragen
				for(int i = 1; i<=KniffelSpiel.spielerCount();i++){
					tbl_KniffelBlock.setValueAt(KniffelSpiel.ermittleSpieler(i).getName(),0, i);
				}
		
		// Radiobuttonsfunktionen
		//eins
		rdbtn_w1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel1.block(w�rfel1,true);
				rdbtn_w1.setEnabled(false);
			}
		});
		// zwei
		rdbtn_w2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel2.block(w�rfel2,true);
				rdbtn_w2.setEnabled(false);
			}
		});
		
		//drei
		rdbtn_w3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel3.block(w�rfel3,true);
				rdbtn_w3.setEnabled(false);
			}
		});
		
		//vier
		rdbtn_w4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel4.block(w�rfel4,true);
				rdbtn_w4.setEnabled(false);
			}
		});
		
		//f�nf
		rdbtn_w5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel5.block(w�rfel5,true);
				rdbtn_w5.setEnabled(false);
			}
		});
		
		
		
		/* Funktion die Werte in die Tabelle eintr�gt, pr�ft ob Spielende erreicht*/
		tbl_KniffelBlock.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(zugEnde==true){}else{	
					 row = tbl_KniffelBlock.getSelectedRow();
					if(gew�rfelt == false){
						JOptionPane.showMessageDialog(null, "Bitte erst W�rfeln");
					}else{
						int dialogResult = JOptionPane.showConfirmDialog(null, "Wert eintragen?", "Achtung", JOptionPane.OK_CANCEL_OPTION);
						if(dialogResult==JOptionPane.OK_OPTION){
						
						//Wert blockieren, wenn nicht schon blockiert!
						
							if(row>0&&row<=6){
								if(tableBlock[actPlayer-1][row-1]== true){
									JOptionPane.showMessageDialog(null, "Dieser Wert ist schon gespeichert!");
								}else
								{
									tableBlock[actPlayer-1][row-1]= true;
									System.out.println("blockiert: "+ "Zeile: " +row);
									zugEnde = true;
									btn_nextZug.setEnabled(true);	
								}
							}else{
								if(row>9 && row<17){
									if(tableBlock[actPlayer-1][row-4]== true){
										JOptionPane.showMessageDialog(null, "Dieser Wert ist schon gespeichert!");
									}else
									{
										tableBlock[actPlayer-1][row-4]= true;
										System.out.println("blockiert: "+ "Zeile: " +row);
										zugEnde = true;
										btn_nextZug.setEnabled(true);
									}
								}else{
									JOptionPane.showMessageDialog(null, "Keine Eintragung in diese Felder m�glich");
								}
						}
					}
				}
					//Abbruchbedingung f�r Spielende, hier wird geschaut, ob jeder Eintrag im boolean-Array auf true, dann Spielende 
					entryCount=0;
					for (int x =0; x<tableBlock.length;x++){
						for (int y=0; y< 13;y++){
							if(tableBlock[x][y]== true){
								entryCount++;		
								System.out.println("entrycount:"+""+entryCount);
							}
							if(entryCount == 13*KniffelSpiel.spielerCount()){
								 spielEnde = true;
								btn_nextZug.setText("Spiel beenden!");
								btn_nextZug.setForeground(Color.GREEN);
								
							}
							
						}
					}
				}
			}
		});
	        
		
		}// Ende Main Gui Funktion
}

