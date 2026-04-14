import javax.swing.JOptionPane;
public class Bonus{
	public static void main(String args[]){

		int myBonus,myItemSold,myItemValue,myItemTotalValue,myBonusM;

		myBonus = 0;
		myItemValue = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Item's value"));
		myItemSold = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how many you have sold"));
		myItemTotalValue = (int)(myItemValue*myItemSold);
		if (myItemSold >= 3){
			if(myItemTotalValue <= 1000){
				myBonusM = myItemTotalValue / 1000;
				myBonus = (int)(25*myBonusM);
			}else if (myItemTotalValue > 1000){
				myBonusM = myItemTotalValue / 1000;
				myBonus = (int)(50*myBonusM);
			}else{
				myBonus = 10;
			}

		}

		System.out.println(myBonus);
	}
}