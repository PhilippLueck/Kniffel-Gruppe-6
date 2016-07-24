package kniffel.Kniffel;

import javax.swing.JOptionPane;
import java.util.TreeSet;

public class Spieler extends KniffelSpiel implements Comparable<Spieler>{
	private String name;
	private int spielerID;
	private int punkte;
	private int spielgewonnen;
	
	
	
	public Spieler(String name, int spielerID, int punkte){
		setName(name);
		setSpielerID(spielerID); 
		setPunkte(punkte);
		

	}

	public int getPunkte() {
		return punkte;
	
	}
	//Punkte dürfen nicht kleiner als 0 sein und nicht größer als 525 (mit viel Kniffelglück)
	public void setPunkte(int punkte) {
		if(!(punkte<0)|| punkte>525){
			this.punkte = punkte;	
		}else{
			JOptionPane.showMessageDialog(null, "Diese Punktzahl ist unmöglich");
		}
	
		
	}

	public String getName() {
		return name;
	}
	
	//Name darf nicht leer sein
	public void setName(String name) {
		if(!(name.isEmpty())){
		this.name = name;
		}
		else{
			JOptionPane.showMessageDialog(null, "Bitte Namen eingeben");
		}
	}

	public int getSpielerID() {
		return spielerID;
	}
	//SpielerID darf nicht kleiner 0 sein
	public void setSpielerID(int spielerID) {
		if(!(spielerID<0)){
		this.spielerID = spielerID;
		}else{
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe");
		}
	}
	
	public int getSpielgewonnen() {
		return spielgewonnen;
	}
	//Spielgewonnen nicht kleiner 0 (so schlecht kann man nicht sein)
	public void setSpielgewonnen(int spielgewonnen) {
		if (!(spielgewonnen<0)){
			this.spielgewonnen = spielgewonnen;	
		}else{
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe");
		}
	}

	@Override
	//sotiert nach SpielerID
	public int compareTo(Spieler temp) {
		// TODO Auto-generated method stub
		return this.spielerID-temp.getSpielerID();
	}

	

}
