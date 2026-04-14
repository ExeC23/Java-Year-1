import javax.swing.JOptionPane;
public class Triangle{

	public void getTriangle(){


		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"how many lines you want"));
		int i = 0;
		int y = 0;
		int bMain = x;
		int b = x;
		/*while(x > 0){
			for(i = 0; i <= y; i++){

				System.out.print("*");
			}
			x--;
			y++;
			i = 0;
			System.out.println();
		}*/


		while(x > 0){
			while(b > 0){

				System.out.print(" ");
				b--;
			}
			bMain = bMain - 1;
			for(i = 0; i <= y; i++){

				System.out.print("*");
			}
			x--;
			y = y + 2;
			i = 0;
			System.out.println();
			b = bMain;
		}


	}

}