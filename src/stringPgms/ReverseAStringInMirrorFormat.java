package stringPgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseAStringInMirrorFormat {
//i love mom and dad
//i evol mom dna dad 
	public void usingLogic()
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);	

		String[] string_array= originalString.split(" ");
		System.out.println("String array length is :" +string_array.length);
		String reversedString="";			
		for(String word: string_array) {
			String reversedWord="";
			for(int i=word.length()-1;i>=0;i--)

			{
				reversedWord = reversedWord+word.charAt(i);
			}
			reversedString = reversedString+reversedWord+" ";

		}
		System.out.println("Reversed string is : "+reversedString);

		/*
		String reversedString="";String reversedWord="";
		for(int i=string_array.length-1;i>=0;i--)
		{
			reversedWord = reversedWord+string_array[i]+" ";
		}
		reversedString = reversedString+reversedWord+" ";

		System.out.println("Reversed string is : "+reversedString);*/

	}




	public static void main(String[] args)
	{
		ReverseAStringInMirrorFormat reverseaString= new ReverseAStringInMirrorFormat();
		reverseaString.usingLogic();
	}



}
