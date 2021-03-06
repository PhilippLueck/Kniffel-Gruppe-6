package kniffel.Kniffel;

import java.util.Iterator;


public  class Regelwerk extends KniffelSpiel {

private  int zahlenCount;
private  int punkte;

/*Hier alle Regelpr�fungen (Kniffel-Sonderregeln besitzen "Abk�rzungen" f�r die entsprechenden Punktzahlen )*/

/*---------------------------------------------------------------------------------------------------------------------------------------*/
//1er
public  int einser(boolean streichen){
	//Punkte zur�cksetzen
	punkte =0;
	zahlenCount=0;
	if(streichen == true){
		return punkte;
	}else{
		//jetzt Liste durchlaufen
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			if(selectedW�rfel.getAugenzahl()==1){
				zahlenCount++;
			}
		}//Ende While
		
		//Jetzt Punkte zusammenz�hlen
		for(int j = 1;j<=zahlenCount;j++){
		punkte = punkte + 1;
		}
		
		return punkte;
	}
}
	
//2er
public  int zweier(boolean streichen){
	//Punkte zur�cksetzen
	punkte =0;
	zahlenCount=0;
	if(streichen == true){
		return punkte;
	}else{
		//jetzt Liste durchlaufen
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			if(selectedW�rfel.getAugenzahl()==2){
				zahlenCount++;
			}
		}//Ende While
		
		//Jetzt Punkte zusammenz�hlen
		for(int j = 1;j<=zahlenCount;j++){
		punkte = punkte + 2;
		}
		
		return punkte;
	}
}
	
//3er
public  int dreier(boolean streichen){
	//Punkte zur�cksetzen
	punkte =0;
	zahlenCount=0;
	if(streichen == true){
		return punkte;
	}else{
		//jetzt Liste durchlaufen
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			if(selectedW�rfel.getAugenzahl()==3){
				zahlenCount++;
			}
		}//Ende While
		
		//Jetzt Punkte zusammenz�hlen
		for(int j = 1;j<=zahlenCount;j++){
		punkte = punkte + 3;
		}
		
		return punkte;
	}
}	
//4er
public  int vierer(boolean streichen){
	//Punkte zur�cksetzen
	punkte =0;
	zahlenCount=0;
	if(streichen == true){
		return punkte;
	}else{
		//jetzt Liste durchlaufen
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			if(selectedW�rfel.getAugenzahl()==4){
				zahlenCount++;
			}
		}//Ende While
		
		//Jetzt Punkte zusammenz�hlen
		for(int j = 1;j<=zahlenCount;j++){
		punkte = punkte + 4;
		}
		
		return punkte;
	}
}
//5er
public  int fuenfer(boolean streichen){
	//Punkte zur�cksetzen
	punkte =0;
	zahlenCount=0;
	if(streichen == true){
		return punkte;
	}else{
		//jetzt Liste durchlaufen
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			if(selectedW�rfel.getAugenzahl()==5){
				zahlenCount++;
			}
		}//Ende While
		
		//Jetzt Punkte zusammenz�hlen
		for(int j = 1;j<=zahlenCount;j++){
		punkte = punkte + 5;
		}
		
		return punkte;
	}
}
	
//6er
public  int sechser(boolean streichen){
	//Punkte zur�cksetzen
	punkte =0;
	zahlenCount=0;
	if(streichen == true){
		return punkte;
	}else{
		//jetzt Liste durchlaufen
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			if(selectedW�rfel.getAugenzahl()==6){
				zahlenCount++;
			}
		}//Ende While
		
		//Jetzt Punkte zusammenz�hlen
		for(int j = 1;j<=zahlenCount;j++){
		punkte = punkte + 6;
		}
		
		return punkte;
	}
}
	

	
//3er pasch
public  int dreierPasch(){
	punkte =0;
	zahlenCount=0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,f�nfcount=0,sechscount=0;
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		punkte = punkte + selectedW�rfel.getAugenzahl();
		//Hier werden alle Zahlen gepr�ft, wenn da ++
		switch(selectedW�rfel.augenzahl){
			case 1: einscount++;
					break;
			case 2: zweicount++;
					break;
			case 3: dreicount++;
					break;
			case 4: viercount++;
					break;
			case 5: f�nfcount ++;
					break;
			case 6: sechscount ++;
					break;
		};
	}
		
		if(einscount>=3||zweicount>=3||dreicount>=3||viercount>=3||f�nfcount>=3||sechscount>=3){
			return punkte;
		}else{
			return(punkte=0);
		}
}

	
//4er Pasch

public  int viererPasch(boolean Kniffel){
	punkte =0;
	zahlenCount=0;
	int einscount=0,zweicount=0,dreicount=0,viercount=0,f�nfcount=0,sechscount=0;
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
		W�rfel selectedW�rfel = W�rfelIterator.next();
		punkte = punkte + selectedW�rfel.getAugenzahl();
		//Hier werden alle Zahlen gepr�ft, wenn da ++
		switch(selectedW�rfel.augenzahl){
		case 1: einscount++;
		break;
		case 2: zweicount++;
				break;
		case 3: dreicount++;
				break;
		case 4: viercount++;
				break;
		case 5: f�nfcount ++;
				break;
		case 6: sechscount ++;
				break;
		};
	}
		
		if(einscount>=4||zweicount>=4||dreicount>=4||viercount>=4||f�nfcount>=4||sechscount>=4){
			return punkte;
		}else{
			return(punkte=0);
		}
}

