package kniffel.Kniffel;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {
	
private int anzahlSpiele;

//ArrayList Spielerliste
public static TreeSet <Spieler> spielerListe = new TreeSet<Spieler>() ;
//treeset Würfelliste
public static TreeSet<Würfel> würfelListe = new TreeSet<Würfel>() ;



//Spieler hinzufügenmethode, wird wahrscheinlich verlagert
public static boolean spielerHinzufügen(String name, int spielerID, int punkte, int wurfnummer){
		
		try {
			//Checkt ob name leer, bzw ID nicht da
			if(spielerID == 0){
				JOptionPane.showMessageDialog(null,"ID fehlt!");
				return false;
			}else{
				//Spieler in Liste hinzufügen
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

public static boolean  würfelHinzufügen(int würfelnummer, int augenzahl, int wurf, boolean blocked){
	try {
		if(würfelnummer==0||augenzahl<0||augenzahl>6||wurf<0){
			JOptionPane.showMessageDialog(null, "Würfel konnte wegen falscher Parameter nicht erstellt werden");
			return false;
		}else{
			System.out.println("Würfel hinzugefügt");
			return würfelListe.add(new Würfel(würfelnummer,augenzahl,wurf,blocked));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Würfel konnte nicht hinzugefügt werden");
		return false;
	}
	
}


public static Würfel ermittleWürfel( int würfelnummer){
	
	Iterator<Würfel> i = würfelListe.iterator();
	while(i.hasNext()){
		Würfel tmp = (Würfel) i.next();
		if(!(würfelnummer==tmp.getWürfelnummer())){
			return null;
		}else{
			return(tmp); //Gibt Objekt aus
		}
	};
	
	return null;
}

}
