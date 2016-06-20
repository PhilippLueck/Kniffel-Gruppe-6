package kniffel.Kniffel;

import java.util.Iterator;

public class Regeltest {
	
public static void main(String[]args){
	Würfel würfel1 = new Würfel(1,0, 0, false);
	Würfel würfel2 = new Würfel(2,0, 0, false);
	Würfel würfel3 = new Würfel(3,0, 0, false);
	Würfel würfel4 = new Würfel(4,0, 0, false);
	Würfel würfel5 = new Würfel(5,0, 0, false);
	
	KniffelSpiel.würfelHinzufügen(würfel1);
	KniffelSpiel.würfelHinzufügen(würfel2);
	KniffelSpiel.würfelHinzufügen(würfel3);
	KniffelSpiel.würfelHinzufügen(würfel4);
	KniffelSpiel.würfelHinzufügen(würfel5);
	
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
