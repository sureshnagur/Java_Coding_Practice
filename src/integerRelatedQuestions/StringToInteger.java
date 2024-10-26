package integerRelatedQuestions;

import java.util.ArrayList;

public class StringToInteger {

	public static void main(String[] args) {
		
		String ab="1234";
		
		int number=Integer.parseInt(ab);
		
		System.out.println(number);
		
		String as="BillingNumber#112233";
		String[] values=as.split("#");
		int b=Integer.parseInt(values[1]);
		
		System.out.println(b);
		
		
	}

}
