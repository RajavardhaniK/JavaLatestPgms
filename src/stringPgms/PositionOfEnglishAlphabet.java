package stringPgms;

import java.util.Scanner;
//1]Get the char from user
//2]Uniform case
//3]Typecast -> Asciivalue
//4]formula
public class PositionOfEnglishAlphabet {
		// a = 97 | A =65
	public void positionEnglishalphSmallLetter() {
		Scanner scanner		 = new Scanner(System.in);
		System.out.println("Enter any character");
		char givenChar	 = scanner.next().charAt(0);
		givenChar		 = Character.toLowerCase(givenChar);
		System.out.println("Before TypeCasting : " + givenChar);
		int asciivalue	= (int)givenChar;
		System.out.println("After TypeCasting : " + givenChar);
		int position		= asciivalue-96;
		System.out.println("Letter position is: " + position);
	}
	public void positionEnglishalphCapitalLetter() {
		Scanner scanner		 = new Scanner(System.in);
		System.out.println("Enter any character");
		char givenChar	 = scanner.next().charAt(0);
		givenChar		 = Character.toUpperCase(givenChar);
		System.out.println("Before TypeCasting : " + givenChar);
		int asciivalue	= (int)givenChar;
		System.out.println("After TypeCasting : " + givenChar);
		int position		= asciivalue-64;
		System.out.println("Letter position is: " + position);
	}
	
	public static void main(String[] args) {
		PositionOfEnglishAlphabet positionOfEnglishAlphabet = new PositionOfEnglishAlphabet();
		positionOfEnglishAlphabet.positionEnglishalphSmallLetter();
		positionOfEnglishAlphabet.positionEnglishalphCapitalLetter();
	}


}
