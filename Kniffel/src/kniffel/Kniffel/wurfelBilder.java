package kniffel.Kniffel;


	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Image;

	import javax.swing.ImageIcon;
	import javax.swing.JPanel;

public class wurfelBilder extends JPanel{

		Image img;

		public void gui(){
			setFocusable(true);
			ImageIcon u = new ImageIcon("C:/UsersIBM_ADMIN/git/New folder (3)/Kniffel-Gruppe-6/Kniffel/src/kniffel/Kniffel/Bilder/wuerfel 1.png");
			img = u.getImage();

		}

		public void paint(Graphics g){
			super.paint(g);
			Graphics2D f2 = (Graphics2D)g;

			f2.drawImage(img, 0, 0, null);
		}

	}

