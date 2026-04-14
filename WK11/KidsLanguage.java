import javax.swing.JOptionPane;

public class KidsLanguage{

	public static void main(String args[]){

		StringBuffer mySWord = new StringBuffer();

		String myWord = JOptionPane.showInputDialog(null,"Enter your word to convert kid language");
		String newWord;
		int mySize = myWord.length();


		for(int i = 1; i < mySize; i++){

			mySWord.append(myWord.charAt(i));

		}
		mySWord.append(myWord.charAt(0));
		mySWord.append("ay");


		newWord = mySWord.toString();
		System.out.println(newWord);
	}
}