package kniffel.Kniffel;

import java.util.Iterator;


public class Regelwerk extends KniffelSpiel {

int zahlenCount;
int punkte;

//1er
public int einser(){
	//Punkte zur�cksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		if(selectedW�rfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenz�hlen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 1;
	}
	
	return punkte;
}
	
//2er
public int zweier(){
	//Punkte zur�cksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		if(selectedW�rfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenz�hlen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 2;
	}
	
	return punkte;
}
	
//3er
public int dreier(){
	//Punkte zur�cksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		if(selectedW�rfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenz�hlen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 3;
	}
	
	return punkte;
}	
//4er
public int vierer(){
	//Punkte zur�cksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		if(selectedW�rfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenz�hlen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 4;
	}
	
	return punkte;
}
//5er
public int fuenfer(){
	//Punkte zur�cksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		if(selectedW�rfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenz�hlen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 5;
	}
	
	return punkte;
}
	
//6er
public int sechser(){
	//Punkte zur�cksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		if(selectedW�rfel.augenzahl==1){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenz�hlen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 6;
	}
	
	return punkte;
}
	
//pasch
	
//3er pasch
	
//4er Pasch
	
//Kniffel
	
//kleine Stra�e
	
//gro�e Stra�e
	
//chance
	
//Sonderegeln
	
/* alles direkt in Felder eintragen, dann kann der Spieler sehen, wo er wann welche Punkte bekommt. 
 * Wenn er die Punkte haben m�chte muss er auf das Feld dr�cken! Dieser Wert wird dann gespeichert,
 * Das Feld wird f�r zuk�nftige Eintragungen gesperrt
 */
	


}
