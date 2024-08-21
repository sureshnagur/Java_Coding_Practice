package integerRelatedQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		// How do you swap two numbers without using third variables in java?

		int a = 10;
		int b = 24;

		System.out.println("Value of a before swap is : " + a + " Value of b before swap is : " + b);

		a = a + b; // a value becomes 34
		b = a - b; // 34-24 so the b value becomes 10
		a = a - b; // 34-10 so the a value becomes 24

		System.out.println("Value of a after swap is : " + a + " Value of b after swap is : " + b);
	}

}
