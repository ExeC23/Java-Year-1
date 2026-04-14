import javax.swing.*;
public class Array{

	public static void main(String args[]){

		int arr[];
		arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for(int i = 0; i < 5; i++ ){
		System.out.println(arr[i]);
		}

		String words[] = {"aaaa","bbbb","cccc","ddddd","eeeee"};

		for(int x = words.length - 1; x >= 0 ; x--){

			System.out.println(words[x]);

		}

		String kkkk[];

		int size = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter how long is your list"));

		kkkk = new String[size];


		for(int i = 0 ; i < size; i++){

			kkkk[i] = JOptionPane.showInputDialog(null,"Enter your word");

		}
		for(int x = 0; x < kkkk.length ; x++){

				System.out.println(kkkk[x]);

		}


	}
}