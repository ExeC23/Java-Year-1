public class MyCalc{

	private double num1,num2,ans;

	public void Calculator(){

		num1 = 0;
		num2 = 0;
		ans = 0;
	}

	public void setNum1(double num1){

		this.num1 = num1;
	}

	public void setNum2(double num2){

			this.num2 = num2;
	}

	public void addCom(){

		ans = num1 +num2;
	}

	public double getAnswer(){

		return ans;
	}

}