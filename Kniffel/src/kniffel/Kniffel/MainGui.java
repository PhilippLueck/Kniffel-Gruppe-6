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
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnClose;
	private JButton btnHilfe;
	private JTable Kniffelblock;

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
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(0, 0, 574, 57);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		//Ergebnis Label
		
		JLabel lblErgebnis = new JLabel("Kniffelblock");
		lblErgebnis.setBounds(200, 0, 189, 61);
		panel_4.add(lblErgebnis);
		lblErgebnis.setFont(new Font("Tahoma", Font.PLAIN, 35));
		//JTable
		Kniffelblock = new JTable();
		//ZellenGr��e
		Kniffelblock.setRowHeight(26);
		
		Kniffelblock.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Kniffelblock.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "1.Spiel", "2.Spiel", "3.Spiel", "4.Spiel", "5.Spiel", "6.Spiel"},
				{"Einser", null, null, null, null, null, null},
				{"Zweier", null, null, null, null, null, null},
				{"Dreier", null, null, null, null, null, null},
				{"Vierer", null, null, null, null, null, null},
				{"F\u00FCnfer", null, null, null, null, null, null},
				{"Sechser", null, null, null, null, null, null},
				{"Summe", null, null, null, null, null, null},
				{"Bonus", null, null, null, null, null, null},
				{"Gesamt Oben", null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{"Dreierpasch", null, null, null, null, null, null},
				{"Viererpasch", null, null, null, null, null, null},
				{"Full House", null, null, null, null, null, null},
				{"kleine Stra\u00DFe", null, null, null, null, null, null},
				{"gro\u00DFe Stra\u00DFe", null, null, null, null, null, null},
				{"Kniffel", null, null, null, null, null, null},
				{"Chance", null, null, null, null, null, null},
				{"Summe", null, null, null, null, null, null},
				{"Gesamt oben", null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		Kniffelblock.getColumnModel().getColumn(0).setResizable(false);
		Kniffelblock.getColumnModel().getColumn(0).setPreferredWidth(87);
		Kniffelblock.getColumnModel().getColumn(1).setResizable(false);
		Kniffelblock.getColumnModel().getColumn(2).setResizable(false);
		Kniffelblock.getColumnModel().getColumn(3).setResizable(false);
		Kniffelblock.getColumnModel().getColumn(4).setResizable(false);
		Kniffelblock.getColumnModel().getColumn(5).setResizable(false);
		Kniffelblock.setBounds(10, 68, 555, 520);
		panel_1.add(Kniffelblock);repaint();
		
		
		//Panel 3 placed on panel1
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 240));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(574, 0, 402, 548);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		//Panel 5 placed on Panel 3
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(0, 0, 402, 57);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		//Kniffel Label placed on Panel 5
		JLabel lblKniffel = new JLabel("Kniffel");
		lblKniffel.setBounds(0, 0, 137, 61);
		lblKniffel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		panel_5.add(lblKniffel);
		
		//Copyright :D
		JLabel lblByGruppe = new JLabel("by Gruppe 6");
		lblByGruppe.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblByGruppe.setBounds(143, 14, 162, 53);
		panel_5.add(lblByGruppe);
		
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
		//W�rfelbutton placed on panel 2
		JButton btnWrfeln = new JButton("W\u00FCrfeln");
		
		//w�rfelknopf (ruft w�rfelmethode aus w�rfelklasse auf)
		btnWrfeln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//checken, wie oft button geklickt
				
				W�rfel wuerfel1 = new W�rfel(1,0,0,false);
				W�rfel wuerfel2 = new W�rfel(2,0,0,false);
				W�rfel wuerfel3 = new W�rfel(3,0,0,false);
				W�rfel wuerfel4 = new W�rfel(4,0,0,false);
				W�rfel wuerfel5 = new W�rfel(5,0,0,false);
				
				
				wuerfel1.w�rfeln(wuerfel1);
				wuerfel2.w�rfeln(wuerfel2);
				wuerfel3.w�rfeln(wuerfel3);
				wuerfel4.w�rfeln(wuerfel4);
				wuerfel5.w�rfeln(wuerfel5);
			}
		});
		btnWrfeln.setBounds(161, 11, 89, 23);
		panel_2.add(btnWrfeln);
	}
}
