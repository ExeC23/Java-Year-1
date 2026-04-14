import javax.swing.JOptionPane;
public class ReverseName{

	public static void main(String args[]){

		String myName = JOptionPane.showInputDialog(null,"Enter your name");
		int mySize = myName.length();
		char myLetter;

		for(int i = mySize ; i > 0; i--){

			myLetter = myName.charAt(i - 1);
			System.out.print(myLetter);
		}

	}

}