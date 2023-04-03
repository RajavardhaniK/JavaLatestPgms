package stringPgms;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInAString {
//pangram
	public static void main(String[] args) {
		String givenText    = "Rajavardhani Kathiresan";
		givenText			= givenText.toLowerCase();
		givenText			= givenText.replaceAll(" ", "");
		String[] userArray	= givenText.split("");
		String alphabets	="abcdefghijklmnopqrstuvwxyz";
		String[] alphabetsArray	= alphabets.split("");
		HashSet<String> set1= new HashSet<String>(Arrays.asList(userArray));
		HashSet<String> set2= new HashSet<String>(Arrays.asList(alphabetsArray));
		System.out.println("set 1 is " +set1);
		System.out.println("set 2 is " +set2);
		set2.removeAll(set1);
		System.out.println(set2);
	}
}
