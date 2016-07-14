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

public class Highscore extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Highscore frame = new Highscore();
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
		
		JLabel lbl‹berschriftScoreHintergungbild = new JLabel("Score");
		lbl‹berschriftScoreHintergungbild.setFont(new Font("Old English Text MT", Font.BOLD | Font.ITALIC, 56));
		lbl‹berschriftScoreHintergungbild.setBounds(187, 67, 170, 146);
		panel.add(lbl‹berschriftScoreHintergungbild);
		
		JLabel lblPlatz = new JLabel("Platz 1:");
		lblPlatz.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz.setBounds(105, 241, 107, 27);
		panel.add(lblPlatz);
		
		JLabel lblPlatz_1 = new JLabel("Platz 2:");
		lblPlatz_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_1.setBounds(105, 276, 107, 27);
		panel.add(lblPlatz_1);
		
		JLabel lblPlatz_2 = new JLabel("Platz 3:");
		lblPlatz_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_2.setBounds(105, 314, 107, 27);
		panel.add(lblPlatz_2);
		
		JLabel lblPlatz_3 = new JLabel("Platz 4:");
		lblPlatz_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_3.setBounds(105, 353, 107, 27);
		panel.add(lblPlatz_3);
		
		JLabel lblPlatz_4 = new JLabel("Platz 5:");
		lblPlatz_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_4.setBounds(105, 391, 107, 27);
		panel.add(lblPlatz_4);
		
		JLabel lblPlatz_5 = new JLabel("Platz 6:");
		lblPlatz_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_5.setBounds(105, 429, 107, 27);
		panel.add(lblPlatz_5);
		
		JLabel lblPlatz_6 = new JLabel("Platz 7:");
		lblPlatz_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_6.setBounds(105, 467, 107, 27);
		panel.add(lblPlatz_6);
		
		JLabel lblPlatz_7 = new JLabel("Platz 8:");
		lblPlatz_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPlatz_7.setBounds(105, 505, 107, 27);
		panel.add(lblPlatz_7);
		
		JLabel lblScoreNamePlatz1 = new JLabel("New label");
		lblScoreNamePlatz1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz1.setBounds(217, 241, 177, 26);
		panel.add(lblScoreNamePlatz1);
		
		JLabel lblScoreNamePlatz2 = new JLabel("New label");
		lblScoreNamePlatz2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz2.setBounds(217, 276, 177, 26);
		panel.add(lblScoreNamePlatz2);
		
		JLabel lblScoreNamePlatz3 = new JLabel("New label");
		lblScoreNamePlatz3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz3.setBounds(217, 314, 177, 26);
		panel.add(lblScoreNamePlatz3);
		
		JLabel lblScoreNamePlatz4 = new JLabel("New label");
		lblScoreNamePlatz4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz4.setBounds(217, 352, 177, 26);
		panel.add(lblScoreNamePlatz4);
		
		JLabel lblScoreNamePlatz5 = new JLabel("New label");
		lblScoreNamePlatz5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz5.setBounds(217, 391, 177, 26);
		panel.add(lblScoreNamePlatz5);
		
		JLabel lblScoreNamePlatz6 = new JLabel("New label");
		lblScoreNamePlatz6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz6.setBounds(217, 429, 177, 26);
		panel.add(lblScoreNamePlatz6);
		
		JLabel lblScoreNamePlatz7 = new JLabel("New label");
		lblScoreNamePlatz7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz7.setBounds(217, 468, 177, 26);
		panel.add(lblScoreNamePlatz7);
		
		JLabel lblScoreNamePlatz8 = new JLabel("New label");
		lblScoreNamePlatz8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblScoreNamePlatz8.setBounds(217, 505, 177, 26);
		panel.add(lblScoreNamePlatz8);
		
		JLabel lblScorePlatz1 = new JLabel("Hintergrundbild Highscore");
		lblScorePlatz1.setIcon(new ImageIcon(Highscore.class.getResource("/kniffel/Kniffel/Images/Hintergurnd highscore.jpg")));
		lblScorePlatz1.setBounds(0, 0, 539, 720);
		panel.add(lblScorePlatz1);
	}
}
