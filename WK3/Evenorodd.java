import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Evenorodd{
	public static void main(String args[]){

		ArrayList <Integer>myArry = new ArrayList<>();

		int myLoop,myNumber,myDigit,myPlace;
		myLoop = 0;
		while(myLoop != 1){
			myPlace = 1;
			myNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));

			if(myNumber % 2 == 0){
				System.out.println("Odd Number");
				while(myNumber / myPlace >= 10){

					myPlace *= 10;
				}
				while(myPlace > 0){

					myDigit = myNumber / myPlace;
					myArry.add(myDigit);
					System.out.print(myDigit + " ");
					myNumber = myNumber % myPlace;
					myPlace = myPlace / 10;
				}
			}else{
				System.out.println("Even Number");
				while(myNumber / myPlace >= 10){

					myPlace *= 10;
				}
				while(myPlace > 0){

					myDigit = myNumber / myPlace;
					System.out.print(myDigit + " ");
					myNumber = myNumber % myPlace;
					myPlace = myPlace / 10;
				}
			}
			System.out.println(myArry);
			myLoop = JOptionPane.showConfirmDialog(null, "Do you want to continue");
		}
	}
}