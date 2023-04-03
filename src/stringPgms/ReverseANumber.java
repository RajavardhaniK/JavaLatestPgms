package stringPgms;

import java.util.Scanner;

public class ReverseANumber {
	public void usingStringBuffer()
	{
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);

		Integer originalNumber = sc.nextInt();
		System.out.println("Original Number is : "+originalNumber);

		StringBuffer buffer = new StringBuffer();
		buffer.append(originalNumber);
		StringBuffer reversedNumber = buffer.reverse();
		System.out.println("Reversed Number is : "+reversedNumber);
	}

	public void usingStringBuilder()
	{
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);

		int originalNumber = sc.nextInt();
		System.out.println("Original Number is : "+originalNumber);

		StringBuilder buffer = new StringBuilder();
		buffer.append(originalNumber);
		StringBuilder reversedNumber = buffer.reverse();
		System.out.println("Reversed Number is : "+reversedNumber);
	}
	
	public void usingLogic()
	{
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);

		int originalNumber = sc.nextInt();
		System.out.println("Original Number is : "+originalNumber);
		
		int reversedNumber=0;
		if(originalNumber!=0)
			
		{		
			// gives the last digit of the number  
			int remainder = originalNumber %10;
			reversedNumber= reversedNumber*10+remainder;
			// removes the last digit of the number  
			originalNumber = originalNumber /10;
		/*	
			reversedNumber = reversedNumber *10;
			reversedNumber =reversedNumber + originalNumber %10;
			originalNumber =originalNumber /10;*/

		}
		System.out.println("The reverse of the given number is: " + reversedNumber);  

	}
	
	
	
	
	public static void main(String[] args)
	{
		ReverseANumber reverseANumber= new ReverseANumber();
		//reverseANumber.usingStringBuffer();
		//reverseANumber.usingStringBuilder();
		reverseANumber.usingLogic();
		//reverseANumber.usingCollections();
		//reverseANumber.CheckPalindrome();
	}
	
	
}
