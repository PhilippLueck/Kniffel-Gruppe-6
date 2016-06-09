package kniffel.Kniffel;

import javax.swing.JOptionPane;
import java.util.TreeSet;

public class Spieler extends KniffelSpiel implements Comparable<Spieler>{
	private String name;
	private int spielerID;
	private int punkte;
	private int spielgewonnen;
	public int wurfnummer;
	
	
	public Spieler(String name, int spielerID, int punkte, int wurfnummer){
		setName(name);
		setSpielerID(spielerID); 
		setPunkte(punkte);
		setWurfnummer(wurfnummer);

	}

	public int getPunkte() {
		return punkte;
	
	}
	
	public void setPunkte(int punkte) {
		if(!(punkte<0)){
			this.punkte = punkte;	
		}else{
			JOptionPane.showMessageDialog(null, "Minuspunkte unm�glich");
		}
	
		
	}

	public String getName() {
		return name;
	}

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

	public void setSpielerID(int spielerID) {
		if(!(spielerID<0)){
		this.spielerID = spielerID;
		}else{
			JOptionPane.showMessageDialog(null, "Ung�ltige Eingabe");
		}
	}
	
	public int getSpielgewonnen() {
		return spielgewonnen;
	}

	public void setSpielgewonnen(int spielgewonnen) {
		if (!(spielgewonnen<0)){
			this.spielgewonnen = spielgewonnen;	
		}else{
			JOptionPane.showMessageDialog(null, "Ung�ltige Eingabe");
		}
	}

	public int getWurfnummer() {
		return wurfnummer;
	}

	public void setWurfnummer(int wurfnummer) { // nur ganze Zahlen aktzeptieren
		if(wurfnummer < 0 || wurfnummer > 3){
			JOptionPane.showMessageDialog(null, "W�rfe im ung�ltigen Bereich");
		}
	}

	@Override
	public int compareTo(Spieler temp) {
		// TODO Auto-generated method stub
		return this.spielerID-temp.getSpielerID();
	}

	

}
