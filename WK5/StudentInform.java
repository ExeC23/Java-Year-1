import javax.swing.JOptionPane;

public class StudentInform{

	public static void main(String args[]){


		Object[] options = {"Java","DataBase"};
		int mySupportClass,myClasses,mySupportTime,result;
		mySupportClass = JOptionPane.showOptionDialog(null,"Which Support class you would like to take","Support Classes",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		mySupportTime = Integer.parseInt(JOptionPane.showInputDialog(null,"How long you would like to take"));
		result = 3;
		if (mySupportClass == 0) {
		    javaC(mySupportTime);
		} else {
		    dataB(mySupportTime);
		}
	}

	public static void javaC(int mySupportTime) {

	    if (mySupportTime <= 30) {
			System.out.println("on monday there is a java class up to 30 min");
	    } else if(mySupportTime > 30 && mySupportTime <= 60) {
			System.out.println("on tuesday there is a java class up to 60 min");
	    } else {
			System.out.println("Invalid Time");
	    }

	}
	public static void dataB(int mySupportTime) {

		if (mySupportTime <= 30) {
			System.out.println("on thursday there is a java class up to 60 min");
		} else if(mySupportTime > 30 && mySupportTime <= 60) {
			System.out.println("on wednesday there is a java class up to 60 min");
		} else {
			System.out.println("Invalid Time");
		}
	}
}