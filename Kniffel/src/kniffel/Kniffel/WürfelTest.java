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
		
		Würfel wuerfel1 = new Würfel(1,0,0);
		Würfel wuerfel2 = new Würfel(1,0,0);
		Würfel wuerfel3 = new Würfel(1,0,0);
		Würfel wuerfel4 = new Würfel(1,0,0);
		Würfel wuerfel5 = new Würfel(1,0,0);
		
		wuerfel1.würfeln();

	}
}
