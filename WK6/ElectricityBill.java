public class ElectricityBill{

	private double myEnergy, myCharge,myCost;
	private String myTier;


	public void getEnergy(double myEnergy){

		this.myEnergy = myEnergy;
	}

	public void computeCharge(){
			if(myEnergy < 1500){

				myCharge = 5;
				myTier = "Tier one";
			}else if(myEnergy > 1500 && myEnergy < 2500){

				myCharge = 5.5;
				myTier = "Tier two";
			}else{

				myCharge = 5.75;
				myTier = "Tier three";
			}


	}

	public void computeBill(){

		myCost = myCharge * myEnergy;
	}

	public double getCost(){

		return myCost;

	}

	public String getTier(){

		return myTier;
	}
}
