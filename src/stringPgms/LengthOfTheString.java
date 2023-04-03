package stringPgms;

public class LengthOfTheString {

	public static void main(String[] args) {
		String givenText    = "Rajavardhani  Kathiresan";
		char[] char_Array=givenText.toCharArray();
		int length=0;
		for (char c : char_Array) {
			length++;
			//System.out.println("Each char is " +c);
		}
		System.out.println("Length is " +length);
	}

}
