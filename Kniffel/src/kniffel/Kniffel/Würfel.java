package kniffel.Kniffel;

import java.util.Random;

import javax.swing.JOptionPane;

public class W�rfel extends KniffelSpiel implements Comparable<W�rfel> {
	
	public int w�rfelnummer;
	public int augenzahl;
	public int wurf;
	public boolean blocked = false;


	//W�rfel Konstruktor
	public W�rfel (int w�rfelnummer, int augenzahl, boolean blocked) {
		setW�rfelnummer (w�rfelnummer);
		setAugenzahl (augenzahl);
		
	}


	public int getW�rfelnummer() {
		return w�rfelnummer;
	}

	//W�rfelnummer zwischen 1 und 5 m�glich.
	public void setW�rfelnummer(int w�rfelnummer) {
		if(w�rfelnummer<1||w�rfelnummer>5){
			JOptionPane.showMessageDialog(null, "Nur ein bis f�nf W�rfel");
		}
		this.w�rfelnummer = w�rfelnummer;
	}


	public int getAugenzahl() {
		return augenzahl;
	}

	//Augenzahlen zwischen 1 und 6
	public void setAugenzahl(int augenzahl) {
		if(augenzahl<0||augenzahl>6){
			JOptionPane.showMessageDialog(null, "Augenzahl zwischen 1 und 6, au�er bei Initialisierung");
		}
		this.augenzahl = augenzahl;
	}
	
	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	

	// W�rfel methode
	public void w�rfeln (W�rfel w�rfel) {
		
		if (w�rfel.isBlocked()==true){}//W�rfel blockiert?
		else{
			Random zahl = new Random ();		
			w�rfel.setAugenzahl( 1 + zahl.nextInt(6));
			System.out.println("Die gew�rfelte Augenzahl: " + w�rfel.getAugenzahl());
			KniffelSpiel.w�rfelHinzuf�gen(w�rfel);
			};
}

	/*block Methode blockiert oder deblockiert, je nach �bergabe*/
	public void block(W�rfel w�rfel, boolean blocking){
		if (blocking==false){
			w�rfel.setBlocked(false);
		}else{
			if(blocking==true){
			w�rfel.setBlocked(true);
			}else{
				JOptionPane.showMessageDialog(null,"Falsche Parameter bei blockieren");
			}
		}	
	}
	
	
	// nach W�rfelnummer sotiert
	@Override
	public int compareTo(W�rfel tmp) {
		// TODO Auto-generated method stub
		return(this.w�rfelnummer-tmp.getW�rfelnummer());
	}
}
