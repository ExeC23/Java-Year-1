import java.util.Scanner;
public class ChangeMoney{
	public static void main(String args[]){
		Scanner myChange = new Scanner(System.in);
		System.out.println("How much money you have given");
		float givenMoney = myChange.nextFloat();
		System.out.println("How much does it cost");
		float itemCost = myChange.nextFloat();
		float myChangeMoney = (float)(givenMoney - itemCost);
		float leftOver5 = (float)(myChangeMoney % 5);
		int s5 = (int)(myChangeMoney / 5);
		float s1LeftOver = (float)(leftOver5 % 1);
		int s1 = (int)(leftOver5 / 1);
		int s50Cent = (int)(s1LeftOver / 0.5);
		float s50CentLeftOver = (float)(s1LeftOver % 0.5);
		int s25Cent = (int)(s50CentLeftOver / 0.25);
		float s25CentLeftOver = (float)(s50CentLeftOver % 0.25);
		int s10Cent = (int)(s25CentLeftOver / 0.10);
		float s10CentLeftOver = (float)(s25CentLeftOver % 0.10);
		int s5Cent = (int)(s10CentLeftOver / 0.5);
		float s5CentLeftOver = (float)(s10CentLeftOver % 0.5);
		int s1Cent = (int)(s5CentLeftOver / 0.1);
		float s1CentLeftOver = (float)(s5CentLeftOver % 0.1);

		System.out.println("You get");
		System.out.println(s5 + " pieces of 5 euro");
		System.out.println(s1 + " pieces of 1 euro");
		System.out.println(s50Cent + " pieces of 50 cent");
		System.out.println(s25Cent + " pieces of 25 cent");
		System.out.println(s10Cent + " pieces of 10 cent");
		System.out.println(s5Cent + " pieces of 5 cent");
		System.out.println(s1Cent + " pieces of 1 cent");

		//System.out.println("You get " + myChangeMoney + " change");
	}
}