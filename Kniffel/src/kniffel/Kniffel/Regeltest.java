package kniffel.Kniffel;

import java.util.Iterator;

public class Regeltest {
	
public static void main(String[]args){
	KniffelSpiel.w�rfelHinzuf�gen(1, 5, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(2, 3, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(3, 2, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(4, 4, 0, false);
	KniffelSpiel.w�rfelHinzuf�gen(5, 4, 0, false);
	
	Iterator<W�rfel> w�rfelIterator = KniffelSpiel.w�rfelListe.iterator();
	while(w�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = w�rfelIterator.next();
			System.out.println(selectedW�rfel.getW�rfelnummer()+","+ selectedW�rfel.getAugenzahl() );
		}//Ende While
	
    System.out.println(Regelwerk.kleineStra�e());
    System.out.println(Regelwerk.gro�eStra�e());
    System.out.println(Regelwerk.dreierPasch());
    System.out.println(Regelwerk.viererPasch());
    System.out.println(Regelwerk.fullHouse());
	
	
}

}
