package integerRelatedQuestions;

public class FibonassiSequence {

	public static void printFibonacci(int count) {

		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a + b;
		}

	}

	public static void main(String[] args) {
		printFibonacci(10);
		
	}

}
