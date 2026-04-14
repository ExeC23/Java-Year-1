import javax.swing.JOptionPane;

public class Replace{

		public void ReplaceLetter(){

				StringBuffer myBuffer = new StringBuffer();

				String myName = JOptionPane.showInputDialog(null,"Enter Your name");

				myBuffer.append(myName);

				int size = myName.length();

				for(int i = 0; i < size; i++){

						if(myBuffer.charAt(i) == 'a' || myBuffer.charAt(i) == 'A' ){

								myBuffer.replace(i,i+1,"*");


							}

					}

				System.out.println(myBuffer);

			}
	}