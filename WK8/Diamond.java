import javax.swing.JOptionPane;
public class Diamond{

	public void getDiamond(){


		int y = Integer.parseInt(JOptionPane.showInputDialog(null,"how many lines you want"));
				int ss = y * 2;
				int sss = (y * 2) - 2;
				int baseY = y;
				int x = y;
				int l = 0;
				int lowerY = y;
				int myY = 1;
				int mainL = y;

				while(y > 0){
					while(x > 0){

						System.out.print(" ");
						x--;
					}
					baseY--;

					for(int i = 0; i <= l; i++){

						System.out.print("*");
					}
					mainL = mainL + 2;
					l = l + 2;
					x = baseY;
					System.out.println();
					y--;
				}
				for(int ll = 0; ll <= ss; ll++){

					System.out.print("*");
				}
				System.out.println();
				int lowerX = 0;
				while (lowerY > 0){

					while(lowerX < myY){

						System.out.print(" ");
						lowerX++;
					}
					for(int i = 0; i <= sss; i++){

						System.out.print("*");
					}
					if(myY <= mainL){
						myY++;
					}
					lowerX = 0;
					sss = sss - 2;
					System.out.println();
					x = baseY;
					lowerY--;

		}



	}
}




