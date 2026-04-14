import java.util.Scanner;
public class Salary {
	public static void main(String args[]){

		Scanner myScan = new Scanner(System.in);

		System.out.println("What is your hourly rate");
		float myHourlyRate = myScan.nextFloat();

		System.out.println("How much do you work in a day");
		int myWorkTime = myScan.nextInt();

		float myDailyRate = (float)(myHourlyRate * myWorkTime);
		float myWeeklyRate = (float)(myDailyRate * 5);
		float myMonthlyRate = (float)(myWeeklyRate * 4);

		System.out.println("Daily: " + myDailyRate);
		System.out.println("Weekly: " + myWeeklyRate);
		System.out.println("Monthly: " + myMonthlyRate);
	}
}