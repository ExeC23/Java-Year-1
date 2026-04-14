import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);
		int num1,num2,myWork,myLoop;
		myLoop = 0;
		num1= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the  first number"));
		num2= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the  second number"));
		Object[] options = {"Addition","Subtraction","Multiply","Divide"};
		while(myLoop != 1){
			//option 1
			myWork = JOptionPane.showOptionDialog(null,"Click to calculate","Calculator",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
			//option 2
			//myWork = Integer.parseInt(JOptionPane.showInputDialog(null,"0 for addition, 1 for subtraction, 2 for multiply. 3 for divide"));
			if(myWork == 0){
				System.out.println(num1+num2);
				myLoop = 1;
			}else if(myWork == 1){
				System.out.println(num1-num2);
				myLoop = 1;
			}else if(myWork == 2){
				System.out.println(num1*num2);
				myLoop = 1;
			}else if(myWork == 3){
				System.out.println(num1/num2);
				myLoop = 1;
			}else{
				System.out.println("Invalid number try again!");
			}
		}
	}
}