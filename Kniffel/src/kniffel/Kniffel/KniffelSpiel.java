package kniffel.Kniffel;

import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {
	
private int anzahlSpiele;

//treeset Spielerliste
public static TreeSet<Spieler> spielerListe = new TreeSet<Spieler>() ;



public void spielStart(int spielerzahl){
	if(spielerzahl==0){
	JOptionPane.showMessageDialog(null,"Keine Spieler und Würfel vorhanden");
	}else{
	
		//Laden der Main Gui und start mit Spieler 1!!!
	}
}

//Spieler hinzufügenmethode, wird wahrscheinlich verlagert
public boolean hinzufügen(String name, int spielerID, int punkte, int wurfnummer){
	try {
		System.out.println("Spieler hinzugefügt");
		return spielerListe.add(new Spieler(name,spielerID,punkte,wurfnummer));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugefügt werden");
		return false;
	}
}

}
