/*
 * StringExamples.java
 * @author JPower
 */

 public  class StringExamples{
 	public static void main(String args[]){
		String name = "Julie";

		//printing out length of String
		int size = name.length();
		System.out.println("The size is " + size);

		//printing out first letter
		System.out.println("First letter is " + name.charAt(0));

		//printing out last letter
		System.out.println("Last letter is " + name.charAt(size-1));

		//printing out all letters
		for (int i = 0; i < size; i++){ //position of first letter is 0 and last letter is length-1
			System.out.println(name.charAt(i));
		}

		//checking of two Strings are equal
		String word1 = "java";
		String word2 = "java";
		if (word1.equals(word2)){
			System.out.println("The words are the same");
		} else {
			System.out.println("The words are not the same");
		}

		//checking if case sensitive
		word1 = "java";
		word2 = "JAVA";
		if (word1.equals(word2)){
			System.out.println("The words are the same");
		} else {
			System.out.println("The words are not the same");
		}

		//using case sensitive method
		word1 = "java";
		word2 = "JAVA";
		if (word1.equalsIgnoreCase(word2)){
			System.out.println("The words are the same");
		} else {
			System.out.println("The words are not the same");
		}

		//converting to upper case letters
		String bigName = name.toUpperCase();
		System.out.println("Name in upper case "+ bigName);

		//converting to lower case letters
		String smallName = name.toLowerCase();
		System.out.println("Name in upper case "+ smallName);

		//calculating number of words and numbers of letters in a sentence
		String sentence = "This is a long sentence";
		size = sentence.length(); // size is already declared above
		int numSpaces = 0;
		int numLetters = 0;
		int numWords = 0;

		//iterating through char by char so check if its a space
		for (int i = 0; i < size; i++){
			if (sentence.charAt(i)==' '){
				numSpaces++;
			} else {
				numLetters++;
			}
		}

		numWords = numSpaces + 1;

		System.out.println("Length of sentence is " + size);
		System.out.println("Number of spaces is " + numSpaces);
		System.out.println("Number of words is " + numWords);
		System.out.println("Number of letters is " + numLetters);
	}
 }