//FullHouse
public  int fullHouse(boolean Kniffel){
	if(Kniffel == false){
		punkte =0;
		int einscount=0,zweicount=0,dreicount=0,viercount=0,f�nfcount=0,sechscount=0;
		boolean hasdrei=false, haszwei=false;
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
			punkte = punkte + selectedW�rfel.getAugenzahl();
			//Hier werden alle Zahlen gepr�ft, wenn da ++
			switch(selectedW�rfel.augenzahl){
			case 1: einscount++;
			break;
			case 2: zweicount++;
					break;
			case 3: dreicount++;
					break;
			case 4: viercount++;
					break;
			case 5: f�nfcount ++;
					break;
			case 6: sechscount ++;
					break;
			};
		}
			//Eine Zahl 3 mal da?
			if(einscount==3||zweicount==3||dreicount==3||viercount==3||f�nfcount==3||sechscount==3){
				hasdrei=true;
			};
			// eine Zahl 2 mal da?
			if(einscount==2||zweicount==2||dreicount==2||viercount==2||f�nfcount==2||sechscount==2){
				haszwei=true;
			};
			//Wenn beides da, dann Full house
			if(hasdrei==true&&haszwei==true){
				return (punkte=25);
			}else{
				return (punkte=0);
			}
	}else{
		return(punkte=25);
	}
}


//Kniffel
public  int kniffel(){
		punkte =0;
		int einscount=0,zweicount=0,dreicount=0,viercount=0,f�nfcount=0,sechscount=0;
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
	
			//Hier werden alle Zahlen gepr�ft, wenn da ++
			switch(selectedW�rfel.getAugenzahl()){
			case 1: einscount++;
					break;
			case 2: zweicount++;
					break;
			case 3: dreicount++;
					break;
			case 4: viercount++;
					break;
			case 5: f�nfcount ++;
					break;
			case 6: sechscount ++;
					break;
			};
		}
			
			if(einscount==5||zweicount==5||dreicount==5||viercount==5||f�nfcount==5||sechscount==5){
				return (punkte=50);
			}else{
				return(punkte=0);
			}
}
	
//kleine Stra�e
public  int kleineStra�e(boolean Kniffel){
	if(Kniffel == false){
		punkte =0;
		int einscount=0,zweicount=0,dreicount=0,viercount=0,f�nfcount=0,sechscount=0;
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
	
			//Hier werden alle Zahlen gepr�ft, wenn da ++
			switch(selectedW�rfel.getAugenzahl()){
			case 1: einscount++;
					break;
			case 2: zweicount++;
					break;
			case 3: dreicount++;
					break;
			case 4: viercount++;
					break;
			case 5: f�nfcount ++;
					break;
			case 6: sechscount ++;
					break;
			};
		}
			
			if((einscount>=1&&zweicount>=1&&dreicount>=1&&viercount>=1)||
				(zweicount>=1&&dreicount>=1&&viercount>=1&&f�nfcount>=1)||
				(dreicount>=1&&viercount>=1&&f�nfcount>=1&&sechscount>=1)){
					return (punkte=30);
			}else{
					return(punkte=0);
			}	
	}else{
		return(punkte=30);
	}
}
	
//gro�e Stra�e
public  int gro�eStra�e(boolean Kniffel){
	if(Kniffel == false){
		punkte =0;
		int einscount=0,zweicount=0,dreicount=0,viercount=0,f�nfcount=0,sechscount=0;
		Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
		while(W�rfelIterator.hasNext()){
			W�rfel selectedW�rfel = W�rfelIterator.next();
	
			//Hier werden alle Zahlen gepr�ft, wenn da ++
			switch(selectedW�rfel.getAugenzahl()){
			case 1: einscount++;
					break;
			case 2: zweicount++;
					break;
			case 3: dreicount++;
					break;
			case 4: viercount++;
					break;
			case 5: f�nfcount ++;
					break;
			case 6: sechscount ++;
					break;
			};
		}
			
			if((einscount>=1&&zweicount>=1&&dreicount>=1&&viercount>=1&&f�nfcount>=1)||
				(zweicount>=1&&dreicount>=1&&viercount>=1&&f�nfcount>=1&&sechscount>=1)
				){
					return (punkte=40);
			}else{
					return(punkte=0);
			}	
	}else{
		return (punkte=40);
	}
}
	

//chance
public  int chance(){
	punkte = 0;
	Iterator<W�rfel> W�rfelIterator = KniffelSpiel.w�rfelListe.iterator();		
	while(W�rfelIterator.hasNext()){
	W�rfel selectedW�rfel = W�rfelIterator.next();
	punkte = punkte +selectedW�rfel.getAugenzahl() ;
	}
	return punkte;
}
	


}
