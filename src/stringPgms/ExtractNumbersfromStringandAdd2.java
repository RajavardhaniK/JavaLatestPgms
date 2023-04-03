package stringPgms;

public class ExtractNumbersfromStringandAdd2 {

	public static void main(String[] args) {

		String givenText1 = "Rajavardhani123";
		String givenText2 = "Rajavardhani456";
		StringBuffer insert= new StringBuffer("Dharvik");
		insert.capacity();

		givenText1="ilan123";
		givenText1=givenText1.concat("checking");
		System.out.println("after concat" + givenText1.concat("happyus"));
		System.out.println("old" + givenText1);

		System.out.println("my sring is" + givenText1);
		String text11=givenText1.toLowerCase();
		
		String text22=givenText2.toLowerCase();
		
		String  text1= text11.replaceAll("[a-z]", "");
		String  text2= text22.replaceAll("[a-z]", "");
		
		Integer a=Integer.parseInt(text1);
		Integer b=Integer.parseInt(text2);
		
		System.out.println(a+b);
		
		
		
		
		
		
		
		/*StringBuffer buff= new StringBuffer();
		StringBuffer givenText3 =buff.append(givenText1) + buff.append(givenText2);

		for (int i = 0; i < givenText1.length(); i++) {

			for (int j = i ; i < givenText2.length(); j++) {
				char character_value1 = givenText1.charAt(i);
				char character_value2 = givenText2.charAt(i);

				if (Character.isDigit(character_value1)&& Character.isDigit(character_value2)) {
					total = total + Character.getNumericValue(character_value1)+Character.getNumericValue(character_value2);
				}
				System.out.println("Added value is : " + total);
			}
		}*/

	}
}
