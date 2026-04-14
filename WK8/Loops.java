import javax.swing.JOptionPane;
public class Loops{

	public static void main(String args[]){

		int myHeight = Integer.parseInt(JOptionPane.showInputDialog(null,"how many lines you want"));
		int myHalf = myHeight / 2;
		int myStarCount = 1;
		int myHalfUpper = myHalf;
		int myHalfLower = myHalf;
		int mySpace;




		for(int i = 0 ; i <= myHalf; i++){

			for(mySpace = 0; mySpace <= myHalfUpper ; mySpace++){

				System.out.print(" ");

			}
			myHalfUpper--;
			for(int myStar = 0; myStar < myStarCount ; myStar++){

				System.out.print("*");
			}
			System.out.println();
			myStarCount = myStarCount + 2;
		}

		for(int i = 0; i == myStarCount;i++){

			System.out.print("*");
		}

		myStarCount = myStarCount - 5;

		for(int x = myStarCount; x >= 0; x--){

			for(mySpace = mySpace2 ; mySpace <= myHalf;)



			for(int myLow = myHalfLower; x >= 0; x--){

				System.out.print("*");

			}

			System.out.println();

		}


	}
}


