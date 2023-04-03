package stringPgms;

public class FindOccuranceofCharacterInString {

	public void usingIteration()
	{
		String givenText    = "Rajavardhani";
		givenText			= givenText.toLowerCase();
		int occurence=0;
		for (int i=0;i<givenText.length();i++)
		{
			if(givenText.charAt(i)=='v')
			{
				occurence++;
			}	
		}
		System.out.println("usingIteration : occurence is " +occurence);
	}
	public void withoutusingIteration()
	{
		String givenText    	= "Rajavardhani";
		givenText				= givenText.toLowerCase();
		String toFind			= Character.toString('v').toLowerCase();
		int before_length		= givenText.length();
		System.out.println("Before Replacing : Length is = " +before_length);
		givenText				= givenText.replace(toFind, "");
		int after_length		= givenText.length();
		System.out.println("After Replacing : Length is = " +after_length);
		int number				= before_length-after_length;
		System.out.println("withoutusingIteration: Occurence_is= " +number);
	}
	public static void main(String[] args) {
		FindOccuranceofCharacterInString findOccuranceofCharacterInString = new FindOccuranceofCharacterInString();
		findOccuranceofCharacterInString.usingIteration();
		findOccuranceofCharacterInString.withoutusingIteration();
	}

}
