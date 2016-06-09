package kniffel.Kniffel;

import java.util.Iterator;


public class Regelwerk extends KniffelSpiel {

int zahlenCount;
int punkte;

//1er
public int einser(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 1;
	}
	
	return punkte;
}
	
//2er
public int zweier(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 2;
	}
	
	return punkte;
}
	
//3er
public int dreier(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 3;
	}
	
	return punkte;
}	
//4er
public int vierer(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 4;
	}
	
	return punkte;
}
//5er
public int fuenfer(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 5;
	}
	
	return punkte;
}
	
//6er
public int sechser(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 6;
	}
	
	return punkte;
}
	
//pasch
	
//3er pasch
	
//4er Pasch
	
//Kniffel
	
//kleine Straße
	
//große Straße
	
//chance
	
//Sonderegeln
	
/* alles direkt in Felder eintragen, dann kann der Spieler sehen, wo er wann welche Punkte bekommt. 
 * Wenn er die Punkte haben möchte muss er auf das Feld drücken! Dieser Wert wird dann gespeichert,
 * Das Feld wird für zukünftige Eintragungen gesperrt
 */
	


}
