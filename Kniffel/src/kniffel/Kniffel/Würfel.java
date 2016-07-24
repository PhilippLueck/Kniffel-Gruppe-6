package kniffel.Kniffel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Würfel extends KniffelSpiel implements Comparable<Würfel> {
	
	public int würfelnummer;
	public int augenzahl;
	public int wurf;
	public boolean blocked = false;


	//Würfel Konstruktor
	public Würfel (int würfelnummer, int augenzahl, boolean blocked) {
		setWürfelnummer (würfelnummer);
		setAugenzahl (augenzahl);
		
	}


	public int getWürfelnummer() {
		return würfelnummer;
	}

	//Würfelnummer zwischen 1 und 5 möglich.
	public void setWürfelnummer(int würfelnummer) {
		if(würfelnummer<1||würfelnummer>5){
			JOptionPane.showMessageDialog(null, "Nur ein bis fünf Würfel");
		}
		this.würfelnummer = würfelnummer;
	}


	public int getAugenzahl() {
		return augenzahl;
	}

	//Augenzahlen zwischen 1 und 6
	public void setAugenzahl(int augenzahl) {
		if(augenzahl<0||augenzahl>6){
			JOptionPane.showMessageDialog(null, "Augenzahl zwischen 1 und 6, außer bei Initialisierung");
		}
		this.augenzahl = augenzahl;
	}
	
	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	

	// Würfel methode
	public void würfeln (Würfel würfel) {
		
		if (würfel.isBlocked()==true){}//Würfel blockiert?
		else{
			Random zahl = new Random ();		
			würfel.setAugenzahl( 1 + zahl.nextInt(6));
			System.out.println("Die gewürfelte Augenzahl: " + würfel.getAugenzahl());
			KniffelSpiel.würfelHinzufügen(würfel);
			};
}

	/*block Methode blockiert oder deblockiert, je nach Übergabe*/
	public void block(Würfel würfel, boolean blocking){
		if (blocking==false){
			würfel.setBlocked(false);
		}else{
			if(blocking==true){
			würfel.setBlocked(true);
			}else{
				JOptionPane.showMessageDialog(null,"Falsche Parameter bei blockieren");
			}
		}	
	}
	
	
	// nach Würfelnummer sotiert
	@Override
	public int compareTo(Würfel tmp) {
		// TODO Auto-generated method stub
		return(this.würfelnummer-tmp.getWürfelnummer());
	}
}
