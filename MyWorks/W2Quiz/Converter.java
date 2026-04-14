import java.util.Scanner;
import javax.swing.JOptionPane;
public class Converter{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		int totalSeconds,hours,minutes,seconds,hoursLeft,myLoop;
		myLoop = 0;
		while (myLoop == 0){
			totalSeconds = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Seconds to convert"));

			hours = (int)(totalSeconds / 3600);
			hoursLeft = (int)(totalSeconds % 3600);
			minutes = (int)(hoursLeft / 60);
			seconds = (int)(hoursLeft % 60);

			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println("Seconds: " + seconds);
			System.out.println("-------------------");
			myLoop = JOptionPane.showConfirmDialog(null, "Do you want to continue");
		}
	}
}