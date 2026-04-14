import javax.swing.JOptionPane;
public class Gemstone{

	public static void main(String args[]){

		int myMonth;

		myMonth = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your birth month between 1-12"));

		switch(myMonth){

		case 1:
			System.out.println("Garnet");
		break;

		case 2:
			System.out.println("Amethyst");
		break;

		case 3:
			System.out.println("Aquamarine");
		break;

		case 4:
			System.out.println("Diamond");
		break;

		case 5:
			System.out.println("Emerald");
		break;

		case 6:
			System.out.println("Pearl");
		break;

		case 7:
			System.out.println("Ruby");
		break;

		case 8:
			System.out.println("Peridot");
		break;

		case 9:
			System.out.println("Sapphire");
		break;

		case 10:
			System.out.println("Opal");
		break;

		case 11:
			System.out.println("Topaz");
		break;

		case 12:
			System.out.println("Turquoise");
		break;

		default:
			System.out.println("Invalid number");
		}


	}

}