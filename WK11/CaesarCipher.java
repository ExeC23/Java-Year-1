import javax.swing.JOptionPane;

public class CaesarCipher{

	public static void main(String args[]){


		StringBuffer myBuffer = new StringBuffer();

		String myWord = JOptionPane.showInputDialog(null,"Enter your word");
		int myNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your number"));
		int mySize = myWord.length();

		while(myNumber > 27){

			myNumber = myNumber - 26;

		}
		for(int i = 0; i < mySize; i++){

			char myLetter = myWord.charAt(i);
			char myShifted = (char)(myLetter + myNumber);
			myBuffer.append(myShifted);

		}

		String newWord = myBuffer.toString();
		System.out.println(newWord);

	}

}