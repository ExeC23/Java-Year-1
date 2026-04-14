import java.util.Scanner;
import javax.swing.JOptionPane;
public class math2{
	public static void main(String args[]){
		int myNum,myNumSqu,myNumCube,myNumMax;
		myNum = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		myNumSqu = (int)(Math.pow(myNum,2));
		myNumCube = (int)(Math.pow(myNum,3));
		myNumMax = (int)(Math.max(myNumSqu,myNumCube));
		System.out.println("Your Number's square is "+myNumSqu);
		System.out.println("Your Number's Cube is "+myNumCube);
		System.out.println("Your biggest Number is  "+myNumMax);
	}
}