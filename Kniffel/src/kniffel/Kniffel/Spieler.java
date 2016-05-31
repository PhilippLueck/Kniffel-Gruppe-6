package kniffel.Kniffel;

import javax.swing.JOptionPane;

public class Spieler {
	private String name;
	private int spielerID;
	private int punkte;
	private int spielgewonnen;
	
	public Spieler(String name, int spielerID, int punkte){
		this.name = name;
		this.spielerID = spielerID;
		this.punkte = punkte;
//		setSpielerID(spielerID);
//		setPunkte(punkte);
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
		if(name !=""){
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
	

}
