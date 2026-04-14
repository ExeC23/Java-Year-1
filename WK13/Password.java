import javax.swing.*;

public class Password{

	public static void main(String args[]){

		String number = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM,.";
		int myNumSize = number.length();
		String myPassword = JOptionPane.showInputDialog(null,"Enter your password");
		int mySize = myPassword.length();

		StringBuffer sb = new StringBuffer();

		for(int i = 0 ; i < mySize ; i++){

			for(int x = 0; x < myNumSize; x++){

				if(number.charAt(x) == myPassword.charAt(i)){

					sb.append(number.charAt(x));
					System.out.println();
					System.out.println("----------------");
					System.out.println("Number has found" + " : " + number.charAt(x));
					System.out.println("----------------");

				}else{

					System.out.print(number.charAt(x)+" ");

				}

			}

		}

		System.out.println();
		System.out.println("----------------");
		System.out.println("Password is : " + sb);

	}

}