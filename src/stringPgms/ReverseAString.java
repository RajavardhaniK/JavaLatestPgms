package stringPgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseAString {
	public void usingStringBuffer()
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);

		StringBuffer buffer = new StringBuffer();
		buffer.append(originalString);
		StringBuffer reversedString = buffer.reverse();
		System.out.println("Reversed string is : "+reversedString);
	}

	public void usingStringBuilder()
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);

		StringBuilder buffer = new StringBuilder();
		buffer.append(originalString);
		StringBuilder reversedString = buffer.reverse();
		System.out.println("Reversed string is : "+reversedString);
	}
	public void usingLogic()
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);	

		char[] char_array= originalString.toCharArray();
		String reversedString="";
		for(int i=char_array.length-1;i>=0;i--)
		{
			reversedString = reversedString+char_array[i];
		}
		System.out.println("Reversed string is : "+reversedString);

	} 

	public void usingAdvancedForLoop()
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);	

		String[] string_array= originalString.split(" ");
		System.out.println("String array length is :" +string_array.length);
		String reversedString="";			
		for(String word: string_array) {

			for(int i=word.length()-1;i>=0;i--)
			{
				reversedString = reversedString+word.charAt(i);
			}
			System.out.println("Reversed string is : "+reversedString);

		} 
	}

	public void usingCollections() {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);	

		char[] char_array= originalString.toCharArray();
		//need to add each character in the list so that create the list
		List<Character> list = new ArrayList<Character>();
		for (Character character : char_array) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator<Character> iterator = list.listIterator();
		while(iterator.hasNext())
		{
			System.out.println("Traverse the string " + iterator.next());
		}



	}

	public void CheckPalindrome() {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);	

		char[] char_array= originalString.toCharArray();
		String reversedString="";
		for(int i=char_array.length-1;i>=0;i--)
		{
			reversedString = reversedString+char_array[i];
		}
		System.out.println("Reversed string is : "+reversedString);
		if(originalString.equals(reversedString))
		{
			System.out.println("Entered String is Palindrome ");
		}
		else
		{
			System.out.println("Entered String is Not a Palindrome ");

		}

	}
	public static void main(String[] args)
	{
		ReverseAString reverseaString= new ReverseAString();
		//reverseaString.usingStringBuffer();
		//reverseaString.usingStringBuilder();
		//reverseaString.usingLogic();
		//reverseaString.usingCollections();
		//reverseaString.CheckPalindrome();
		reverseaString.usingAdvancedForLoop();
	}



}
