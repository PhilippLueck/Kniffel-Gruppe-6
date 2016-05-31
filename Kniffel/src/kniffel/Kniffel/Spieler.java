package kniffel.Kniffel;

import javax.swing.JOptionPane;

public class Spieler {
	private String name;
	private int spielerID;
	private int punkte;
	private int spielgewonnen;
	
	public Spieler( String Name, int spielerID, int punkte){
		setName(name);
		setSpielerID(spielerID);
		setPunkte(punkte);
	}

	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte) {
		if(punkte!<0){
			this.punkte = punkte;	
		}else{
			JOptionPane.showMessageDialog(null, "Minuspunkte unmöglich","Fehler",JOptionPane.ERROR MESSAGE);
		}
	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name !=""){
		this.name = name;
		}
		else{
			JOptionPane.showMessageDialog(null, "Bitte Namen eingeben","Fehler",JOptionPane.ERROR MESSAGE);
		}
	}

	public int getSpielerID() {
		return spielerID;
	}

	public void setSpielerID(int spielerID) {
		if(spielerID!<0){
		this.spielerID = spielerID;
	}else{
		JOptionPane.showMessageDialog(null, "Ungültige Eingabe","Fehler",JOptionPane.ERROR MESSAGE);
	}
	
	public int getSpielgewonnen() {
		return spielgewonnen;
	}

	public void setSpielgewonnen(int spielgewonnen) {
		if (spielgewonnen!<0){
			this.spielgewonnen = spielgewonnen;	
		}else{
			JOptionPane.showMessageDialog(null, "Ungültige Eingabe","Fehler",JOptionPane.ERROR MESSAGE);
		}
	}
	

}
