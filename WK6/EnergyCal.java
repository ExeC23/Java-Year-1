import javax.swing.JOptionPane;
public class EnergyCal{

	public static void main(String args[]){

		ElectricityBill myBill = new ElectricityBill();

		double myEnergy, myCharge,myCost;
		String myTier = "Tier Zero";

		myEnergy = Integer.parseInt(JOptionPane.showInputDialog(null,"How much energy unit have you used."));

		myBill.getEnergy(myEnergy);
		myBill.computeCharge();
		myBill.computeBill();
		myCost = myBill.getCost();
		myTier = myBill.getTier();

		System.out.println("Total cost is " + myCost + " Euro" + " " + myTier);

	}


}