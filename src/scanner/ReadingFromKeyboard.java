package scanner;

import java.util.Scanner;

public class ReadingFromKeyboard {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter interger value");
		int a=sc.nextInt();
		System.out.println("Integer value is : "+a);
		
		System.out.println("Please enter float value ");
		float b=sc.nextFloat();
		System.out.println("Float value is :- "+b);
		
		System.out.println("Enter string value");
		String c=sc.next();  //to take single String value from user
		System.out.println("String value is :- "+c);
		
		System.out.println("Please enter complete string line");
		String d=sc.nextLine();
		System.out.println("String complete line is :- "+d);
		
		
	}

}
