package kniffel.Kniffel;

import java.util.Random;

public class Würfel {
	
	public int würfelnummer;
	public int augenzahl;
	public int wurf;
	public boolean blocked = false;


	//Würfel Konstruktor
	public Würfel (int würfelnummer, int augenzahl, int wurf, boolean blocked) {
		setWürfelnummer (würfelnummer);
		setAugenzahl (augenzahl);
		setWurf(wurf);
		
	}


	public int getWürfelnummer() {
		return würfelnummer;
	}


	public void setWürfelnummer(int würfelnummer) {
		this.würfelnummer = würfelnummer;
	}


	public int getAugenzahl() {
		return augenzahl;
	}


	public void setAugenzahl(int augenzahl) {
		this.augenzahl = augenzahl;
	}
	
	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	public int getWurf() {
		return wurf;
	}


	public void setWurf(int wurf) {
		this.wurf = wurf;
	}

	// Würfel methode
	public void würfeln (Würfel wuerfel) {
	
			
			Random würfel = new Random ();
			
			this.augenzahl = 1 + würfel.nextInt(6);
			System.out.println(this.augenzahl);
			
			
		
	
}
}
