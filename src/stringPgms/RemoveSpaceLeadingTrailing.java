package stringPgms;

public class RemoveSpaceLeadingTrailing {

	public static void main(String[] args) {
		String givenText    = "       Rajavardhani  Kathiresan    ";
		System.out.println("using Trim :"+givenText.trim());
		System.out.println(" using reg ex Leading :"+givenText.replaceAll("^[ \t]+", ""));
		System.out.println(" using reg ex Trailing :"+givenText.replaceAll("[ \t]+$", ""));
		System.out.println(" using reg ex Leading and Trailing :"+givenText.replaceAll("^[ \t]+|[ \t]+$", ""));


	}

}
