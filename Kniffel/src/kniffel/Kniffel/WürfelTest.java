package kniffel.Kniffel;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Random;

public class WürfelTest {

public static void main(String[] args) {
		// 3 neue Würfe
		int[] wurf1 = new int[5];
		int[] wurf2 = new int [5];
		int[] wurf3 = new int [5];
		
		Würfel wuerfel1 = new Würfel(1,0,0,false);
		Würfel wuerfel2 = new Würfel(2,0,0,false);
		Würfel wuerfel3 = new Würfel(3,0,0,false);
		Würfel wuerfel4 = new Würfel(4,0,0,false);
		Würfel wuerfel5 = new Würfel(5,0,0,false);
		
		
		wuerfel1.würfeln(wuerfel1);
		wuerfel2.würfeln(wuerfel2);
		wuerfel3.würfeln(wuerfel3);
		wuerfel4.würfeln(wuerfel4);
		wuerfel5.würfeln(wuerfel5);
		

	}
}
