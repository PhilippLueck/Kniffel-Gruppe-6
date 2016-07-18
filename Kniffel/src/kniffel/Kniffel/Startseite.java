package kniffel.Kniffel;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Startseite extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
							try {
							Startseite window = new Startseite();
							window.frame.setVisible(true);
							} catch (Exception e) 
			{
			e.printStackTrace();
			}
		}
	});
	
}

	
	/**
	 * Create the application.
	 */
	public Startseite() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 919, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon rules = new ImageIcon(getClass().getResource("Startseite.PNG"));
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 908, 497);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel.setIcon(rules);
		
		JButton btnSpielStarten = new JButton("Spiel Starten");
		btnSpielStarten.setBounds(382, 525, 150, 34);
		frame.getContentPane().add(btnSpielStarten);
		
		   btnSpielStarten.addActionListener(new ActionListener()
		   {
		   
	          	public void actionPerformed(ActionEvent e) 
	          	{
	          		Start spstart;
	   			
	   				spstart = new Start();
	   				spstart.setVisible(true);
	   				frame.setVisible(false);
	          	}
		   
	          	
		   }); 
	          
	}	
}

