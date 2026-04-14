import javax.swing.JOptionPane;
public class ChangeVowels{

	public static void main(String args[]){

		String myCard = JOptionPane.showInputDialog(null,"Enter your credit card eg. 1111 2222 3333 4444");
		int mySize = myCard.length();
		String myNumbers = "1234567890";
		char mySpace = ' ';
		int myStr = mySize - 2;

		if(myCard.charAt(4) == mySpace && myCard.charAt(9) == mySpace && myCard.charAt(14) == mySpace && mySize == 19){

			for(int x = 0; x < myStr; x++){

				if(x == 5 || x == 9 || x == 14){

					System.out.print(" ");

				}

				for(int i = 0; i < 10; i++){

					if(myCard.charAt(x) == myNumbers.charAt(i)){

						System.out.print("*");

					}
				}
			}
			System.out.print(myCard.charAt(mySize - 1));
			System.out.print(myCard.charAt(mySize - 2));
		}else{

			System.out.println("invalid card try again");

		}
	}

}