package kniffel.Kniffel;

import java.util.Iterator;

public class Regeltest {
	
public static void main(String[]args){
	W�rfel w�rfel1 = new W�rfel(1,0, 0, false);
	W�rfel w�rfel2 = new W�rfel(2,0, 0, false);
	W�rfel w�rfel3 = new W�rfel(3,0, 0, false);
	W�rfel w�rfel4 = new W�rfel(4,0, 0, false);
	W�rfel w�rfel5 = new W�rfel(5,0, 0, false);
	
	KniffelSpiel.w�rfelHinzuf�gen(w�rfel1);
	KniffelSpiel.w�rfelHinzuf�gen(w�rfel2);
	KniffelSpiel.w�rfelHinzuf�gen(w�rfel3);
	KniffelSpiel.w�rfelHinzuf�gen(w�rfel4);
	KniffelSpiel.w�rfelHinzuf�gen(w�rfel5);
	
	Iterator<W�rfel> w�rfelIterator = KniffelSpiel.w�rfelListe.iterator();
	while(w�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = w�rfelIterator.next();
			System.out.println(selectedW�rfel.getW�rfelnummer()+","+ selectedW�rfel.getAugenzahl() );
		}//Ende While
	
    System.out.println("kleine Str " +Regelwerk.kleineStra�e());
    System.out.println("gro�e Str " +Regelwerk.gro�eStra�e());
    System.out.println("3erpasch "+Regelwerk.dreierPasch());
    System.out.println("4erpasch " +Regelwerk.viererPasch());
    System.out.println("fullhouse "+Regelwerk.fullHouse());
    System.out.println("kniffel "+ Regelwerk.kniffel());
    
	
	
}

}
