import java.util.Scanner;
import javax.swing.JOptionPane;
public class Carpet{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		int length,width,roomArea,cost,carpetCost;
		length = 13;
		width = 7;
		roomArea = (int)(length * width);
		carpetCost = 2;
		cost = (int)(roomArea * carpetCost);
		System.out.println("length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Carpet cost: " + carpetCost + " Euro");
		System.out.println("Your room are: " + roomArea);
		System.out.println("Total cost is " + cost + " Euro");
	}
}