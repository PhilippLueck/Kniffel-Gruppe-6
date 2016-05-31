package kniffel.Kniffel;

public class SpielerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 Spieler Spielerarray[]=new Spieler [9];
		 for (int i = 0; i<=8 ;i++ ){
			 Spielerarray [i]= new Spieler(Start.txt_player[i].getText(),001,0);
		}
		

	}

}
