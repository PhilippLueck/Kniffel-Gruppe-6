package kniffel.Kniffel;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Random;

public class W�rfelTest {

public static void main(String[] args) {
		
<<<<<<< HEAD
		//Erstellen von 5 W�rfeln
		
=======
		int[] wurf1 = new int[5];
		int[] wurf2 = new int [5];
		int[] wurf3 = new int [5];
		
		

>>>>>>> refs/remotes/origin/master
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
		
		HashMap<String, Integer> wuerfe = new HashMap<>();

		for (int i = 0; i < 1; i++){
<<<<<<< HEAD
			
		// 5 Augenzahlen
		augenzahl1 = 1+ w�rfel1.nextInt(6);
		augenzahl2 = 1+ w�rfel2.nextInt(6);
		augenzahl3 = 1+ w�rfel3.nextInt(6);
		augenzahl4 = 1+ w�rfel4.nextInt(6);
		augenzahl5 = 1+ w�rfel5.nextInt(6);
		
		System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
		
		for (int j = 0; j < 1; j++){
			
=======


>>>>>>> refs/remotes/origin/master
			augenzahl1 = 1+ w�rfel1.nextInt(6);
			augenzahl2 = 1+ w�rfel2.nextInt(6);
			augenzahl3 = 1+ w�rfel3.nextInt(6);
			augenzahl4 = 1+ w�rfel4.nextInt(6);
			augenzahl5 = 1+ w�rfel5.nextInt(6);

			//System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
 
			wurf1[0] = augenzahl1;
			wurf1[1] = augenzahl2;
			wurf1[2] = augenzahl3;
			wurf1[3] = augenzahl4;
			wurf1[4] = augenzahl5;
			
			for (int j = 0; j < 1; j++){

				augenzahl1 = 1+ w�rfel1.nextInt(6);
				augenzahl2 = 1+ w�rfel2.nextInt(6);
				augenzahl3 = 1+ w�rfel3.nextInt(6);
				augenzahl4 = 1+ w�rfel4.nextInt(6);
				augenzahl5 = 1+ w�rfel5.nextInt(6);

				//System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);

				wurf2[0] = augenzahl1;
				wurf2[1] = augenzahl2;
				wurf2[2] = augenzahl3;
				wurf2[3] = augenzahl4;
				wurf2[4] = augenzahl5;
				
				for (int k = 0; k < 1; k++){

					augenzahl1 = 1+ w�rfel1.nextInt(6);
					augenzahl2 = 1+ w�rfel2.nextInt(6);
					augenzahl3 = 1+ w�rfel3.nextInt(6);
					augenzahl4 = 1+ w�rfel4.nextInt(6);
					augenzahl5 = 1+ w�rfel5.nextInt(6);

					//System.out.println(augenzahl1 + "\t" + augenzahl2 + "\t" + augenzahl3 + "\t" + augenzahl4 + "\t" + augenzahl5);
				
					wurf3[0] = augenzahl1;
					wurf3[1] = augenzahl2;
					wurf3[2] = augenzahl3;
					wurf3[3] = augenzahl4;
					wurf3[4] = augenzahl5;
				
				
				}
				



			}

		}
	}
}