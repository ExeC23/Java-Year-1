import java.util.Scanner;
public class Room {
	public static void main(String args[]){
		Scanner myAns = new Scanner(System.in);
		System.out.println("Type your room length");
		int myLenght = myAns.nextInt();
		System.out.println("Type your room width");
		int myWidth = myAns.nextInt();
		int myArea = (int)(myWidth * myLenght);
		int myPerimeter = (int)(2*(myWidth + myLenght));
		System.out.println("Room area = " + myArea);
		System.out.println("Room perimeter = " + myPerimeter);
	}
}