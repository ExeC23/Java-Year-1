import java.util.Scanner;

public class Greeting{

	public static void main(String args[]){

		String myName, mySurName, message;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is your name");
		myName = myScanner.next();
		System.out.println("What is your surname");
		mySurName = myScanner.next();
		message = greeting(myName,mySurName);
		System.out.println(message);

	}

	public static String greeting(String myName, String mySurName){

		String message = "hello " + myName + " " + mySurName;
		return message;

	}
}