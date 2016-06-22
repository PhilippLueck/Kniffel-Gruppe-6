package kniffel.Kniffel;

import java.util.Random;

public class W�rfel extends KniffelSpiel implements Comparable<W�rfel> {
	
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
	public void w�rfeln (W�rfel w�rfel) {
		
		if (w�rfel.isBlocked()==true){}
		else{
			Random zahl = new Random ();		
			w�rfel.setAugenzahl( 1 + zahl.nextInt(6));
			System.out.println("Die gew�rfelte Augenzahl: " + w�rfel.getAugenzahl());
			KniffelSpiel.w�rfelHinzuf�gen(w�rfel);
			};
}

	
	public void block(W�rfel w�rfel){
		if (w�rfel.isBlocked()==true){
			w�rfel.setBlocked(false);
		}else{
			w�rfel.setBlocked(true);
		}	
	}
	
	
	// nach gr��e sotiert
	@Override
	public int compareTo(W�rfel tmp) {
		// TODO Auto-generated method stub
		return(this.w�rfelnummer-tmp.getW�rfelnummer());
	}
}
