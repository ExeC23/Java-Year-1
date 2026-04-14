import java.util.Scanner;
import javax.swing.JOptionPane;
public class Circle3 {
	public static void main(String args[]){

		Scanner myScanner = new Scanner (System.in);

		int myLoop;
		myLoop = 0;

		while (myLoop == 0){
			int myDia;
			myDia = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the diameter"));

			double myRadious = (double)(myDia / 2);
			double myAnswer = (double)(Math.pow(myRadious, 2) * 3.14159265359);

			JOptionPane.showMessageDialog(null, "Your circle area is " + myAnswer);

			myLoop = JOptionPane.showConfirmDialog(null, "Do you want to continue");
		}
	}
}