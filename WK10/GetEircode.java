import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import java.io.*;


public class GetEircode{

	public void generateEircode(){

		try{

			FileWriter fw = new FileWriter("GeneratedEircodes.txt",true);

			fw.close();


			ArrayList <Integer> myArray = new ArrayList<>();
			Random myLetter = new Random();
			String myLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
			String myOne = "D";
			int myTwo = (int)(Math.random()*3);
			int MyThree;
			if (myTwo == 0){

				MyThree = (int)(Math.random()*9 + 1);

			}else{
				if(myTwo > 1){

				MyThree = (int)(Math.random()*5);

				}else{

				MyThree = (int)(Math.random()*10);

				}

			}

			char myFour = ' ';

			int numorletter = (int)(Math.random()*2);

			String myFifth;

			if(numorletter == 0){

				int num = (int)(Math.random()*10);
				myFifth = String.valueOf(num);

			}else{

				int num = (int)(Math.random()*27);
				char myFifth2 = myLetters.charAt(num);
				myFifth = String.valueOf(myFifth2);

			}

			numorletter = (int)(Math.random()*2);
			String mySixth;
			if(numorletter == 0){

				int num = (int)(Math.random()*10);
				mySixth = String.valueOf(num);

			}else{

				int num = (int)(Math.random()*27);
				char mySixth2 = myLetters.charAt(num);
				mySixth = String.valueOf(mySixth2);

			}

			numorletter = (int)(Math.random()*2);
			String mySeven;
			if(numorletter == 0){

				int num = (int)(Math.random()*10);
				mySeven = String.valueOf(num);

			}else{

				int num = (int)(Math.random()*27);
				char mySeven2 = myLetters.charAt(num);
				mySeven = String.valueOf(mySeven2);
			}

			numorletter = (int)(Math.random()*2);
			String myEig;
			if(numorletter == 0){

				int num = (int)(Math.random()*10);
				myEig = String.valueOf(num);

			}else{

				int num = (int)(Math.random()*27);
				char myEig2 = myLetters.charAt(numorletter);
				myEig = String.valueOf(myEig2);

			}

			JOptionPane.showMessageDialog(null,"You new Eircode is  " + myOne + myTwo + MyThree + myFour + myFifth + mySixth + mySeven + myEig);

			String newEir = myOne + myTwo + MyThree + myFour + myFifth + mySixth + mySeven + myEig;
			boolean exists = false;
			File f = new File("GeneratedEircodes.txt");
			if(f.exists()){

				BufferedReader br = new BufferedReader(new FileReader("GeneratedEircodes.txt"));
				String line;
				while((line = br.readLine()) != null){

					if(line.equals(newEir)){

						exists = true;
						break;

					}

				}

				br.close();

			}

		}catch(IOException e){


		}

	}

	public void getMyEircode(){

		int myLoop = 0;
		while(myLoop == 0){
			String myEircode = JOptionPane.showInputDialog(null,"Enter the Eircode");
			int mySize = myEircode.length();

				if(!myEircode.isEmpty()){

					char myD = myEircode.charAt(0);
					if(myD == 'D' || myD == 'd'){

						if(mySize == 8){

							char mySpace = myEircode.charAt(3);
							if(mySpace == ' '){

								JOptionPane.showMessageDialog(null,"You have right Eircode " + myEircode.toUpperCase());

							}else{

								JOptionPane.showMessageDialog(null,"You dont have right Eircode try again");

							}

						}else{

							JOptionPane.showMessageDialog(null,"You dont have right Eircode try again");

						}

					}else{

						JOptionPane.showMessageDialog(null,"You dont have right Eircode try again");

					}

				}else{

					JOptionPane.showMessageDialog(null,"You dont have right Eircode try again");

				}

		}
	}

}