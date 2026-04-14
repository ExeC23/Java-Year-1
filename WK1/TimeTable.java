import java.util.Scanner;
public class TimeTable {
	public static void main(String args[]){
		Scanner myAns = new Scanner(System.in);
		System.out.println("The Number");
		int myNumber = myAns.nextInt();
		for (int theNumber = 0; theNumber5 <13; theNumber++) {
			int myTimeTable = (int)(myNumber * theNumber);
			System.out.println(myTimeTable);
		}
	}
}