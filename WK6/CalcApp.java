import java.util.Scanner;

public class CalcApp{

	public static void main(String args[]){

	MyCalc myCalcu = new MyCalc();
	Scanner myScanner = new Scanner(System.in);

	double num1,num2,ans;
	int menuOption;

	System.out.println("Enter the first number");
	num1 = myScanner.nextDouble();
	System.out.println("Enter the second number");
	num2 = myScanner.nextDouble();

	myCalcu.setNum1(num1);
	myCalcu.setNum2(num2);
	myCalcu.addCom();
	ans = myCalcu.getAnswer();

	System.out.println(ans);

	}

}