package qafoxcodingquestions;

import java.util.Scanner;

public class TakingInputNumbersFromUser {

	public static void main(String[] args) {
		//with the help of Scanner class we can take the input from the users during the runtime.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		
		int b=sc.nextInt();
		
		System.out.println("Addition of two numbers is : "+(a+b));
		
		sc.close();
		
		
	}

}
