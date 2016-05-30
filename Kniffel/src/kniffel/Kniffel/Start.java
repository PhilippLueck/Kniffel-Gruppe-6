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

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel lblSpieler;
	private JPanel panel_3;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 75, 308, 292);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 String comboBoxListe[] = {"Bitte Wählen","1","2","3","4","5","6","7","8"};
		
		textField = new JTextField();
		textField.setBounds(147, 48, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		String Spieler1 = textField.getText(); 
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 75, 86, 20);
		panel.add(textField_1);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 106, 86, 20);
		panel.add(textField_2);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 137, 86, 20);
		panel.add(textField_3);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(147, 168, 86, 20);
		panel.add(textField_4);
		textField_4.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(147, 199, 86, 20);
		panel.add(textField_5);
		textField_5.setVisible(false);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(147, 230, 86, 20);
		panel.add(textField_6);
		textField_6.setVisible(false);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(147, 261, 86, 20);
		panel.add(textField_7);
		textField_7.setVisible(false);
		
		label = new JLabel("Spieler 1:");
		label.setBounds(64, 51, 73, 14);
		panel.add(label);
		label.setVisible(false);
		
		label_1 = new JLabel("Spieler 2:");
		label_1.setBounds(64, 78, 73, 14);
		panel.add(label_1);
		label_1.setVisible(false);
		
		label_2 = new JLabel("Spieler 3:");
		label_2.setBounds(64, 109, 73, 14);
		panel.add(label_2);
		label_2.setVisible(false);
		
		
		label_3 = new JLabel("Spieler 4:");
		label_3.setBounds(64, 140, 73, 14);
		panel.add(label_3);
		label_3.setVisible(false);
		
		label_4 = new JLabel("Spieler 5:");
		label_4.setBounds(64, 171, 73, 14);
		panel.add(label_4);
		label_4.setVisible(false);
		
		label_5 = new JLabel("Spieler 6");
		label_5.setBounds(64, 202, 73, 14);
		panel.add(label_5);
		label_5.setVisible(false);
		
		label_6 = new JLabel("Spieler 7:");
		label_6.setBounds(64, 233, 73, 14);
		panel.add(label_6);
		label_6.setVisible(false);
		
		label_7 = new JLabel("Spieler 8:");
		label_7.setBounds(64, 264, 73, 14);
		panel.add(label_7);
		
		lblSpieler = new JLabel("Spieler:");
		lblSpieler.setFont(new Font("Arial", Font.BOLD, 20));
		lblSpieler.setBounds(113, 8, 106, 29);
		panel.add(lblSpieler);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(50, 40, 215, 252);
		panel.add(panel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(308, 75, 211, 292);
		contentPane.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(10, 228, 89, 23);
		panel_1.add(btnNewButton);
		btnNewButton.setEnabled(false);
		
		
		//if(wert=="1"){
	//		btnNewButton.setEnabled(true);
	//	}
		
		
		JButton button = new JButton("Beenden");
		button.setForeground(Color.RED);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit( 0 );
				
			}
		});
		button.setBounds(112, 228, 89, 23);
		panel_1.add(button);
		
		JComboBox comboBox = new JComboBox(comboBoxListe);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				 String spieleranzahl = (String)comboBox.getSelectedItem();
				 if(spieleranzahl == "1"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(false);
					 textField_1.setVisible(false);
					 label_2.setVisible(false);
					 textField_2.setVisible(false);
					 label_3.setVisible(false);
					 textField_3.setVisible(false);
					 label_4.setVisible(false);
					 textField_4.setVisible(false);
					 label_5.setVisible(false);
					 textField_5.setVisible(false);
					 label_6.setVisible(false);
					 textField_6.setVisible(false);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 
				 
				 if(spieleranzahl == "2"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(false);
					 textField_2.setVisible(false);
					 label_3.setVisible(false);
					 textField_3.setVisible(false);
					 label_4.setVisible(false);
					 textField_4.setVisible(false);
					 label_5.setVisible(false);
					 textField_5.setVisible(false);
					 label_6.setVisible(false);
					 textField_6.setVisible(false);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 if(spieleranzahl == "3"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(true);
					 textField_2.setVisible(true);
					 label_3.setVisible(false);
					 textField_3.setVisible(false);
					 label_4.setVisible(false);
					 textField_4.setVisible(false);
					 label_5.setVisible(false);
					 textField_5.setVisible(false);
					 label_6.setVisible(false);
					 textField_6.setVisible(false);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 if(spieleranzahl == "4"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(true);
					 textField_2.setVisible(true);
					 label_3.setVisible(true);
					 textField_3.setVisible(true);
					 label_4.setVisible(false);
					 textField_4.setVisible(false);
					 label_5.setVisible(false);
					 textField_5.setVisible(false);
					 label_6.setVisible(false);
					 textField_6.setVisible(false);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 if(spieleranzahl == "5"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(true);
					 textField_2.setVisible(true);
					 label_3.setVisible(true);
					 textField_3.setVisible(true);
					 label_4.setVisible(true);
					 textField_4.setVisible(true);
					 label_5.setVisible(false);
					 textField_5.setVisible(false);
					 label_6.setVisible(false);
					 textField_6.setVisible(false);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 if(spieleranzahl == "6"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(true);
					 textField_2.setVisible(true);
					 label_3.setVisible(true);
					 textField_3.setVisible(true);
					 label_4.setVisible(true);
					 textField_4.setVisible(true);
					 label_5.setVisible(true);
					 textField_5.setVisible(true);
					 label_6.setVisible(false);
					 textField_6.setVisible(false);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 if(spieleranzahl == "7"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(true);
					 textField_2.setVisible(true);
					 label_3.setVisible(true);
					 textField_3.setVisible(true);
					 label_4.setVisible(true);
					 textField_4.setVisible(true);
					 label_5.setVisible(true);
					 textField_5.setVisible(true);
					 label_6.setVisible(true);
					 textField_6.setVisible(true);
					 label_7.setVisible(false);
					 textField_7.setVisible(false);
				 }
				 if(spieleranzahl == "8"){
					 label.setVisible(true);
					 textField.setVisible(true);
					 label_1.setVisible(true);
					 textField_1.setVisible(true);
					 label_2.setVisible(true);
					 textField_2.setVisible(true);
					 label_3.setVisible(true);
					 textField_3.setVisible(true);
					 label_4.setVisible(true);
					 textField_4.setVisible(true);
					 label_5.setVisible(true);
					 textField_5.setVisible(true);
					 label_6.setVisible(true);
					 textField_6.setVisible(true);
					 label_7.setVisible(true);
					 textField_7.setVisible(true);
				 }
			
			
			}
		});
		comboBox.setBounds(112, 92, 64, 20);
		panel_1.add(comboBox);
		//panel_1.add(panel);
       panel_1.setVisible(true);
       
       JLabel lblAnzahlSpieler = new JLabel("Anzahl Spieler:");
       lblAnzahlSpieler.setBounds(21, 95, 92, 14);
       panel_1.add(lblAnzahlSpieler);
       
       JLabel lblWillkommen = new JLabel("Willkommen bei Kniffel");
       lblWillkommen.setBounds(41, 45, 135, 14);
       panel_1.add(lblWillkommen);
       
       JButton btnBereit = new JButton("Bereit");
       btnBereit.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		btnNewButton.setEnabled(true);
       		label.setEnabled(false);
       		label_1.setEnabled(false);
       		label_2.setEnabled(false);
       		label_3.setEnabled(false);
       		label_4.setEnabled(false);
       		label_5.setEnabled(false);
       		label_6.setEnabled(false);
       		label_7.setEnabled(false);
       		 textField.setEnabled(false);
       		 textField_1.setEnabled(false);
       		 textField_2.setEnabled(false);
       		 textField_3.setEnabled(false);
       		 textField_4.setEnabled(false);
       		 textField_5.setEnabled(false);
       		 textField_6.setEnabled(false);
       		 textField_7.setEnabled(false);
       		
       	}
       	
       });
       btnBereit.setBounds(54, 147, 89, 23);
       panel_1.add(btnBereit);
       
       JProgressBar progressBar = new JProgressBar();
       progressBar.setBounds(10, 203, 191, 14);
       panel_1.add(progressBar);
       
       JButton btnHilfe = new JButton("Hilfe");
       btnHilfe.setBounds(54, 262, 89, 23);
       panel_1.add(btnHilfe);
       
       JPanel panel_2 = new JPanel();
       panel_2.setBackground(Color.WHITE);
       panel_2.setBounds(0, 0, 519, 75);
       contentPane.add(panel_2);
       panel_2.setLayout(null);
       
       JLabel lblKniffel = new JLabel("Kniffel");
       lblKniffel.setFont(new Font("Arial", Font.PLAIN, 50));
       lblKniffel.setBounds(0, 0, 347, 53);
       panel_2.add(lblKniffel);
       
       JLabel lblGruppe = new JLabel(" by Gruppe 6");
       lblGruppe.setFont(new Font("Arial", Font.PLAIN, 20));
       lblGruppe.setBounds(0, 43, 139, 32);
       panel_2.add(lblGruppe);
       
       JButton btnNewButton_1 = new JButton("Anleitung");
       btnNewButton_1.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       	}
       });
       btnNewButton_1.setBounds(311, 17, 198, 46);
       panel_2.add(btnNewButton_1);
		label_7.setVisible(false);
	}
}
