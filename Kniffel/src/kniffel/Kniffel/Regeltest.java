package kniffel.Kniffel;

import java.util.Iterator;

public class Regeltest {
	
public static void main(String[]args){
	KniffelSpiel.w�rfelHinzuf�gen(1, 5, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(2, 5, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(3, 5, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(4, 5, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(5, 5, 0, false);
	
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
