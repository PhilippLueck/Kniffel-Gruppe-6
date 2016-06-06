package kniffel.Kniffel;

import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {
	
private int anzahlSpiele;

//treeset Spielerliste
public static TreeSet<Spieler> spielerListe = new TreeSet<Spieler>() ;



public void spielStart(int spielerzahl){
	if(spielerzahl==0){
	JOptionPane.showMessageDialog(null,"Keine Spieler und W�rfel vorhanden");
	}else{
	
		//Laden der Main Gui und start mit Spieler 1!!!
	}
}

//Spieler hinzuf�genmethode, wird wahrscheinlich verlagert
public boolean hinzuf�gen(String name, int spielerID, int punkte, int wurfnummer){
	try {
		System.out.println("Spieler hinzugef�gt");
		return spielerListe.add(new Spieler(name,spielerID,punkte,wurfnummer));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugef�gt werden");
		return false;
	}
}

}
