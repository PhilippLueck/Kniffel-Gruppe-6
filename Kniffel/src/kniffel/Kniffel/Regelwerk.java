package kniffel.Kniffel;

import java.util.Iterator;


public  class Regelwerk extends KniffelSpiel {

private  int zahlenCount;
private  int punkte;
private  String zahlenStrahl;
private  boolean exists;


//Getter und Setters mit Logik befüllen (da sie statisch sind können sie überall geändert werden, also aufpassen) blub

public  int getZahlenCount() {
	return zahlenCount;
}

public  void setZahlenCount(int zahlenCount) {
	this.zahlenCount = zahlenCount;
}

public  int getPunkte() {
	return punkte;
}

public  void setPunkte(int punkte) {
	this.punkte = punkte;
}

public  String getZahlenStrahl() {
	return zahlenStrahl;
}

public  void setZahlenStrahl(String zahlenStrahl) {
	this.zahlenStrahl = zahlenStrahl;
}

public  boolean isExists() {
	return exists;
}

public  void setExists(boolean exists) {
	this.exists = exists;
}


/*---------------------------------------------------------------------------------------------------------------------------------------*/
//1er
public  int einser(){
	//Punkte zurücksetzen
	punkte =0;
	zahlenCount=0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.getAugenzahl()==1){
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
public  int zweier(){
	//Punkte zurücksetzen
	punkte =0;
	zahlenCount=0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.getAugenzahl()==2){
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
public  int dreier(){
	//Punkte zurücksetzen
	punkte =0;
	zahlenCount=0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.getAugenzahl()==3){
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
public  int vierer(){
	//Punkte zurücksetzen
	punkte =0;
	zahlenCount=0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.getAugenzahl()==4){
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
public  int fuenfer(){
	//Punkte zurücksetzen
	punkte =0;
	zahlenCount=0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.getAugenzahl()==5){
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
public  int sechser(){
	//Punkte zurücksetzen
	punkte =0;
	zahlenCount=0;
	//jetzt Liste durchlaufen
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		if(selectedWürfel.getAugenzahl()==6){
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
public  int dreierPasch(){
	punkte =0;
	zahlenCount=0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		punkte = punkte + selectedWürfel.getAugenzahl();
		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
			case 1: einscount++;
					break;
			case 2: zweicount++;
					break;
			case 3: dreicount++;
					break;
			case 4: viercount++;
					break;
			case 5: fünfcount ++;
					break;
			case 6: sechscount ++;
					break;
		};
	}
		
		if(einscount>=3||zweicount>=3||dreicount>=3||viercount>=3||fünfcount>=3||sechscount>=3){
			return punkte;
		}else{
			return(punkte=0);
		}
}

	
//4er Pasch

public  int viererPasch(){
	punkte =0;
	zahlenCount=0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		punkte = punkte + selectedWürfel.getAugenzahl();
		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
		case 1: einscount++;
		break;
		case 2: zweicount++;
				break;
		case 3: dreicount++;
				break;
		case 4: viercount++;
				break;
		case 5: fünfcount ++;
				break;
		case 6: sechscount ++;
				break;
		};
	}
		
		if(einscount>=4||zweicount>=4||dreicount>=4||viercount>=4||fünfcount>=4||sechscount>=4){
			return punkte;
		}else{
			return(punkte=0);
		}
}

//FullHouse
public  int fullHouse(){
	
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	boolean hasdrei=false, haszwei=false;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();
		punkte = punkte + selectedWürfel.getAugenzahl();
		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.augenzahl){
		case 1: einscount++;
		break;
		case 2: zweicount++;
				break;
		case 3: dreicount++;
				break;
		case 4: viercount++;
				break;
		case 5: fünfcount ++;
				break;
		case 6: sechscount ++;
				break;
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
public  int kniffel(){
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();

		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.getAugenzahl()){
		case 1: einscount++;
				break;
		case 2: zweicount++;
				break;
		case 3: dreicount++;
				break;
		case 4: viercount++;
				break;
		case 5: fünfcount ++;
				break;
		case 6: sechscount ++;
				break;
		};
	}
		
		if(einscount==5||zweicount==5||dreicount==5||viercount==5||fünfcount==5||sechscount==5){
			return (punkte=50);
		}else{
			return(punkte=0);
		}
}
	
//kleine Straße
public  int kleineStraße(){
	
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();

		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.getAugenzahl()){
		case 1: einscount++;
				break;
		case 2: zweicount++;
				break;
		case 3: dreicount++;
				break;
		case 4: viercount++;
				break;
		case 5: fünfcount ++;
				break;
		case 6: sechscount ++;
				break;
		};
	}
		
		if((einscount>=1&&zweicount>=1&&dreicount>=1&&viercount>=1)||
			(zweicount>=1&&dreicount>=1&&viercount>=1&&fünfcount>=1)||
			(dreicount>=1&&viercount>=1&&fünfcount>=1&&sechscount>=1)){
				return (punkte=30);
		}else{
				return(punkte=0);
		}	

}
	
//große Straße
public  int großeStraße(){
	punkte =0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,fünfcount=0,sechscount=0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
		Würfel selectedWürfel = WürfelIterator.next();

		//Hier werden alle Zahlen geprüft, wenn da ++
		switch(selectedWürfel.getAugenzahl()){
		case 1: einscount++;
				break;
		case 2: zweicount++;
				break;
		case 3: dreicount++;
				break;
		case 4: viercount++;
				break;
		case 5: fünfcount ++;
				break;
		case 6: sechscount ++;
				break;
		};
	}
		
		if((einscount>=1&&zweicount>=1&&dreicount>=1&&viercount>=1&&fünfcount>=1)||
			(zweicount>=1&&dreicount>=1&&viercount>=1&&fünfcount>=1&&sechscount>=1)
			){
				return (punkte=40);
		}else{
				return(punkte=0);
		}	

}
	

//chance
public  int chance(){
	punkte = 0;
	Iterator<Würfel> WürfelIterator = KniffelSpiel.würfelListe.iterator();		
	while(WürfelIterator.hasNext()){
	Würfel selectedWürfel = WürfelIterator.next();
	punkte = punkte +selectedWürfel.getAugenzahl() ;
	}
	return punkte;
}
	
//Sonderegeln
	
/* alles direkt in Felder eintragen, dann kann der Spieler sehen, wo er wann welche Punkte bekommt. 
 * Wenn er die Punkte haben möchte muss er auf das Feld drücken! Dieser Wert wird dann gespeichert,
 * Das Feld wird für zukünftige Eintragungen gesperrt
 */
	


}
