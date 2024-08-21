package stringRelated;

public class FindVowelsPresent {
	
	public static boolean vowelsCheck(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
		
	}

	public static void main(String[] args) {

		System.out.println(vowelsCheck("suresha"));
		System.out.println(vowelsCheck("prsqtnm"));
	}

}
