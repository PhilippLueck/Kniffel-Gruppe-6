package kniffel.Kniffel;

import java.util.Random;

public class W�rfel {
	
	private int w�rfelnummer;
	private int augenzahl;
	private int wurf;

	
	public int getWurf() {
		return wurf;
	}


	public void setWurf(int wurf) {
		this.wurf = wurf;
	}


	//W�rfel Konstruktor
	public W�rfel (int w�rfelnummer, int augenzahl, int wurf) {
		setW�rfelnummer (w�rfelnummer);
		setAugenzahl (augenzahl);
		setWurf(wurf);
		
	}


	public int getW�rfelnummer() {
		return w�rfelnummer;
	}


	public void setW�rfelnummer(int w�rfelnummer) {
		this.w�rfelnummer = w�rfelnummer;
	}


	public int getAugenzahl() {
		return augenzahl;
	}


	public void setAugenzahl(int augenzahl) {
		this.augenzahl = augenzahl;
	}
	// W�rfel methode
	public void w�rfeln () {
		for (int i = 0; i < 1; i++){
			
			Random w�rfel = new Random ();
			
			this.augenzahl = 1 + w�rfel.nextInt(6);
			System.out.println(this.augenzahl);
			
			
		}
	
}
}
