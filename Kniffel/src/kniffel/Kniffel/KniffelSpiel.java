package kniffel.Kniffel;

import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {
	
private int anzahlSpiele;

//treeset Spielerliste
public static TreeSet<Spieler> spielerListe = new TreeSet<Spieler>() ;
//treeset Würfelliste
public static TreeSet<Würfel> würfelListe = new TreeSet<Würfel>() ;


//Spielstart bei Klick auf start
public void spielStart(){
	if(spielerListe==null||würfelListe == null){
	JOptionPane.showMessageDialog(null,"Keine Spieler und Würfel vorhanden");
	}else{
	
		//Laden der Main Gui und start mit Spieler 1!!!
	}
}

//Spieler hinzufügenmethode, wird wahrscheinlich verlagert
public static boolean spielerHinzufügen(String name, int spielerID, int punkte, int wurfnummer){
		try {
			if(name == "" || spielerID == 0){// HIER SPRINGT ER NIE REIN warum muss ich noch checken name ist eigentlich leer wenn man keinen Namen eintippt, aber irgendwie doch nicht (Alex)
				JOptionPane.showMessageDialog(null,"Name oder ID fehlt!");
				return false;
			}else{
				System.out.println("Spieler hinzugefügt");
				return spielerListe.add(new Spieler(name,spielerID,punkte,wurfnummer));
			}// if Anweisung Ende
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugefügt werden");
			return false;
		}
	
	
}

public static Würfel würfelHinzufügen(int würfelnummer, int augenzahl, int wurf, boolean blocked){
	try {
		System.out.println("Würfel hinzugefügt");
		return new Würfel(würfelnummer,augenzahl,wurf,blocked);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Würfel konnte nicht hinzugefügt werden");
		return null;
	}
	
}
}
