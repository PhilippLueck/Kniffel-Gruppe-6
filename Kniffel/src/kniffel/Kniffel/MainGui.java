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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
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
	JLabel[] w�rfellabel;
	private JTable tbl_KniffelBlock;
	private Regelwerk Regelwerk = new Regelwerk();
	private boolean[][] tableBlock= new boolean[(KniffelSpiel.spielerCount())][12];
	private  int wurfCounter =0;
	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
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
		
		// W�rfel erstellen
		W�rfel w�rfel1 = new W�rfel(1,0, 0, false);
		W�rfel w�rfel2 = new W�rfel(2,0, 0, false);
		W�rfel w�rfel3 = new W�rfel(3,0, 0, false);
		W�rfel w�rfel4 = new W�rfel(4,0, 0, false);
		W�rfel w�rfel5 = new W�rfel(5,0, 0, false);
		
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel1);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel2);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel3);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel4);
		KniffelSpiel.w�rfelHinzuf�gen(w�rfel5);
		
		
		//Array bef�llen, was Jtable Zellen simuliert
		for (int x =0; x<tableBlock.length;x++){
			for (int y=0; y< 12;y++){
				tableBlock[x][y]= false;
			}
		}
		
		
		//w�rfellabel 
		w�rfellabel = new JLabel[6];
		
		// Hier labels deklarieren
		for(int i=1;i<w�rfellabel.length;i++){
		w�rfellabel[i] = new JLabel();
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
		//W�rfelbutton placed on panel 2
		JButton btnWrfeln = new JButton("W\u00FCrfeln");
		btnWrfeln.setBounds(161, 11, 89, 23);
		pnl_buttons.add(btnWrfeln);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(MainGui.class.getResource("/kniffel/Kniffel/Images/balken.png")));
		lblNewLabel_3.setBounds(0, 0, 402, 47);
		pnl_buttons.add(lblNewLabel_3);
		
		//w�rfelknopf (ruft w�rfelmethode aus w�rfelklasse auf)
		btnWrfeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(wurfCounter==3){
					JOptionPane.showMessageDialog(null, "bitte Werte eintragen, schon 3 mal gew�rfelt!");
					btnWrfeln.setEnabled(false);
				}else{
					//checken, wie oft radiobutton geklickt
					
					
					//W�rfelliste ausgeben
					KniffelSpiel.w�rfelListeAusgeben();
					
					//W�rfeln
					System.out.println("W�RFEL DA?");
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
				
					//Hier Regelpr�fungen
				System.out.println("REGELPR�FUNGEN");
				
				System.out.println("Einser : "+Regelwerk.einser());
				tbl_KniffelBlock.setValueAt(Regelwerk.einser(), 1, 1);
				
				System.out.println("Zweier : "+Regelwerk.zweier());
				tbl_KniffelBlock.setValueAt(Regelwerk.zweier(),2, 1);
				
				System.out.println("Dreier : "+Regelwerk.dreier());
				tbl_KniffelBlock.setValueAt(Regelwerk.dreier(),3, 1);
				
				System.out.println("Vierer : "+Regelwerk.vierer());
				tbl_KniffelBlock.setValueAt(Regelwerk.vierer(),4, 1);
				
				System.out.println("F�nfer : "+Regelwerk.fuenfer());
				tbl_KniffelBlock.setValueAt(Regelwerk.fuenfer(),5, 1);
				
				System.out.println("Sechser : "+Regelwerk.sechser());
				tbl_KniffelBlock.setValueAt(Regelwerk.sechser(),6, 1);
				
				System.out.println("Dreierpasch :"+ Regelwerk.dreierPasch());
				tbl_KniffelBlock.setValueAt(Regelwerk.dreierPasch(),10, 1);
				
				System.out.println("Viererpasch: "+ Regelwerk.viererPasch());
				tbl_KniffelBlock.setValueAt(Regelwerk.viererPasch(),11, 1);
				
				System.out.println("Full-House: "+ Regelwerk.fullHouse());
				tbl_KniffelBlock.setValueAt(Regelwerk.fullHouse(), 12, 1);
				
				System.out.println("kleine Stra�e: "+ Regelwerk.kleineStra�e());
				tbl_KniffelBlock.setValueAt(Regelwerk.kleineStra�e(),13, 1);
				
				System.out.println("gro�e Stra�e: "+ Regelwerk.gro�eStra�e());
				tbl_KniffelBlock.setValueAt(Regelwerk.gro�eStra�e(),14, 1);
				
				System.out.println("Kniffel :"+ Regelwerk.kniffel());
				tbl_KniffelBlock.setValueAt(Regelwerk.kniffel(), 15, 1);
				
				System.out.println("Chance :"+ Regelwerk.chance());
				tbl_KniffelBlock.setValueAt(Regelwerk.chance(),16, 1);
				
				//W�rfelliste ausgeben
				System.out.println("W�RFEL �BERSCHRIEBEN");
				KniffelSpiel.w�rfelListeAusgeben();
				
				
				}//Ende if, die pr�ft ob schon 3 mal gew�rfelt
			
				wurfCounter++;
			//Hier in Liste eintragen
		}});
		// Radiobuttonsfunktionen
		
		//eins
		rdbtn_w1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel1.block(w�rfel1);
			}
		});
		// zwei
		rdbtn_w2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel2.block(w�rfel2);
			}
		});
		
		//drei
		rdbtn_w3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel3.block(w�rfel3);
			}
		});
		
		//vier
		rdbtn_w4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel4.block(w�rfel4);
			}
		});
		
		//f�nf
		rdbtn_w5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w�rfel5.block(w�rfel5);
			}
		});
		
		
			
		
		}// Ende Main Gui Funktion
}
