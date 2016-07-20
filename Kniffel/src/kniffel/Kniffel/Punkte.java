package kniffel.Kniffel;

import javax.swing.JOptionPane;

public class Punkte extends KniffelSpiel implements Comparable<Punkte> {


private int punkte;
private String name;




public Punkte(int points,String name){
setPunkte(points);
setName(name);
	
}



public int getPunkte() {
	return punkte;
}



public void setPunkte(int punkte) {
	if(punkte<0||punkte>525){
		JOptionPane.showMessageDialog(null,"Punktzahl unmöglich!");
	}else{
		this.punkte = punkte;
	}
}
public String getName() {
	return name;
}



public void setName(String name) {
	if(name.isEmpty()){
		JOptionPane.showMessageDialog(null, "Name ungültig");
	}else{
		this.name = name;
	}
}



@Override
public int compareTo(Punkte temp) {
	// TODO Auto-generated method stub
	return this.punkte-temp.getPunkte();
}}
