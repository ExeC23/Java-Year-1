import java.util.Scanner;
import javax.swing.JOptionPane;
public class math1{
	public static void main(String args[]){
		int myRandomNum;
		myRandomNum = (int)(Math.random() * 101);
		JOptionPane.showMessageDialog(null,myRandomNum);
	}
}