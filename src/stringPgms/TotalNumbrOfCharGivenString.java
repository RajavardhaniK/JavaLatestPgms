package stringPgms;

public class TotalNumbrOfCharGivenString {

	public static void main(String[] args) {
		String givenText    = "Rajavardhani  Kathiresan";
		char[] char_Array=givenText.toCharArray();
		int totalchar=0;
		for (char c : char_Array) {
			totalchar++;
			//System.out.println("Each char is " +c);
		}
		System.out.println("Length is " +totalchar);
	}

}
