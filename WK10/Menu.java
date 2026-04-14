import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;

public class Menu{

	public static void main(String args[]){


		Object[] options = {"Number of vowel and consonants","Number of words","Same letter","First and last letter","Every second word","Middle character","Number of letter"};
		int myLoop = 0;

		while(myLoop != 1){
			int myOption = JOptionPane.showOptionDialog(null,"Select one option","Option",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
			int myVowel,myCons,count;


			if (myOption == 0){
				String myWord = JOptionPane.showInputDialog(null,"Enter the sentence");
				int mySize = myWord.length();
				myVowel = 0;
				for(char c: myWord.toLowerCase().toCharArray()){

					if(c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){

						myVowel++;

					}
				}
				myCons = mySize - myVowel;
				System.out.println("Total vowel count is "+myVowel);
				System.out.println("Total consonants count is "+myCons);

			}else if(myOption == 1){

				String myWord = JOptionPane.showInputDialog(null,"Enter the sentence");
				int mySize = myWord.length();

				count = myWord.split("\\s").length;
				System.out.println("Total word count is "+count);

			}else if(myOption == 2){

				String s1 = JOptionPane.showInputDialog(null,"Enter the first string : ");
				String s2 = JOptionPane.showInputDialog(null,"Enter the second string : ");

				s1 = s1.replaceAll("\\s" , "").toLowerCase();
				s2 = s2.replaceAll("\\s" , "").toLowerCase();

				if (s1.length() != s2.length()){
					System.out.println("Not Anagrams");
				}else{
					char[] arr1 = s1.toCharArray();
					char[] arr2 = s2.toCharArray();

					Arrays.sort(arr1);
					Arrays.sort(arr2);

					if (Arrays.equals(arr1,arr2)){
						System.out.println("They are anagrams");
					}else{
						System.out.println("They are not anagrams");
					}
				}
			}else if(myOption == 3){

				String myWord = JOptionPane.showInputDialog(null,"Enter the sentence");
				int mySize = myWord.length();

				System.out.println("The first letter is " + myWord.charAt(0));
				System.out.println("The last letter is " + myWord.charAt(mySize - 1));


			}else if(myOption == 4){

				String myWord = JOptionPane.showInputDialog(null,"Enter the sentence");
				int mySize = myWord.length();

				String[] myWord2 = myWord.split(" ");
				System.out.println("Total word count is "+ myWord2[1]);


			}else if(myOption == 5){

				String myWord = JOptionPane.showInputDialog(null,"Enter the sentence");
				count = myWord.split("\\s").length;
				String[] myWord2 = myWord.split(" ");
				System.out.println("Total word count is "+ myWord2[count/2]);


			}else if(myOption == 6){

				int mySecondLoop = 0;
				ArrayList<Character> myArray = new ArrayList<Character>();
				while(mySecondLoop == 0){
					String myWord = JOptionPane.showInputDialog(null,"Enter a word");
					myWord = myWord.replace(" ","");
					int mySize = myWord.length();
					count = myWord.split("\\s").length;
					if(count == 1){
						mySecondLoop++;
						for(int i = 0 ; i < mySize ; i++){

							if(!myArray.contains(myWord.charAt(i))){
								myArray.add(myWord.charAt(i));
							}
						}
						System.out.println("My letters are " + myArray);
						System.out.println("Total letter count is " + myArray.size());
						}else{

						}
					}


			}else{

				myLoop++;
			}
		}




	}
}