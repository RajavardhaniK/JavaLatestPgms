package stringPgms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String givenText    = "Rajavardhani and Ilandirayan";
		System.out.println("Before replacing : "+givenText);
		givenText=givenText.replaceAll(" ", "");
		System.out.println("After replacing : "+givenText);
		
		String givenText1    = "Dharvik raji and Ilandirayan";
		System.out.println("Before replacing : "+givenText1);
		givenText1=givenText1.replaceAll("\\s", "");
		System.out.println("After replacing : "+givenText1);
	}

}
