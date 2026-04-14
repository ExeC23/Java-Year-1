import java.util.Scanner;
import javax.swing.JOptionPane;
public class Circle{
	public static void main(String args[]){

		Scanner myScanner = new Scanner(System.in);
		double myRadius, myArea;
		System.out.println("what is the radius");
		myRadius = myScanner.nextDouble();
		myArea = myCircle(myRadius);
		System.out.println(myArea);

	}
	public static double myCircle(double myRadius){

		final double pi = 3.14;
		double myArea = pi * myRadius * myRadius;
		return myArea;

	}
}