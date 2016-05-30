package ALt;

public class Spieler {
	int i= 1;
	private String Name;
	private int Nummer;
	
	public Spieler(String Name, int Nummer){
		setName(Name);
		setNummer(Nummer);
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		if (i <=3){
			
		
		Name = name;}
		else{
			System.out.print("Maximale Anzahl der spieler erreicht");
		}
	}

	public int getNummer() {
		return Nummer;
	}

	public void setNummer(int nummer) {
		Nummer = nummer;
	}

}
