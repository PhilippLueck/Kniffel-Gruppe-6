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
import javax.swing.JFormattedTextField;
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
	
	
	private JFormattedTextField[] players;
	private JLabel[] labels;
	private String[] player_names;
	private int spieleranzahl=1;
	private boolean ready = false;
	
	public Start() {
		setResizable(false);
		//Main Pain
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 392);
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
		 this.players = new JFormattedTextField[8];
		 this.labels = new JLabel[8];
		 this.player_names = new String[8];
		 
		 
		 /*Schleife die für jeden Spieler ein Textfield erstellt, setzt sie aber ersteinmal disabled/not visible*/
		 for(int i = 0; i < players.length; i++){
			 try {
					players[i] = new JFormattedTextField(new MaskFormatter("????????"));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 players[i].setBounds(147, Parameters.YCOORDS_TEXTFIELD[i], 86, 20);
			 pnl_player.add(players[i]);
			 //players[i].setColumns(10);
			 players[i].setFocusLostBehavior(JFormattedTextField.COMMIT);
			 players[i].setVisible(false);
			 
			 labels[i] = new JLabel("Spieler " + (i+1) + ": ");
			 labels[i].setBounds(64, Parameters.YCOORDS_LABEL[i], 73, 14);
			 pnl_player.add(labels[i]);
			 labels[i].setVisible(false);
		 }
		 
		 //Spieler 1 aber schon visible setzen
		 players[0].setVisible(true);
		 labels[0].setVisible(true);
		 

		//playerhead, also playerlist Überschrift
		lbl_playerHead = new JLabel("Spieler:");
		lbl_playerHead.setForeground(new Color(255, 255, 255));
		lbl_playerHead.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_playerHead.setBounds(113, 8, 81, 29);
		pnl_player.add(lbl_playerHead);
		

		pnl_playerList = new JPanel();
		pnl_playerList.setBackground(new Color(255, 255, 255));
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
		pnl_options.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		
		/*Combobox liest Spieleranzahl aus und setzt dementsprechend Textfelder visible/enabled*/
		JComboBox cb_playernumber = new JComboBox(comboBoxListe);
		cb_playernumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				 
				 spieleranzahl = Integer.parseInt((String)cb_playernumber.getSelectedItem());
				 
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
       
      //Zurücksetzen Button
  		JButton btn_cancel = new JButton("zur\u00FCck");
  		btn_cancel.setBounds(112, 162, 89, 23);
  		pnl_options.add(btn_cancel);
  		
     //Startbutton
     	JButton btn_start = new JButton("Start");
     	btn_start.setForeground(new Color(0, 128, 0));
   		btn_start.setBounds(10, 228, 89, 23);
   		pnl_options.add(btn_start);
   		btn_start.setEnabled(false); 
     		
     		
     		/*Startbutton fügt Spieler in Spieler Treeset hinzu und öffnet die Main GUI*/
     		btn_start.addActionListener(new ActionListener() {
     			public void actionPerformed(ActionEvent e) {
     				//Jetzt Spieler erstellen
    	       		//Spieler werden in Listen eingetragen und sotiert mit comparable in Spielerklasse
    	       		int spieleranzahl = Integer.parseInt((String)cb_playernumber.getSelectedItem());
    	       		for (int j = 0; j<spieleranzahl; j++){
    	       		KniffelSpiel.spielerHinzufügen(players[j].getText(),j+1,0);	  		
    	       		}
    	       			
    	       		//Jetzt Spieler aus Spielerliste ausgeben (Zur Kontrolle)
    		       	Iterator<Spieler> spielerIterator = KniffelSpiel.spielerListe.iterator();//Iterator ´nach collections!!! Sonst putt.			
    		       	while(spielerIterator.hasNext()){
    		       		Spieler selectedSpieler = spielerIterator.next();
    		       		System.out.println(selectedSpieler.getSpielerID()+","+ selectedSpieler.getName() );
    		       	}//Ende While
    	       		//Schleifenende
    	       		
     				//öffnen von main Gui wenn ready true
    		       	if(ready==true)	{
	     				MainGui wnd = new MainGui();
	     				wnd.setVisible(true);
	     				dispose();
    		       	}else{}
     		}
     		});
     		

       
       /*Bei klick auf Bereit, Startbutton wird enabled wenn Spielernamen nicht leer und die Eingabe kann nochmal kontrolliert werden*/
       JButton btn_ready = new JButton("Bereit");
       btn_ready.setBounds(10, 162, 89, 23);
       pnl_options.add(btn_ready);
       btn_ready.addActionListener(new ActionListener() { 
       	public void actionPerformed(ActionEvent e) {
            ready=true;
       		for (int i = 0; i < 8; i++) {	
	       		players[i].setEnabled(!players[i].isEnabled());
	       		btn_ready.setEnabled(false);
	       		cb_playernumber.setEnabled(false);
       		}
       		
       		for(int j =0;j<spieleranzahl;j++){
       			if(players[j].getText().equals("        ")||players[j].getText().isEmpty()){// Muss leider so gemacht werden wegen MaskFormatter
   				ready = false;
       			}
       		}
       		if(ready==true){
       			btn_start.setEnabled(true);
       		}else{
       			JOptionPane.showMessageDialog(null, "Spielernamen fehlen!");
       		}
       }// Ende Action Listener

     });//ende Action Listener
       
       /*Zurück AcionListener. Bei falscher Eingabe werden Textfelder zurückgesetzt und eine neue Spielereingabe kann erfolgen*/
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn_start.setEnabled(false);
				cb_playernumber.setEnabled(true);
				for (int i = 0; i < spieleranzahl; i++) {
						 players[i].setVisible(true);
						 players[i].setText("");
						 players[i].setEnabled(true);
						 labels[i].setVisible(true);
					 }
				for (int i = spieleranzahl;i<8;i++){
					players[i].setEnabled(true);
				}
				btn_ready.setEnabled(true);
			}
		});
     
       
       //help button
       JButton btn_help = new JButton("Hilfe");
       btn_help.setBounds(64, 262, 89, 23);
       pnl_options.add(btn_help);
       
       
       JLabel lblNewLabel_1 = new JLabel("New label");
       lblNewLabel_1.setIcon(new ImageIcon(Start.class.getResource("/kniffel/Kniffel/Images/w\u00FCrfelbilderangepasstverschwommen.png")));
       lblNewLabel_1.setBounds(0, 0, 211, 292);
       pnl_options.add(lblNewLabel_1);
       
       //HEAD Panel
       JPanel pnl_head = new JPanel();
       pnl_head.setBorder(null);
       pnl_head.setBackground(new Color(255, 255, 255));
       pnl_head.setBounds(0, 0, 519, 75);
       startMainPane.add(pnl_head);
       pnl_head.setLayout(null);
       
       //HEAD Label
       JLabel lbl_Head = new JLabel("Kniffel");
       lbl_Head.setBackground(new Color(255, 255, 255));
       lbl_Head.setFont(new Font("Arial", Font.PLAIN, 50));
       lbl_Head.setBounds(0, 0, 347, 53);
       pnl_head.add(lbl_Head);
       
       //group label
       JLabel lbl_group = new JLabel(" by Gruppe 6");
       lbl_group.setFont(new Font("Arial", Font.PLAIN, 20));
       lbl_group.setBounds(0, 43, 139, 32);
       pnl_head.add(lbl_group);
       
       //Anleitungsbutton
       JButton btn_instruction = new JButton("Anleitung");
       btn_instruction.setBounds(311, 17, 198, 46);
       pnl_head.add(btn_instruction);
       
     //Öffnet Hilfe Button
       btn_help.addActionListener(new ActionListener() {
          	public void actionPerformed(ActionEvent e) {
          		 JOptionPane.showMessageDialog(null,"Informationen zur Nutzung des Programms erhältst du in der beiliegenden Anleitung");
          		
          	}
         
          });
       
       
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