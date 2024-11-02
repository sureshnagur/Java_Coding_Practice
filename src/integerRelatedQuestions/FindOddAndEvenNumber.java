package integerRelatedQuestions;

import java.util.Scanner;

public class FindOddAndEvenNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number to check odd or even ");
		int value=sc.nextInt();
		sc.close();
		
		if(value%2==0) {
			System.out.println("Given number is even number");
		}
		else {
			System.out.println("Given number is odd number");
		}
	}

}
