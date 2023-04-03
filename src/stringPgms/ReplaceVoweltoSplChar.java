package stringPgms;
public class ReplaceVoweltoSplChar {
	//1] String -> convert any format
	//2] String -> Char Array
	//3] forloop = calculate length of the string and iterate
	//4] vowel ->replace to *
	//5] print char array	


	public void usingCharArray()
	{
		String givenText    = "Rajavardhani";
		givenText			=givenText.toLowerCase();
		char[]	charArray	= givenText.toCharArray();
		for (int i=0;i<givenText.length();i++)
		{
			if(		givenText.charAt(i)=='a'||
					givenText.charAt(i)=='e'||
					givenText.charAt(i)=='i'||
					givenText.charAt(i)=='o'||
					givenText.charAt(i)=='u')
			{
				charArray[i]='*';
			}					
		}
		for (int i=0;i<givenText.length();i++)
		{
			//System.out.println(charArray[i]);
			//instead of println new line give print only
			System.out.print(charArray[i]);
		}
	}
	public void usingRegEx()
	{
		String givenText    = "Rajavardhani";
		//string to star
		String ReplacedString = givenText.replaceAll("[AEIOUaeiou]", "*");
		//string to dollar //$
		//String ReplacedString = givenText.replaceAll("[AEIOUaeiou]", "//$");
		System.out.println("ReplacedString : " +ReplacedString);
	}
	public static void main(String[] args) {
		ReplaceVoweltoSplChar replaceVoweltoSplChar = new ReplaceVoweltoSplChar();
		replaceVoweltoSplChar.usingCharArray();
		//replaceVoweltoSplChar.usingRegEx();
	}


}
