package kniffel.Kniffel;

import java.util.Iterator;

public class Regeltest {
	
public static void main(String[]args){
	KniffelSpiel.würfelHinzufügen(1, 5, 0, false);
	KniffelSpiel.würfelHinzufügen(2, 3, 0, false);
	KniffelSpiel.würfelHinzufügen(3, 2, 0, false);
	KniffelSpiel.würfelHinzufügen(4, 4, 0, false);
	KniffelSpiel.würfelHinzufügen(5, 4, 0, false);
	
	Iterator<Würfel> würfelIterator = KniffelSpiel.würfelListe.iterator();
	while(würfelIterator.hasNext()){
			Würfel selectedWürfel = würfelIterator.next();
			System.out.println(selectedWürfel.getWürfelnummer()+","+ selectedWürfel.getAugenzahl() );
		}//Ende While
	
    System.out.println(Regelwerk.kleineStraße());
    System.out.println(Regelwerk.großeStraße());
    System.out.println(Regelwerk.dreierPasch());
    System.out.println(Regelwerk.viererPasch());
    System.out.println(Regelwerk.fullHouse());
	
	
}

}
