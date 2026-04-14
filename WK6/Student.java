public class Student{

	private String studentNames;
	private int id;
	private double yr1, yr2, avg;

	public void setYR1(double yr1){

		this.yr1 = yr1;
	}

	public void setYR2(double yr2){

			this.yr2 = yr2;
	}

	public double getAVG(){

			return avg;
	}
	public void computeAVG(){

			avg = (yr1 + yr2) / 2;
	}


}