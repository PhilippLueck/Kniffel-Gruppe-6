package kniffel.Kniffel;

import java.util.Random;

public class W�rfel implements Comparable<W�rfel> {
	
	public int w�rfelnummer;
	public int augenzahl;
	public int wurf;
	public boolean blocked = false;


	//W�rfel Konstruktor
	public W�rfel (int w�rfelnummer, int augenzahl, int wurf, boolean blocked) {
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

	// W�rfel methode
	public void w�rfeln (W�rfel wuerfel) {
			if (this.blocked==false){}
			else{
			Random w�rfel = new Random ();		
			this.augenzahl = 1 + w�rfel.nextInt(6);
			System.out.println(this.augenzahl);
			//w�rfelListe.add(w�rfel);
			};
			
			
		
	
}

	// nach gr��e sotiert
	@Override
	public int compareTo(W�rfel tmp) {
		// TODO Auto-generated method stub
		return(this.augenzahl-tmp.getAugenzahl());
	}
}
