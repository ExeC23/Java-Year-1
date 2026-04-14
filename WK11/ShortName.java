import javax.swing.JOptionPane;

	public class ShortName{
		public static void main(String args[]){

			StringBuffer myBuffer = new StringBuffer();
			char newWord;
			char myLetter;
			String myWord = JOptionPane.showInputDialog(null,"Enter your word");

			int size = myWord.length();
			int x = 0;

			System.out.print(Character.toUpperCase(myWord.charAt(0)));

				while(x < size){

					if(myWord.charAt(x) == ' '){

						System.out.print(Character.toUpperCase(myWord.charAt(x + 1)));

					}

					x++;

				}

		}

	}