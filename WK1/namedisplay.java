import java.util.Scanner;
public class namedisplay {
	public static void main(String args[]){
		Scanner myAns = new Scanner(System.in);
		System.out.println("Type your name");
		String myName = myAns.nextLine();
		System.out.println("Type your age");
		int myAge = myAns.nextInt();
		System.out.println("Name: " + myName);
		System.out.println("Age: " + myAge);
	}
}