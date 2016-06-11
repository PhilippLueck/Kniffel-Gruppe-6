package kniffel.Kniffel;


import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {
	
private int anzahlSpiele;

//ArrayList Spielerliste
public static TreeSet <Spieler> spielerListe = new TreeSet<Spieler>() ;
//treeset W�rfelliste
public static TreeSet<W�rfel> w�rfelListe = new TreeSet<W�rfel>() ;


//Spielstart bei Klick auf start
public void spielStart(){
	if(spielerListe==null||w�rfelListe == null){
	JOptionPane.showMessageDialog(null,"Keine Spieler und W�rfel vorhanden");
	}else{
	
		//Laden der Main Gui und start mit Spieler 1!!!
	}
}

//Spieler hinzuf�genmethode, wird wahrscheinlich verlagert
public static boolean spielerHinzuf�gen(String name, int spielerID, int punkte, int wurfnummer){
		try {
			//Checkt ob name leer, bzw ID nicht da
			if(spielerID == 0){
				JOptionPane.showMessageDialog(null,"ID fehlt!");
				return false;
			}else{
				//Spieler in Liste hinzuf�gen
				System.out.println("Spieler hinzugef�gt");
				return spielerListe.add(new Spieler(name,spielerID,punkte,wurfnummer));
				
			}// if Anweisung Ende
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugef�gt werden");
			return false;
		}
	
	
}

public static boolean  w�rfelHinzuf�gen(int w�rfelnummer, int augenzahl, int wurf, boolean blocked){
	try {
		if(w�rfelnummer==0||augenzahl<1||augenzahl>6||wurf<0){
			JOptionPane.showMessageDialog(null, "W�rfel konnte wegen falscher Parameter nicht erstellt werden");
			return false;
		}else{
			System.out.println("W�rfel hinzugef�gt");
			return w�rfelListe.add(new W�rfel(w�rfelnummer,augenzahl,wurf,blocked));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "W�rfel konnte nicht hinzugef�gt werden");
		return false;
	}
	
}
}
