package stringPgms;

public class CountVowel {
	//1] String -> convert any format
	//2] int vowelscount =0 
	//3] forloop = calculate length of the string and iterate
	//4] vowel++


	public void countVowels()
	{
		String givenText    = "Rajavardhani";
		givenText			= givenText.toLowerCase();
		int vowelsCount=0;
		for (int i=0;i<givenText.length();i++)
		{
			if(		givenText.charAt(i)=='a'||
					givenText.charAt(i)=='e'||
					givenText.charAt(i)=='i'||
					givenText.charAt(i)=='o'||
					givenText.charAt(i)=='u')
			{
				vowelsCount++;
			}	
		}
		System.out.println("vowels " +vowelsCount);
	}
	public static void main(String[] args) {
		CountVowel replaceVoweltoSplChar = new CountVowel();
		replaceVoweltoSplChar.countVowels();
	}


}
