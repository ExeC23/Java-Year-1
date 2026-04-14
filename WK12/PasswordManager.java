import javax.swing.JOptionPane;
public class PasswordManager{

	public static void main(String args[]){


		MyPassword myP = new MyPassword();
		int myLoop = 0;
		int myLoop2 = 0;

		while(myLoop == 0){

			String myName = JOptionPane.showInputDialog(null,"Enter your full name");
			String[] nameParts = myName.split(" ");


			if(myName.length() > 3 && nameParts.length >= 2 && myName.contains(" ")){

				myLoop++;

				while(myLoop2 == 0){

					int myID = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your ID"));

					if(String.valueOf(myID).length() == 6){

						String name = nameParts[0];
						String surname = nameParts[1];
						myP.getName(name);
						myP.getSurname(surname);
						myP.getID(myID);
						myP.setPasswordPart1();
						myP.setPasswordPart2();
						myP.generatePassword();
						myLoop2++;

					}else{

						JOptionPane.showMessageDialog(null,"Invalid ID");

					}
				}
			}else{

				JOptionPane.showMessageDialog(null,"Invalid Name");

			}

		}
	}

}