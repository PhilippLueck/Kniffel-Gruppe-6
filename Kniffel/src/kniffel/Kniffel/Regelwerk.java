package kniffel.Kniffel;

import java.util.Iterator;


public  class Regelwerk extends KniffelSpiel {

private static int zahlenCount;
private static int punkte;
private static String zahlenStrahl;
private static boolean exists;

//Getter und Setters mit Logik befüllen (da sie statisch sind können sie überall geändert werden, also aufpassen) blub

public static int getZahlenCount() {
	return zahlenCount;
}

public static void setZahlenCount(int zahlenCount) {
	Regelwerk.zahlenCount = zahlenCount;
}

public static int getPunkte() {
	return punkte;
}

public static void setPunkte(int punkte) {
	Regelwerk.punkte = punkte;
}

public static String getZahlenStrahl() {
	return zahlenStrahl;
}

public static void setZahlenStrahl(String zahlenStrahl) {
	Regelwerk.zahlenStrahl = zahlenStrahl;
}

public static boolean isExists() {
	return exists;
}

public static void setExists(boolean exists) {
	Regelwerk.exists = exists;
}







/*---------------------------------------------------------------------------------------------------------------------------------------*/
//1er
public static int einser(){
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
public static int zweier(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==2){
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
public static int dreier(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==3){
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
public static int vierer(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==4){
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
public static int fuenfer(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==5){
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
public static int sechser(){
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.augenzahl==6){
			zahlenCount++;
		}
	}//Ende While
	
	//Jetzt Punkte zusammenzählen
	for(int j = 1;j<=zahlenCount;j++){
	punkte = punkte + 6;
	}
	
	return punkte;
}
	

	
//3er pasch
public static int dreierPasch(){
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		punkte = punkte + selectedWürfel.augenzahl;
		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
			case 1: einscount++;
			case 2: zweicount++;
			case 3: dreicount++;
			case 4: viercount++;
			case 5: fünfcount ++;
			case 6: sechscount ++;
		};
	}
		
		if(einscount>=3||zweicount>=3||dreicount>=3||viercount>=3||fünfcount>=3||sechscount>=3){
			return punkte;
		}else{
			return(punkte=0);
		}
}

	
//4er Pasch

public static int viererPasch(){
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		punkte = punkte + selectedWürfel.augenzahl;
		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
			case 1: einscount++;
			case 2: zweicount++;
			case 3: dreicount++;
			case 4: viercount++;
			case 5: fünfcount ++;
			case 6: sechscount ++;
		};
	}
		
		if(einscount>=4||zweicount>=4||dreicount>=4||viercount>=4||fünfcount>=4||sechscount>=4){
			return punkte;
		}else{
			return(punkte=0);
		}
}

//FullHouse
public static int fullHouse(){
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	boolean hasdrei=false, haszwei=false;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		punkte = punkte + selectedWürfel.augenzahl;
		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
			case 1: einscount++;
			case 2: zweicount++;
			case 3: dreicount++;
			case 4: viercount++;
			case 5: fünfcount ++;
			case 6: sechscount ++;
		};
	}
		//Eine Zahl 3 mal da?
		if(einscount==3||zweicount==3||dreicount==3||viercount==3||fünfcount==3||sechscount==3){
			hasdrei=true;
		};
		// eine Zahl 2 mal da?
		if(einscount==2||zweicount==2||dreicount==2||viercount==2||fünfcount==2||sechscount==2){
			haszwei=true;
		};
		//Wenn beides da, dann Full house
		if(hasdrei==true&&haszwei==true){
			return (punkte=25);
		}else{
			return (punkte=0);
		}
}


//Kniffel
public static int kniffel(){
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();

		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
			case 1: einscount++;
			case 2: zweicount++;
			case 3: dreicount++;
			case 4: viercount++;
			case 5: fünfcount ++;
			case 6: sechscount ++;
		};
	}
		
		if(einscount==5||zweicount==5||dreicount==5||viercount==5||fünfcount==5||sechscount==5){
			return (punkte=50);
		}else{
			return(punkte=0);
		}
}
	
//kleine Straße
public static int kleineStraße(){
	exists= false;
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		zahlenStrahl= zahlenStrahl + Integer.toString(selectedWürfel.getAugenzahl());	
	}//Ende While
	//schaut ob Straßenmöglichkeiten vorhanden
	exists= zahlenStrahl.contains("1234")||zahlenStrahl.contains("2345")||zahlenStrahl.contains("3456");//liefert true oder false
	
	if(exists==true){
	return (punkte=30);
	}else{
		return (punkte=0);
	}
}
	
//große Straße
public static int großeStraße(){
	exists= false;
	//Punkte zurücksetzen
	punkte =0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		zahlenStrahl= zahlenStrahl + Integer.toString(selectedWürfel.getAugenzahl());	
	}//Ende While
	//schaut ob Straßenmöglichkeiten vorhanden
	exists= zahlenStrahl.contains("12345")||zahlenStrahl.contains("23456");//liefert true oder false
	
	if(exists==true){
	return (punkte=40);
	}else{
		return (punkte=0);
	}
}
	
//chance
	
//Sonderegeln
	
/* alles direkt in Felder eintragen, dann kann der Spieler sehen, wo er wann welche Punkte bekommt. 
 * Wenn er die Punkte haben möchte muss er auf das Feld drücken! Dieser Wert wird dann gespeichert,
 * Das Feld wird für zukünftige Eintragungen gesperrt
 */
	


}
