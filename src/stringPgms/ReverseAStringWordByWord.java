package stringPgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseAStringWordByWord {
	//raji ilan dharvik
	//dharvik ilan raji
	String reversedString="";
	String firstletter="";
	String remLetStr="";
		public void usingLogic()
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);

		String originalString = sc.nextLine();
		System.out.println("Original string is : "+originalString);	

		String[] string_array= originalString.split(" ");
		System.out.println("String array length is :" +string_array.length);
		//String reversedString="";
		for(int i=string_array.length-1;i>=0;i--)
		{
			reversedString = reversedString+string_array[i]+" ";
		}
		System.out.println("Reversed string is : "+reversedString);

	}
public void uppper() {
	
	//System.out.println("Reversed string is : "+reversedString);
	String[] string_array= reversedString.split(" ");
	int k=string_array.length;
	for(int j=0;j<k;j++){
		 firstletter=string_array[j].substring(0, 1);
		 remLetStr = string_array[j].substring(1);
		firstletter=firstletter.toUpperCase();
		 reversedString=firstletter+remLetStr;		
		 System.out.println(reversedString);
	}
	

}
	

	
	public static void main(String[] args)
	{
		ReverseAStringWordByWord reverseaString= new ReverseAStringWordByWord();
		reverseaString.usingLogic();
		reverseaString.uppper();
	}



}
