import java.util.Scanner;
import javax.swing.JOptionPane;
public class GUIDemo{
	public static void main(String args[]){

		Scanner myScanner = new Scanner(System.in);

		String word;
		word = JOptionPane.showInputDialog(null, "Enter a word");

		JOptionPane.showMessageDialog(null, "Your word was " + word);
	}
}