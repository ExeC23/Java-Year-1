/*
Route66.java
*/
public class Route66{

	//data members
	private int myTeam;
	private double myAverageKMPH,myTotal,myLeft,myOnePerson,myLoop,myKilom;
	private String myScore;

	//set methods
	public void setAverage(double myAverageKMPH){

		this.myAverageKMPH = myAverageKMPH;
	}

	public void setTeam(int myTeam){

		this.myTeam = myTeam;
	}

	//Compute
	public void computeTime(int myTeam,double myAverageKMPH){

		myOnePerson = myAverageKMPH * 15;
		myTotal = myOnePerson * myTeam;
		myLoop = 3945 / myTotal;
		myKilom = myOnePerson * myLoop;
		myLeft = 3945 % myOnePerson;
		myScore = "One person in your team con go " + myOnePerson + " km in 15 hours. That makes " + myTotal + " km with your " + myTeam + " teammates. Your team must do " + myLoop + " times change.Each person has to go " + myKilom + " Kilometre." + "in the end, there will be " + myLeft + " km left. One person has to do it.";
	}

	//get mothods
	public String getScore(){

		return myScore;

	}
}