package kniffel.Kniffel;

import java.util.Random;

public class Würfel {
	
	private int würfelnummer;
	private int augenzahl;
	private int wurf;

	
	public int getWurf() {
		return wurf;
	}


	public void setWurf(int wurf) {
		this.wurf = wurf;
	}


	//Würfel Konstruktor
	public Würfel (int würfelnummer, int augenzahl, int wurf) {
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
	// Würfel methode
	public void würfeln () {
		for (int i = 0; i < 1; i++){
			
			Random würfel = new Random ();
			
			this.augenzahl = 1 + würfel.nextInt(6);
			System.out.println(this.augenzahl);
			
			
		}
	
}
}
