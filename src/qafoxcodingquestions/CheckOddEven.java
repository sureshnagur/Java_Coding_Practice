package qafoxcodingquestions;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the number to check whether its odd or even");
		
		int a=sc.nextInt();
		
		if(a%2==0) {
			
			System.out.println("Given number "+a+" is even number");
		}
		else {
			System.out.println("Given number "+a+" is odd number");
		}
		sc.close();
	}

}
