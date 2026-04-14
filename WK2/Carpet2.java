import java.util.Scanner;
import javax.swing.JOptionPane;
public class Carpet2{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		int length,width,roomArea,cost,carpetCost;

		length = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your room length"));
		width = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your room width"));
		roomArea = (int)(length * width);
		Object[] options = {"Cheat","Expensive"};
		carpetCost = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the carpet cost"));
		cost = (int)(roomArea * carpetCost);

		System.out.println("length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Carpet cost: " + carpetCost + " Euro");
		System.out.println("Your room are: " + roomArea);
		System.out.println("Total cost is " + cost + " Euro");
	}
}