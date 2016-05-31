package kniffel.Kniffel;

import java.util.Random;

public class WürfelTest {

	public static void main(String[] args) {
		
		Random würfel1 = new Random ();
		int augenzahl1;
		
		Random würfel2 = new Random ();
		int augenzahl2;
		
		Random würfel3 = new Random ();
		int augenzahl3;
		
		Random würfel4 = new Random ();
		int augenzahl4;
		
		Random würfel5 = new Random ();
		int augenzahl5;
		
		for (int i = 0; i < 1; i++){
			
		
		augenzahl1 = 1+ würfel1.nextInt(6);
		augenzahl2 = 1+ würfel2.nextInt(6);
		augenzahl3 = 1+ würfel3.nextInt(6);
		augenzahl4 = 1+ würfel4.nextInt(6);
		augenzahl5 = 1+ würfel5.nextInt(6);
		
		System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
		
		for (int j = 0; j < 1; j++){
			
			augenzahl1 = 1+ würfel1.nextInt(6);
			augenzahl2 = 1+ würfel2.nextInt(6);
			augenzahl3 = 1+ würfel3.nextInt(6);
			augenzahl4 = 1+ würfel4.nextInt(6);
			augenzahl5 = 1+ würfel5.nextInt(6);
			
			System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
			
			for (int k = 0; k < 1; k++){
				
				augenzahl1 = 1+ würfel1.nextInt(6);
				augenzahl2 = 1+ würfel2.nextInt(6);
				augenzahl3 = 1+ würfel3.nextInt(6);
				augenzahl4 = 1+ würfel4.nextInt(6);
				augenzahl5 = 1+ würfel5.nextInt(6);
				
				System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
			}
		

		
	}

}
}
}