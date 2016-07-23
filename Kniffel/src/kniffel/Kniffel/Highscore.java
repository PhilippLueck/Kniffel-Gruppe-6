package kniffel.Kniffel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Highscore extends JFrame {

	private JPanel contentPane;

	/* Diese GUI dient zur Siegerehrung und zum Neustarten des Spiels*/
	public Highscore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 753);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 540, 724);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPoints = new JLabel("Points");
		lblPoints.setFont(new Font("Narkisim", Font.BOLD, 27));
		lblPoints.setBounds(273, 298, 107, 27);
		panel.add(lblPoints);
		
		JLabel lblPunkte = new JLabel("Punkte:");
		lblPunkte.setFont(new Font("Old English Text MT", Font.BOLD, 25));
		lblPunkte.setBounds(140, 298, 107, 27);
		panel.add(lblPunkte);
		
		JButton btnGo2 = new JButton("Go!");
		btnGo2.setBounds(400, 573, 89, 23);
		panel.add(btnGo2);
		
		JLabel lblKomplettNeuesSpiel = new JLabel("Komplett neues Spiel");
		lblKomplettNeuesSpiel.setFont(new Font("Old English Text MT", Font.PLAIN, 23));
		lblKomplettNeuesSpiel.setBounds(27, 569, 379, 23);
		panel.add(lblKomplettNeuesSpiel);
		
		JLabel lblplayagain = new JLabel("Spiel mit vorhandenen Spielern starten");
		lblplayagain.setFont(new Font("Old English Text MT", Font.PLAIN, 23));
		lblplayagain.setBounds(27, 505, 379, 23);
		panel.add(lblplayagain);
		
		JButton btnGo1 = new JButton("Go!");
		btnGo1.setBounds(400, 505, 89, 23);
		panel.add(btnGo1);
		
		JLabel lblGlckwnsch = new JLabel("Gl\u00FCckwunsch");
		lblGlckwnsch.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 49));
		lblGlckwnsch.setBounds(116, 319, 322, 146);
		panel.add(lblGlckwnsch);
		
		JLabel lblÜberschriftScoreHintergungbild = new JLabel("Spielende!");
		lblÜberschriftScoreHintergungbild.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 56));
		lblÜberschriftScoreHintergungbild.setBounds(140, 61, 298, 146);
		panel.add(lblÜberschriftScoreHintergungbild);
		
		JLabel lblPlatz = new JLabel("Platz 1:");
		lblPlatz.setFont(new Font("Old English Text MT", Font.BOLD, 25));
		lblPlatz.setBounds(141, 241, 107, 27);
		panel.add(lblPlatz);
		
		JLabel lblScoreNamePlatz1 = new JLabel("New label");
		lblScoreNamePlatz1.setForeground(new Color(0, 128, 0));
		lblScoreNamePlatz1.setFont(new Font("Old English Text MT", Font.PLAIN, 29));
		lblScoreNamePlatz1.setBounds(258, 239, 177, 26);
		panel.add(lblScoreNamePlatz1);
		
		JLabel lblScorePlatz1 = new JLabel("Hintergrundbild Highscore");
		lblScorePlatz1.setIcon(new ImageIcon(Highscore.class.getResource("/kniffel/Kniffel/Images/Hintergurnd highscore.jpg")));
		lblScorePlatz1.setBounds(0, 0, 539, 720);
		panel.add(lblScorePlatz1);
		
		/*--------------------------------------------------------------------------------------------------------------------------------------------*/
		
		//Punkte Anzeigen
		lblPoints.setText(Integer.toString(KniffelSpiel.punkteListe.last().getPunkte()));
		lblScoreNamePlatz1.setText(KniffelSpiel.punkteListe.first().getName());
		
		
		
		//Button Event listener, wenn auf Spiel mit vorhanden Spielern gedrückt wird, einfach neue Main-Gui (Spielerliste wird nicht überschrieben)
		btnGo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainGui wnd3 = new MainGui();
 				wnd3.setVisible(true);
 				dispose();
			}
		});
		// Neuer Startbildschirm (Spielerliste/Würfelliste wird geleert)
		btnGo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KniffelSpiel.spielerListe.clear();
				KniffelSpiel.würfelListe.clear();
				KniffelSpiel.punkteListe.clear();
				Start wnd4 = new Start();
				wnd4.setVisible(true);
				dispose();
			}
		});
	}
}
