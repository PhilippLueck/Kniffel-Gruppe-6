package kniffel.Kniffel;

import java.util.Iterator;

public class Regeltest {
	
public static void main(String[]args){
	KniffelSpiel.würfelHinzufügen(1, 5, 0, false);
	KniffelSpiel.würfelHinzufügen(2, 5, 0, false);
	KniffelSpiel.würfelHinzufügen(3, 5, 0, false);
	KniffelSpiel.würfelHinzufügen(4, 5, 0, false);
	KniffelSpiel.würfelHinzufügen(5, 5, 0, false);
	
	Iterator<Würfel> würfelIterator = KniffelSpiel.würfelListe.iterator();
	while(würfelIterator.hasNext()){
			Würfel selectedWürfel = würfelIterator.next();
			System.out.println(selectedWürfel.getWürfelnummer()+","+ selectedWürfel.getAugenzahl() );
		}//Ende While
	
    System.out.println("kleine Str " +Regelwerk.kleineStraße());
    System.out.println("große Str " +Regelwerk.großeStraße());
    System.out.println("3erpasch "+Regelwerk.dreierPasch());
    System.out.println("4erpasch " +Regelwerk.viererPasch());
    System.out.println("fullhouse "+Regelwerk.fullHouse());
    System.out.println("kniffel "+ Regelwerk.kniffel());
    
	
	
}

}
