package stringPgms;

public class RemoveJunkOrSplCharacters {

	public static void main(String[] args) {
		String givenText    = "#$$%$E^$%%^%&^%&Rajavardhani and Ilandirayan2626!)(*&$&%$*";
		System.out.println("Before replacing : "+givenText);
		givenText=givenText.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After replacing : "+givenText);
	}

}
