package kniffel.Kniffel;

import java.util.Random;

public class Würfel {
	
	public int würfel;
	public int augenzahl;
	
	
	
	
	Random Würfel = new Random ();
	int Augenzahl;
	
	public Würfel (int würfel, int augenzahl) {
		setWürfel (würfel);
		setAugenzahl (augenzahl);
		
	}


	public int getWürfel() {
		return würfel;
	}


	public void setWürfel(int würfel) {
		this.würfel = würfel;
	}


	public int getAugenzahl() {
		return augenzahl;
	}


	public void setAugenzahl(int augenzahl) {
		this.augenzahl = augenzahl;
	}
	
	public void würfeln (int Würfel) {
		for (int i = 0; i < 1; i++){
			
			Random würfel = new Random ();
			
			this.augenzahl = 1 + würfel.nextInt(6);
			
			
		}
	
}
}
