import java.util.Scanner;
public class Circle {
	public static void main(String args[]){

		Scanner myScanner = new Scanner (System.in);

		boolean myLoop = true;

		while (myLoop == true){
			System.out.println("What is the diameter");
			double myDia = myScanner.nextDouble();

			double myRadious = (double)(myDia / 2);
			double myAnswer = (double)(Math.pow(myRadious, 2) * 3.14159265359);

			System.out.println("your area is " + myAnswer);

			System.out.println("Do you want to continue true or false");
			if (myScanner.hasNextBoolean()){
				myLoop = myScanner.nextBoolean();
			}else{
				System.out.println("Try again");
			}
		}
	}
}