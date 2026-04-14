import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator2{

	public static void main(String args[]){

		int myAns = 0;
		Object[] options = {"Addition","Subtraction","Multiply","Divide"};
		int myNum1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter The First Number"));
		int myNum2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter The Second Number"));
		int myOp = JOptionPane.showOptionDialog(null,"Click to calculate","Calculator",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		if (myOp == 0){
			myAns = add(myNum1,myNum2);
		}
		else if (myOp == 1){
			myAns = subtract(myNum1,myNum2);
		}
		else if (myOp == 2){
			myAns = multi(myNum1,myNum2);
		}
		else {
			myAns = divide(myNum1,myNum2);
		}
		System.out.println(myAns);
	}
	public static int add(int myNum1, int myNum2){

		int myAns = (int)(myNum1 + myNum2);
		return myAns;

	}
	public static int subtract(int myNum1, int myNum2){

			int myAns = (int)(myNum1 - myNum2);
			return myAns;

	}
	public static int multi(int myNum1, int myNum2){

			int myAns = (int)(myNum1 * myNum2);
			return myAns;

	}
	public static int divide(int myNum1, int myNum2){

			int myAns = (int)(myNum1 / myNum2);
			return myAns;

	}
}