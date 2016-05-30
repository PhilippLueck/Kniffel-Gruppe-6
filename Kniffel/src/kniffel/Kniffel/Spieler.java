package kniffel.Kniffel;

public class Spieler {
	private String name;
	private int spielerID;
	private int punkte;
	
	public Spieler( String Name, int spielerID, int punkte){
		setName(name);
		setSpielerID(spielerID);
		setPunkte(punkte);
	}

	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name !=""){
		this.name = name;
		}
		else{
			System.out.print("Falsche eingabe");
		}
	}

	public int getSpielerID() {
		return spielerID;
	}

	public void setSpielerID(int spielerID) {
		this.spielerID = spielerID;
	}
	

}
