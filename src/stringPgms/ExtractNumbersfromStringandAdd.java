package stringPgms;

public class ExtractNumbersfromStringandAdd {

	public static void main(String[] args) {

		int total=0;
		String givenText    = "Rajavardhani123";
		for (int i=0;i<givenText.length();i++)
		{
		char character_value= givenText.charAt(i);
		if(Character.isDigit(character_value))
		{
			total = total +Character.getNumericValue(character_value);
		}
		System.out.println("Extracted value is : " +total);
		}
	}

}
