package kniffel.Kniffel;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {

//Treeset Spielerliste
public static TreeSet <Spieler> spielerListe = new TreeSet<Spieler>() ;
//treeset Würfelliste
public static TreeSet<Würfel> würfelListe = new TreeSet<Würfel>() ;
//Treeset Punkte
public static TreeSet<Punkte> punkteListe = new TreeSet<Punkte>() ;




/* Methoden für die Spielerliste*/
//Spieler hinzufügenmethode
public static boolean spielerHinzufügen(String name, int spielerID, int punkte){
		
		try {
			//Checkt ob name leer, bzw ID nicht da
			if(spielerID == 0){
				JOptionPane.showMessageDialog(null,"ID fehlt!");
				return false;
			}else{
				//Spieler in Liste hinzufügen
				System.out.println("Spieler hinzugefügt");
				return spielerListe.add(new Spieler(name,spielerID,punkte));
				
			}// if Anweisung Ende
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugefügt werden");
			return false;
		}
}



public static int spielerCount(){
	return (spielerListe.last().getSpielerID());
}


//E nach Spieler ID suchen im TreeSet
public static Spieler ermittleSpieler( int spielernummer){
	Spieler tmp = new Spieler("__", spielernummer, 0);
	if (spielerListe.contains(tmp))
		tmp = spielerListe.floor(tmp);
	else
		tmp = null;
	return tmp;
}// Ende ermittle Spieler


/*--------------------------------------------------------------------------------------------------------------------------------------------------------*/

/*Jetzt die Methoden für die Würfelliste*/

public static boolean  würfelHinzufügen(Würfel würfel){
	try {
		if(würfel.getWürfelnummer()==0||würfel.getAugenzahl()<0||würfel.getAugenzahl()>6){
			JOptionPane.showMessageDialog(null, "Würfel konnte wegen falscher Parameter nicht erstellt werden");
			return false;
		}else{
			System.out.println("Würfel hinzugefügt");
			return würfelListe.add(würfel);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Würfel konnte nicht hinzugefügt werden");
		return false;
	}
	
}


//Würfeln ermitteln
public static Würfel ermittleWürfel( int würfelnummer){
	
	Würfel tmp = new Würfel(würfelnummer,0, false);
	
	if (würfelListe.contains(tmp))
		tmp = würfelListe.floor(tmp);
	else
		tmp = null;
	
	return tmp;

}// Ende ermittle Würfel 


//Würfel TreeSet Ausgeben
public static void würfelListeAusgeben() {
	Iterator<Würfel> iter = würfelListe.iterator();
	while(iter.hasNext()) {
		Würfel tmp = iter.next();
		System.out.println("Würfelnummer: "+ tmp.würfelnummer + " vorhanden");
	}
}// Ende würfellistausgeben

/*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*Jetzt die Methoden für die punkteListe*/

//Punkte in Treeset hinzufügen
public static boolean punkteHinzufuegen(int points,String name){
	try {
		//Checkt ob name leer, bzw ID nicht da
		if(points<0){
			JOptionPane.showMessageDialog(null,"Punkte fehlen!");
			return false;
		}else{
			//Spieler in Liste hinzufügen
			System.out.println("Punkte hinzugefügt");
			return punkteListe.add(new Punkte(points,name));
			
		}// if Anweisung Ende
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugefügt werden");
		return false;
	}
}
}
