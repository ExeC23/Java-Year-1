import javax.swing.JOptionPane;

public class Temperature{

	public static void main(String args[]){

		Object[] options = {"Fahrenheit","Celsius"};

		int myTemOp,myTem;
		double myAns;

		myTemOp = JOptionPane.showOptionDialog(null,"Which temperature operator do you have","Temperature",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		myTem = Integer.parseInt(JOptionPane.showInputDialog(null,"what is your degree"));
		myAns = 0;
		if(myTemOp == 0){
			myAns = fahre(myTemOp,myTem);
		}else{
			myAns = celci(myTemOp,myTem);
		}
		System.out.println(myAns);

	}
	public static double fahre(int myTemOp,int myTem){
		double myAns = (double)((myTem - 32)* 0.55555555555555555);
		return myAns;
	}
	public static double celci(int myTemOp,int myTem){
		double myAns = (double)((myTem * 1.8)+ 32);
		return myAns;
	}

}