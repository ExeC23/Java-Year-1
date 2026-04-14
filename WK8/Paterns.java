import javax.swing.JOptionPane;
public class Paterns{

	public static void main(String args[]){

		Rectangle myRec = new Rectangle();
		Triangle myTri = new Triangle();
		Diamond myDia = new Diamond();

		int operat,myLoop;
		myLoop = 1;

		Object[] options = {"Rectangle","Triangle","Diamond"};

		while(myLoop == 1){
			operat = JOptionPane.showOptionDialog(null,"Select one of patern","Operator",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);


			if(operat == 0){

				myRec.getRectangle();

			}else if(operat == 1){

				myTri.getTriangle();

			}else if(operat == 2){

				myDia.getDiamond();

			}else{

				myLoop--;

			}
		}
	}
}