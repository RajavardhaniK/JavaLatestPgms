package stringPgms;

public class CountWordsInAString {

	public static void main(String[] args) {
		String givenText = "Rajavardhani    Kathiresan Ilan Dharvik apple ornage";

		
		/*String[] a=givenText.split("");
		int b=a.length;
		System.out.println(b);*/
		
		// char[] char_Array=givenText.toCharArray();
		int countWord = 1;
		for (int i = 0; i < givenText.length(); i++) {

			if ((givenText.charAt(i) == ' ') && (givenText.charAt(i + 1) != ' ')) {
				System.out.println(givenText.charAt(i));
				countWord++;
				
			}
		}
		System.out.println("Word count  is " + countWord);
	}

}
