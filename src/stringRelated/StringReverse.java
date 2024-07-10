package stringRelated;

public class StringReverse {

	public static void main(String[] args) {
		String name="Selenium";
		String rev="";
		int size=name.length();
		
		for(int i=size-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
			
		}
			System.out.println(rev);

	}

}
