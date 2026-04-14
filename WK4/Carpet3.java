import java.util.Scanner;
import javax.swing.JOptionPane;
public class Carpet3{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		int length,width,roomArea,cost,carpetCost,carpetCoste;

		length = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your room length"));
		width = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your room width"));
		roomArea = (int)(length * width);
		Object[] options = {"Cheat","Expensive"};
		carpetCoste = JOptionPane.showOptionDialog(null,"Click to calculate","Calculator",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		if (carpetCoste = 0){
			carpetCost = 6
		}else{
			carpetCost=2
		}
		cost = (int)(roomArea * carpetCost);

		System.out.println("length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Carpet cost: " + carpetCost + " Euro");
		System.out.println("Your room are: " + roomArea);
		System.out.println("Total cost is " + cost + " Euro");
	}
}