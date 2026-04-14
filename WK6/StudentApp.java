import java.util.Scanner;
public class StudentApp{

	public static void main(String args[]){

		Scanner myScanner = new Scanner(System.in);
		Student myStudent = new Student();

		String studentNames;
		int id;
		double yr1, yr2, avg;

		System.out.println("enter yr1");
		yr1 = myScanner.nextDouble();
		myStudent.setYR1(yr1);

		System.out.println("enter yr2");
		yr2 = myScanner.nextDouble();
		myStudent.setYR2(yr2);

		myStudent.computeAVG();
		avg = myStudent.getAVG();

		System.out.println(avg);

	}

}