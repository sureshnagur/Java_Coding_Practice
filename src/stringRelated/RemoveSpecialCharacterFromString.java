package stringRelated;

public class RemoveSpecialCharacterFromString {
	
	//We use Regular expression to remove special character from String
	//Regualr expression is [a-zA-Z0-9]

	public static void main(String[] args) {
		
		String s="#$%^^%$%^&* log 01458632";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");  //^ this is not symbol. it means except a-zA-Z0-9 these all will be reaplced with the condition what we mentioon
		
		System.out.println(s);



	}

}
