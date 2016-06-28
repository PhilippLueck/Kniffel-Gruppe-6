package kniffel.Kniffel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.text.MaskFormatter;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;

public class Start extends JFrame {
	
	//MASK FORMATTER FÜR TEXTFELDER
	private JPanel startMainPane;
	private JLabel lbl_playerHead;
	private JPanel pnl_playerList;
	
	
	private JTextField[] players;
	private JLabel[] labels;
	private String[] player_names;
	
	private boolean ready = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.yo.
	 */
	
	
	
	public Start() {
		//Main Pain
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 406);
		startMainPane = new JPanel();
		startMainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(startMainPane);
		startMainPane.setLayout(null);
		
		//Player Panel
		JPanel pnl_player = new JPanel();
		pnl_player.setBackground(Color.LIGHT_GRAY);
		pnl_player.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_player.setBounds(0, 75, 308, 292);
		startMainPane.add(pnl_player);
		pnl_player.setLayout(null);
		
		//comboListe -> Später in Combobox
		 String comboBoxListe[] = {"1","2","3","4","5","6","7","8"}; 
		 
		// Player Array, label Array, Namens Array
		 this.players = new JTextField[8];
		 this.labels = new JLabel[8];
		 this.player_names = new String[8];
		 
		 //Maskformatter für Textfelder
		 try {
			MaskFormatter formatter = new MaskFormatter("????????????????????");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 //Schleife, für jeden Player ein neues Textfeld
		 for(int i = 0; i < players.length; i++){
			 players[i] = new JTextField();
			 players[i].setBounds(147, Parameters.YCOORDS_TEXTFIELD[i], 86, 20);
			 pnl_player.add(players[i]);
			 players[i].setColumns(10);
			 players[i].setVisible(false);
			 labels[i] = new JLabel("Spieler " + (i+1) + ": ");
			 labels[i].setBounds(64, Parameters.YCOORDS_LABEL[i], 73, 14);
			 pnl_player.add(labels[i]);
			 labels[i].setVisible(false);
		 }
		 
		 

		//playerhead, also playerlist Überschrift
		lbl_playerHead = new JLabel("Spieler:");
		lbl_playerHead.setForeground(new Color(255, 255, 255));
		lbl_playerHead.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_playerHead.setBounds(113, 8, 81, 29);
		pnl_player.add(lbl_playerHead);
		

		pnl_playerList = new JPanel();
		pnl_playerList.setBackground(new Color(192, 192, 192));
		pnl_playerList.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl_playerList.setBounds(50, 40, 215, 252);
		pnl_player.add(pnl_playerList);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Start.class.getResource("/kniffel/Kniffel/Images/floor-1256804_640.jpg")));
		lblNewLabel.setBounds(0, 0, 308, 292);
		pnl_player.add(lblNewLabel);
		
		//Options Panel, Spieler wählen usw
		JPanel pnl_options = new JPanel();
		pnl_options.setBounds(308, 75, 211, 292);
		startMainPane.add(pnl_options);
		pnl_options.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_options.setBackground(new Color(255, 255, 255));
		pnl_options.setLayout(null);
		
		
		//Closebutton schließt Programm
		JButton btn_close = new JButton("Beenden");
		btn_close.setForeground(Color.RED);
		btn_close.setBounds(112, 228, 89, 23);
		pnl_options.add(btn_close);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit( 0 );
				
			}
		});
		
		//Combobox mit Daten aus Comboliste von oben
		JComboBox cb_playernumber = new JComboBox(comboBoxListe);
		cb_playernumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				 
				 int spieleranzahl = Integer.parseInt((String)cb_playernumber.getSelectedItem());
				 
				 System.out.println("Spieleranzahl: "+ spieleranzahl );
				 for (int i = 0; i < 8; i++) {
					 if(i <spieleranzahl){
						 players[i].setVisible(true);
						 labels[i].setVisible(true);
					 }
					 else{
						 players[i].setVisible(false);
						 labels[i].setVisible(false);
					 }
				}	
			
			}
		});
		
		//Playernummer
		cb_playernumber.setBounds(112, 92, 64, 20);
		pnl_options.add(cb_playernumber);
		//panel_1.add(panel);
       pnl_options.setVisible(true);
       
       //label Playernummer
       JLabel lbl_playernumber = new JLabel("Anzahl Spieler:");
       lbl_playernumber.setBounds(21, 95, 92, 14);
       pnl_options.add(lbl_playernumber);
       
       //Überschrift ganz oben (Header)
       JLabel lbl_welcome = new JLabel("Willkommen bei Kniffel");
       lbl_welcome.setBounds(41, 45, 135, 14);
       pnl_options.add(lbl_welcome);
       
     //Startbutton
     		JButton btn_start = new JButton("Start");
     		btn_start.setForeground(new Color(0, 128, 0));
     		btn_start.setBounds(10, 228, 89, 23);
     		pnl_options.add(btn_start);
     		btn_start.setEnabled(false); 
     		
     		//Start button öffnet main Gui
     		//Erzeugt Würfel
     		btn_start.addActionListener(new ActionListener() {
     			public void actionPerformed(ActionEvent e) {	
     				//öffnen von main Gui
     				MainGui wnd = new MainGui();
     				wnd.setVisible(true);
     				dispose();
     			}
     		});
       
       //ready button
       JButton btn_ready = new JButton("Bereit");
       btn_ready.setBounds(54, 147, 89, 23);
       pnl_options.add(btn_ready);
       
       // Jetzt Actionlistener Start Button
       //disabled die Namen der Spieler und enabled den Start button
       btn_ready.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		for (int i = 0; i < 8; i++) {	
       		players[i].setEnabled(false);
       		labels[i].setEnabled(false);	
	       		}//Schleifenende
	       		
	       		//Jetzt Spieler erstellen
	       		//Spieler werden in Listen eingetragen und sotiert mit comparable in Spielerklasse
	       		int spieleranzahl = Integer.parseInt((String)cb_playernumber.getSelectedItem());
	       		for (int j = 0; j<spieleranzahl; j++){
	       			if(players[j].getText().isEmpty()){
	           			JOptionPane.showMessageDialog(null, "Name von Spieler "+( j+1) + " fehlt!");
	           			players[j].setEnabled(true);
	               		labels[j].setEnabled(true);
	           		}else{
	           			KniffelSpiel.spielerHinzufügen(players[j].getText(),j+1,0,0);	
	           			ready = true;
	           		}
	       		}//Schleifenende

	       		//Jetzt Spieler ausgeben
	       		Iterator<Spieler> spielerIterator = KniffelSpiel.spielerListe.iterator();//Iterator ´nach collections!!! Sonst putt.			
	       		while(spielerIterator.hasNext()){
	       			Spieler selectedSpieler = spielerIterator.next();
	       			System.out.println(selectedSpieler.getSpielerID()+","+ selectedSpieler.getName() );
	       		}//Ende While
	       		if(ready == true){
	       			btn_start.setEnabled(true);	
	       		}else{
	       			System.out.println( "Starten nicht möglich.");
	       		}//ende if
       }// Ende Action Listener
     });//ende Action Listener
       
       //progress bar
       JProgressBar progressBar = new JProgressBar();
       progressBar.setBounds(10, 203, 191, 14);
       pnl_options.add(progressBar);
       
       //help button
       JButton btn_help = new JButton("Hilfe");
       btn_help.setBounds(54, 262, 89, 23);
       pnl_options.add(btn_help);
       
       //HEAD Panel
       JPanel pnl_head = new JPanel();
       pnl_head.setBackground(Color.WHITE);
       pnl_head.setBounds(0, 0, 519, 75);
       startMainPane.add(pnl_head);
       pnl_head.setLayout(null);
       
       //HEAD Label
       JLabel lbl_Head = new JLabel("Kniffel");
       lbl_Head.setFont(new Font("Arial", Font.PLAIN, 50));
       lbl_Head.setBounds(0, 0, 347, 53);
       pnl_head.add(lbl_Head);
       
       //group label
       JLabel lbl_group = new JLabel(" by Gruppe 6");
       lbl_group.setFont(new Font("Arial", Font.PLAIN, 20));
       lbl_group.setBounds(0, 43, 139, 32);
       pnl_head.add(lbl_group);
       
       //Instructions Button (noch ausfüllen)
       JButton btn_instruction = new JButton("Anleitung");
       btn_instruction.setBounds(311, 17, 198, 46);
       pnl_head.add(btn_instruction);
       
       
       
       //Öffnet Anleitung
       btn_instruction.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		Anleitung anl;
			try {
				anl = new Anleitung();
				anl.setVisible(false);
			} catch (HeadlessException | IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
			
       	}
       });
       
	
	}
}