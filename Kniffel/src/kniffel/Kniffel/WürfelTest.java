package kniffel.Kniffel;

import java.util.Random;

public class W�rfelTest {

	public static void main(String[] args) {
		
		Random w�rfel1 = new Random ();
		int augenzahl1;
		
		Random w�rfel2 = new Random ();
		int augenzahl2;
		
		Random w�rfel3 = new Random ();
		int augenzahl3;
		
		Random w�rfel4 = new Random ();
		int augenzahl4;
		
		Random w�rfel5 = new Random ();
		int augenzahl5;
		
		for (int i = 0; i < 1; i++){
			
		
		augenzahl1 = 1+ w�rfel1.nextInt(6);
		augenzahl2 = 1+ w�rfel2.nextInt(6);
		augenzahl3 = 1+ w�rfel3.nextInt(6);
		augenzahl4 = 1+ w�rfel4.nextInt(6);
		augenzahl5 = 1+ w�rfel5.nextInt(6);
		
		System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
		
		for (int j = 0; j < 1; j++){
			
			augenzahl1 = 1+ w�rfel1.nextInt(6);
			augenzahl2 = 1+ w�rfel2.nextInt(6);
			augenzahl3 = 1+ w�rfel3.nextInt(6);
			augenzahl4 = 1+ w�rfel4.nextInt(6);
			augenzahl5 = 1+ w�rfel5.nextInt(6);
			
			System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
			
			for (int k = 0; k < 1; k++){
				
				augenzahl1 = 1+ w�rfel1.nextInt(6);
				augenzahl2 = 1+ w�rfel2.nextInt(6);
				augenzahl3 = 1+ w�rfel3.nextInt(6);
				augenzahl4 = 1+ w�rfel4.nextInt(6);
				augenzahl5 = 1+ w�rfel5.nextInt(6);
				
				System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
			}
		

		
	}

}
}
}