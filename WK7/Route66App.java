/*
Route66App.java
*/
import javax.swing.JOptionPane;
public class Route66App{

	//main method
	public static void main(String args[]){

		//variables
		double myAverageKMPH;
		int myTeam;
		String myMes;

		//input
		myTeam = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the teammates count"));
		myAverageKMPH = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the average kilometre per hour"));

		//declare and create object
		Route66 myRace = new Route66();

		//process
		myRace.setAverage(myAverageKMPH);
		myRace.setTeam(myTeam);
		myRace.computeTime(myTeam,myAverageKMPH);
		myMes = myRace.getScore();

		//output
		System.out.println(myMes);

	}

}