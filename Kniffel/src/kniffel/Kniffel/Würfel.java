package kniffel.Kniffel;

import java.util.Random;

public class W�rfel {
	
	public int w�rfel;
	public int augenzahl;
	
	
	
	
	Random W�rfel = new Random ();
	int Augenzahl;
	
	public W�rfel (int w�rfel, int augenzahl) {
		setW�rfel (w�rfel);
		setAugenzahl (augenzahl);
		
	}


	public int getW�rfel() {
		return w�rfel;
	}


	public void setW�rfel(int w�rfel) {
		this.w�rfel = w�rfel;
	}


	public int getAugenzahl() {
		return augenzahl;
	}


	public void setAugenzahl(int augenzahl) {
		this.augenzahl = augenzahl;
	}
	
	public void w�rfeln (int W�rfel) {
		for (int i = 0; i < 1; i++){
			
			Random w�rfel = new Random ();
			
			this.augenzahl = 1 + w�rfel.nextInt(6);
			
			
		}
	
}
}
