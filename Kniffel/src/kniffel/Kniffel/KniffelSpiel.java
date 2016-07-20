package kniffel.Kniffel;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class KniffelSpiel {

//Treeset Spielerliste
public static TreeSet <Spieler> spielerListe = new TreeSet<Spieler>() ;
//treeset W�rfelliste
public static TreeSet<W�rfel> w�rfelListe = new TreeSet<W�rfel>() ;
//Treeset Punkte
public static TreeSet<Punkte> punkteListe = new TreeSet<Punkte>() ;




/* Methoden f�r die Spielerliste*/
//Spieler hinzuf�genmethode
public static boolean spielerHinzuf�gen(String name, int spielerID, int punkte){
		
		try {
			//Checkt ob name leer, bzw ID nicht da
			if(spielerID == 0){
				JOptionPane.showMessageDialog(null,"ID fehlt!");
				return false;
			}else{
				//Spieler in Liste hinzuf�gen
				System.out.println("Spieler hinzugef�gt");
				return spielerListe.add(new Spieler(name,spielerID,punkte));
				
			}// if Anweisung Ende
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugef�gt werden");
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

/*Jetzt die Methoden f�r die W�rfelliste*/

public static boolean  w�rfelHinzuf�gen(W�rfel w�rfel){
	try {
		if(w�rfel.getW�rfelnummer()==0||w�rfel.getAugenzahl()<0||w�rfel.getAugenzahl()>6){
			JOptionPane.showMessageDialog(null, "W�rfel konnte wegen falscher Parameter nicht erstellt werden");
			return false;
		}else{
			System.out.println("W�rfel hinzugef�gt");
			return w�rfelListe.add(w�rfel);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "W�rfel konnte nicht hinzugef�gt werden");
		return false;
	}
	
}


//W�rfeln ermitteln
public static W�rfel ermittleW�rfel( int w�rfelnummer){
	
	W�rfel tmp = new W�rfel(w�rfelnummer,0, false);
	
	if (w�rfelListe.contains(tmp))
		tmp = w�rfelListe.floor(tmp);
	else
		tmp = null;
	
	return tmp;

}// Ende ermittle W�rfel 


//W�rfel TreeSet Ausgeben
public static void w�rfelListeAusgeben() {
	Iterator<W�rfel> iter = w�rfelListe.iterator();
	while(iter.hasNext()) {
		W�rfel tmp = iter.next();
		System.out.println("W�rfelnummer: "+ tmp.w�rfelnummer + " vorhanden");
	}
}// Ende w�rfellistausgeben

/*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
/*Jetzt die Methoden f�r die punkteListe*/

//Punkte in Treeset hinzuf�gen
public static boolean punkteHinzufuegen(int points,String name){
	try {
		//Checkt ob name leer, bzw ID nicht da
		if(points<0){
			JOptionPane.showMessageDialog(null,"Punkte fehlen!");
			return false;
		}else{
			//Spieler in Liste hinzuf�gen
			System.out.println("Punkte hinzugef�gt");
			return punkteListe.add(new Punkte(points,name));
			
		}// if Anweisung Ende
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Spieler konnte nicht hinzugef�gt werden");
		return false;
	}
}
}
