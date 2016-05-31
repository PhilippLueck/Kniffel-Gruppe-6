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
	private JTextField txt_player1;
	private JTextField txt_player2;
	private JTextField txt_player3;
	private JTextField txt_player4;
	private JTextField txt_player5;
	private JTextField txt_player6;
	private JTextField txt_player7;
	private JTextField txt_player8;
	private JLabel lbl_player1;
	private JLabel lbl_player2;
	private JLabel lbl_player3;
	private JLabel lbl_player4;
	private JLabel lbl_player5;
	private JLabel lbl_player6;
	private JLabel lbl_lbl_player7;
	private JLabel lbl_player8;
	private JLabel lbl_playerHead;
	private JPanel pnl_playerList;

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
	 * Create the frame.
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
		
		 String comboBoxListe[] = {"Bitte Wählen","1","2","3","4","5","6","7","8"};
		
		txt_player1 = new JTextField();
		txt_player1.setBounds(147, 48, 86, 20);
		pnl_player.add(txt_player1);
		txt_player1.setColumns(10);
		txt_player1.setVisible(false);
		String Spieler1 = txt_player1.getText(); 
		
		txt_player2 = new JTextField();
		txt_player2.setColumns(10);
		txt_player2.setBounds(147, 75, 86, 20);
		pnl_player.add(txt_player2);
		txt_player2.setVisible(false);
		
		txt_player3 = new JTextField();
		txt_player3.setColumns(10);
		txt_player3.setBounds(147, 106, 86, 20);
		pnl_player.add(txt_player3);
		txt_player3.setVisible(false);
		
		txt_player4 = new JTextField();
		txt_player4.setColumns(10);
		txt_player4.setBounds(147, 137, 86, 20);
		pnl_player.add(txt_player4);
		txt_player4.setVisible(false);
		
		txt_player5 = new JTextField();
		txt_player5.setColumns(10);
		txt_player5.setBounds(147, 168, 86, 20);
		pnl_player.add(txt_player5);
		txt_player5.setVisible(false);
		
		txt_player6 = new JTextField();
		txt_player6.setColumns(10);
		txt_player6.setBounds(147, 199, 86, 20);
		pnl_player.add(txt_player6);
		txt_player6.setVisible(false);
		
		txt_player7 = new JTextField();
		txt_player7.setColumns(10);
		txt_player7.setBounds(147, 230, 86, 20);
		pnl_player.add(txt_player7);
		txt_player7.setVisible(false);
		
		txt_player8 = new JTextField();
		txt_player8.setColumns(10);
		txt_player8.setBounds(147, 261, 86, 20);
		pnl_player.add(txt_player8);
		txt_player8.setVisible(false);
		
		lbl_player1 = new JLabel("Spieler 1:");
		lbl_player1.setBounds(64, 51, 73, 14);
		pnl_player.add(lbl_player1);
		lbl_player1.setVisible(false);
		
		lbl_player2 = new JLabel("Spieler 2:");
		lbl_player2.setBounds(64, 78, 73, 14);
		pnl_player.add(lbl_player2);
		lbl_player2.setVisible(false);
		
		lbl_player3 = new JLabel("Spieler 3:");
		lbl_player3.setBounds(64, 109, 73, 14);
		pnl_player.add(lbl_player3);
		lbl_player3.setVisible(false);
		
		
		lbl_player4 = new JLabel("Spieler 4:");
		lbl_player4.setBounds(64, 140, 73, 14);
		pnl_player.add(lbl_player4);
		lbl_player4.setVisible(false);
		
		lbl_player5 = new JLabel("Spieler 5:");
		lbl_player5.setBounds(64, 171, 73, 14);
		pnl_player.add(lbl_player5);
		lbl_player5.setVisible(false);
		
		lbl_player6 = new JLabel("Spieler 6");
		lbl_player6.setBounds(64, 202, 73, 14);
		pnl_player.add(lbl_player6);
		lbl_player6.setVisible(false);
		
		lbl_lbl_player7 = new JLabel("Spieler 7:");
		lbl_lbl_player7.setBounds(64, 233, 73, 14);
		pnl_player.add(lbl_lbl_player7);
		lbl_lbl_player7.setVisible(false);
		
		lbl_player8 = new JLabel("Spieler 8:");
		lbl_player8.setBounds(64, 264, 73, 14);
		pnl_player.add(lbl_player8);
		
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
				
			}
		});
		btn_start.setBounds(10, 228, 89, 23);
		pnl_options.add(btn_start);
		btn_start.setEnabled(false); 
		
		
		//if(wert=="1"){
	//		btnNewButton.setEnabled(true);
	//	}
		
		
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
				 String spieleranzahl = (String)cb_playernumber.getSelectedItem();
				 if(spieleranzahl == "1"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(false);
					 txt_player2.setVisible(false);
					 lbl_player3.setVisible(false);
					 txt_player3.setVisible(false);
					 lbl_player4.setVisible(false);
					 txt_player4.setVisible(false);
					 lbl_player5.setVisible(false);
					 txt_player5.setVisible(false);
					 lbl_player6.setVisible(false);
					 txt_player6.setVisible(false);
					 lbl_lbl_player7.setVisible(false);
					 txt_player7.setVisible(false);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 
				 
				 if(spieleranzahl == "2"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(false);
					 txt_player3.setVisible(false);
					 lbl_player4.setVisible(false);
					 txt_player4.setVisible(false);
					 lbl_player5.setVisible(false);
					 txt_player5.setVisible(false);
					 lbl_player6.setVisible(false);
					 txt_player6.setVisible(false);
					 lbl_lbl_player7.setVisible(false);
					 txt_player7.setVisible(false);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 if(spieleranzahl == "3"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(true);
					 txt_player3.setVisible(true);
					 lbl_player4.setVisible(false);
					 txt_player4.setVisible(false);
					 lbl_player5.setVisible(false);
					 txt_player5.setVisible(false);
					 lbl_player6.setVisible(false);
					 txt_player6.setVisible(false);
					 lbl_lbl_player7.setVisible(false);
					 txt_player7.setVisible(false);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 if(spieleranzahl == "4"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(true);
					 txt_player3.setVisible(true);
					 lbl_player4.setVisible(true);
					 txt_player4.setVisible(true);
					 lbl_player5.setVisible(false);
					 txt_player5.setVisible(false);
					 lbl_player6.setVisible(false);
					 txt_player6.setVisible(false);
					 lbl_lbl_player7.setVisible(false);
					 txt_player7.setVisible(false);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 if(spieleranzahl == "5"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(true);
					 txt_player3.setVisible(true);
					 lbl_player4.setVisible(true);
					 txt_player4.setVisible(true);
					 lbl_player5.setVisible(true);
					 txt_player5.setVisible(true);
					 lbl_player6.setVisible(false);
					 txt_player6.setVisible(false);
					 lbl_lbl_player7.setVisible(false);
					 txt_player7.setVisible(false);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 if(spieleranzahl == "6"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(true);
					 txt_player3.setVisible(true);
					 lbl_player4.setVisible(true);
					 txt_player4.setVisible(true);
					 lbl_player5.setVisible(true);
					 txt_player5.setVisible(true);
					 lbl_player6.setVisible(true);
					 txt_player6.setVisible(true);
					 lbl_lbl_player7.setVisible(false);
					 txt_player7.setVisible(false);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 if(spieleranzahl == "7"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(true);
					 txt_player3.setVisible(true);
					 lbl_player4.setVisible(true);
					 txt_player4.setVisible(true);
					 lbl_player5.setVisible(true);
					 txt_player5.setVisible(true);
					 lbl_player6.setVisible(true);
					 txt_player6.setVisible(true);
					 lbl_lbl_player7.setVisible(true);
					 txt_player7.setVisible(true);
					 lbl_player8.setVisible(false);
					 txt_player8.setVisible(false);
				 }
				 if(spieleranzahl == "8"){
					 lbl_player1.setVisible(true);
					 txt_player1.setVisible(true);
					 lbl_player2.setVisible(true);
					 txt_player2.setVisible(true);
					 lbl_player3.setVisible(true);
					 txt_player3.setVisible(true);
					 lbl_player4.setVisible(true);
					 txt_player4.setVisible(true);
					 lbl_player5.setVisible(true);
					 txt_player5.setVisible(true);
					 lbl_player6.setVisible(true);
					 txt_player6.setVisible(true);
					 lbl_lbl_player7.setVisible(true);
					 txt_player7.setVisible(true);
					 lbl_player8.setVisible(true);
					 txt_player8.setVisible(true);
				 }
			
			
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
       		lbl_player1.setEnabled(false);
       		lbl_player2.setEnabled(false);
       		lbl_player3.setEnabled(false);
       		lbl_player4.setEnabled(false);
       		lbl_player5.setEnabled(false);
       		lbl_player6.setEnabled(false);
       		lbl_lbl_player7.setEnabled(false);
       		lbl_player8.setEnabled(false);
       		 txt_player1.setEnabled(false);
       		 txt_player2.setEnabled(false);
       		 txt_player3.setEnabled(false);
       		 txt_player4.setEnabled(false);
       		 txt_player5.setEnabled(false);
       		 txt_player6.setEnabled(false);
       		 txt_player7.setEnabled(false);
       		 txt_player8.setEnabled(false);
       		
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
		lbl_player8.setVisible(false);
	}
}
