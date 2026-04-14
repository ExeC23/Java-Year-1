import java.util.Scanner;
public class Square {
	public static void main(String args[]){
		Scanner myAns = new Scanner(System.in);
		System.out.println("Type your square side length");
		int mySquare = myAns.nextInt();
		int myAnswer = (int)(Math.pow(mySquare, 2));
		System.out.println(myAnswer);
	}
}