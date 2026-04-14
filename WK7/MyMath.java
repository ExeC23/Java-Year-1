/*
	Math.java
	@author
	05/03/2026
*/
import javax.swing.JOptionPane;
public class MyMath{

	public static void main(String args[]){

		//variables
			double a,b,myAVR,choice,result,myPWR;
			Object[] options = {"Calculate Average","Calculate Power"};


		//input
		choice = JOptionPane.showOptionDialog(null,"Choose an operator","operator",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);

		//process
		if (choice == 0){

			a = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter First Number"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Second Number"));
			result = calculateAVR(a,b);
			System.out.println(result);
		}else if(choice == 1){

			a = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter First Number"));
			b = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Power"));
			result = calculatePWR(a,b);

		}else{
			System.out.println("LogOff");
		}

		//output
	}

	public static Double calculateAVR(double a,double b){

		double myAVR = (double)((a+b)/2);
		return myAVR;
	}

	public static Double calculatePWR(double a,double b){

		double myPWR = Math.pow(a,b);
		return myPWR;
	}
}