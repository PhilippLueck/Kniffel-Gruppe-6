package kniffel.Kniffel;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Random;

public class W�rfelTest {

public static void main(String[] args) {
		// 3 neue W�rfe
		int[] wurf1 = new int[5];
		int[] wurf2 = new int [5];
		int[] wurf3 = new int [5];
		
		W�rfel wuerfel1 = new W�rfel(1,0,0,false);
		W�rfel wuerfel2 = new W�rfel(2,0,0,false);
		W�rfel wuerfel3 = new W�rfel(3,0,0,false);
		W�rfel wuerfel4 = new W�rfel(4,0,0,false);
		W�rfel wuerfel5 = new W�rfel(5,0,0,false);
		
		
		wuerfel1.w�rfeln(wuerfel1);
		wuerfel2.w�rfeln(wuerfel2);
		wuerfel3.w�rfeln(wuerfel3);
		wuerfel4.w�rfeln(wuerfel4);
		wuerfel5.w�rfeln(wuerfel5);
		

	}
}
