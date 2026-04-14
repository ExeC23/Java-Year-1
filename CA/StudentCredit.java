//Import part
import javax.swing.JOptionPane;

public class StudentCredit{
	/*
	*StudentCredit.java
	*Alpsan Karademir
	*09/03/2026
	*/

	//main method
	public static void main(String args[]){

		//variable
		double myCredit,myLoop,myCA,myExam,myProject,myTotal,myCA2,myProject2,myExam2;
		myLoop = 0;

		//Loop
		while(myLoop == 0){

	  		myCredit = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter"+" 1 - 5 Credit module"+" 2 - 10 Credit module"+" 3 = Exit"));

			//5 Credit method
			if (myCredit == 1){

				//variable declaration inside of the if because of the loop
				myCA = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your CA result"));
				myExam = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your Exam result"));

				//Calculation
				myCA2 = (myCA*30)/100;
				myExam2 = (myExam*70)/100;
				myTotal = myCA2 + myExam2;

				//message
				JOptionPane.showMessageDialog(null,"CA: "+myCA+", Exam: "+myExam+" Overall grade for this 5 credit module is "+myTotal);

			//10 Credit mothod
			}else if(myCredit == 2){

				//variable declaration inside of the if because of the loop
				myCA = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your CA result"));
				myProject = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your Project result"));
				myExam = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your Exam result"));

				//Calculation
				myCA2 = (myCA*30)/100;
				myExam2 = (myExam*30)/100;
				myProject2 = (myCA*30)/100;
				myTotal = myCA2 + myExam2 + myProject2;

				//message
				JOptionPane.showMessageDialog(null,"CA: "+myCA+" ,Project: "+myProject+", Exam: "+myExam+" Overall grade for this 5 credit module is "+myTotal);

			//Exit method
			}else if(myCredit == 3){

				JOptionPane.showMessageDialog(null,"Have a good day");
				myLoop = 1;

			//Invalid number method
			}else{

				JOptionPane.showMessageDialog(null,"Invalid number");

			}
		}
	}
}