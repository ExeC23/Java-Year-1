import javax.swing.JOptionPane;

public class Rectangle{

	public void getRectangle(){

		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"how many lines you want"));
		int i = 0;
		int y = x;
		while(x > 0){
			for(i = 0; i < y; i++){

				System.out.print("*");
			}
			x--;
			i = 0;
			System.out.println();
		}
	}
}