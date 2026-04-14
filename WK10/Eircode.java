import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Eircode{

	public static void main(String args[]){

		GetEircode mySus = new GetEircode();
		Object[] options = {"Generate an Eircode","Check your Eircode"};
		int myLoop = 0;
		while(myLoop == 0){
			int myOption = JOptionPane.showOptionDialog(null,"Select one option","Option",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);

			if(myOption == 0){

				mySus.generateEircode();

			}else if(myOption == 1){

				mySus.getMyEircode();

			}else{

				myLoop++;
			}
		}
	}
}