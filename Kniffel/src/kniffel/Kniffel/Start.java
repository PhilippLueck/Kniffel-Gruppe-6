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
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JProgressBar;

public class Start extends JFrame {

	private JPanel startMainPane;
	private JLabel lbl_playerHead;
	private JPanel pnl_playerList;
	
	
	private JTextField[] players;
	private JLabel[] labels;
	private String[] player_names;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 406);
		startMainPane = new JPanel();
		startMainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(startMainPane);
		startMainPane.setLayout(null);
		
		JPanel pnl_player = new JPanel();
		pnl_player.setBackground(Color.LIGHT_GRAY);
		pnl_player.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_player.setBounds(0, 75, 308, 292);
		startMainPane.add(pnl_player);
		pnl_player.setLayout(null);
		
		 String comboBoxListe[] = {"2","3","4","5","6","7","8"}; //"Bitte wählen" und "1" wurde entfernt (Max)
		
		 this.players = new JTextField[8];
		 this.labels = new JLabel[8];
		 this.player_names = new String[8];
		 
		 for(int i = 0; i < players.length; i++){
			 players[i] = new JTextField();
			 players[i].setBounds(147, Parameters.YCOORDS_TEXTFIELD[i], 86, 20);
			 pnl_player.add(players[i]);
			 players[i].setColumns(10);
			 players[i].setVisible(false);
			 player_names[i] = players[i].getText();
			 labels[i] = new JLabel("Spieler " + (i+1) + ": ");
			 labels[i].setBounds(64, Parameters.YCOORDS_LABEL[i], 73, 14);
			 pnl_player.add(labels[i]);
			 labels[i].setVisible(false);
		 }
		 
		 
//	
		
		lbl_playerHead = new JLabel("Spieler:");
		lbl_playerHead.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_playerHead.setBounds(113, 8, 106, 29);
		pnl_player.add(lbl_playerHead);
		
		pnl_playerList = new JPanel();
		pnl_playerList.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_playerList.setBounds(50, 40, 215, 252);
		pnl_player.add(pnl_playerList);
		
		JPanel pnl_options = new JPanel();
		pnl_options.setBounds(308, 75, 211, 292);
		startMainPane.add(pnl_options);
		pnl_options.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnl_options.setBackground(Color.WHITE);
		pnl_options.setLayout(null);
		
		JButton btn_start = new JButton("Start");
		btn_start.setForeground(new Color(0, 128, 0));
		btn_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGui wnd = new MainGui();
				wnd.setVisible(true);
				dispose();
	
				
			}
		});
		btn_start.setBounds(10, 228, 89, 23);
		pnl_options.add(btn_start);
		btn_start.setEnabled(false); 
		
		
		
		
		JButton btn_close = new JButton("Beenden");
		btn_close.setForeground(Color.RED);
		btn_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit( 0 );
				
			}
		});
		btn_close.setBounds(112, 228, 89, 23);
		pnl_options.add(btn_close);
		
		JComboBox cb_playernumber = new JComboBox(comboBoxListe);
		cb_playernumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				 
				 int spieleranzahl = Integer.parseInt((String)cb_playernumber.getSelectedItem());
				 System.out.println(spieleranzahl);
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
//				
			
			
			}
		});
		
		
		
		cb_playernumber.setBounds(112, 92, 64, 20);
		pnl_options.add(cb_playernumber);
		//panel_1.add(panel);
       pnl_options.setVisible(true);
       
       JLabel lbl_playernumber = new JLabel("Anzahl Spieler:");
       lbl_playernumber.setBounds(21, 95, 92, 14);
       pnl_options.add(lbl_playernumber);
       
       JLabel lbl_welcome = new JLabel("Willkommen bei Kniffel");
       lbl_welcome.setBounds(41, 45, 135, 14);
       pnl_options.add(lbl_welcome);
       
       JButton btn_ready = new JButton("Bereit");
       btn_ready.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		btn_start.setEnabled(true);
       		for (int i = 0; i < 8; i++) {
				players[i].setEnabled(false);
				labels[i].setEnabled(false);
			}
       		
       	}
       	
       });
       btn_ready.setBounds(54, 147, 89, 23);
       pnl_options.add(btn_ready);
       
       JProgressBar progressBar = new JProgressBar();
       progressBar.setBounds(10, 203, 191, 14);
       pnl_options.add(progressBar);
       
       JButton btn_help = new JButton("Hilfe");
       btn_help.setBounds(54, 262, 89, 23);
       pnl_options.add(btn_help);
       
       JPanel pnl_head = new JPanel();
       pnl_head.setBackground(Color.WHITE);
       pnl_head.setBounds(0, 0, 519, 75);
       startMainPane.add(pnl_head);
       pnl_head.setLayout(null);
       
       JLabel lbl_Head = new JLabel("Kniffel");
       lbl_Head.setFont(new Font("Arial", Font.PLAIN, 50));
       lbl_Head.setBounds(0, 0, 347, 53);
       pnl_head.add(lbl_Head);
       
       JLabel lbl_group = new JLabel(" by Gruppe 6");
       lbl_group.setFont(new Font("Arial", Font.PLAIN, 20));
       lbl_group.setBounds(0, 43, 139, 32);
       pnl_head.add(lbl_group);
       
       JButton btn_instruction = new JButton("Anleitung");
       btn_instruction.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       	}
       });
       btn_instruction.setBounds(311, 17, 198, 46);
       pnl_head.add(btn_instruction);
	//	lbl_player8.setVisible(false);
	}
}