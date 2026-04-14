import java.util.Scanner;
import javax.swing.JOptionPane;
public class math3{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		float myNum = myScanner.nextFloat();
		//int myNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a decimal number"));
		int myNumUp = (int)(Math.ceil(myNum));
		int myNumDown = (int)(Math.floor(myNum));
		System.out.println("Your decimal up is "+myNumUp);
		System.out.println("Your decimal down is "+myNumDown);
	}
}