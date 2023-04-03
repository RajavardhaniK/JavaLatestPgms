package stringPgms;

import java.util.Scanner;

public class PatternPgms {

	public void starPattern()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int numberOfLines= scanner.nextInt();
		int row,column;
		for(row=0;row<numberOfLines;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void NumberPattern()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int numberOfLines= scanner.nextInt();
		int row,column;
		int startingNumber=5;
		for(row=0;row<numberOfLines;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print(startingNumber+" ");
				startingNumber++;			
			}
			System.out.println();
		}
	}
	public void alphabetPattern()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines : ");
		int numberOfLines= scanner.nextInt();
		int row,column;
		char startingLetter='b';
		for(row=0;row<numberOfLines;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print(startingLetter+" ");
				startingLetter++;			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PatternPgms patternPgms = new PatternPgms();
		//patternPgms.starPattern();
		//patternPgms.NumberPattern();
		patternPgms.alphabetPattern();
	}

}
