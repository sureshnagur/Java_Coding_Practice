package stringRelated;

public class StringMethods {

	public static void main(String[] args) {

		String topic="Selenium";
		
		//1)length() method
		//Return the number of characters in a string
		//The length() method returns the length of a specified string.
		//Note: The length of an empty string is 0.
		System.out.println("The length of String is "+ topic.length());
		
		//*Technical Details
		//*Returns:	An int value, representing the length of the string
		
		//----------------------------------------------------------------
		//2)concat() method
		//The concat() method appends (concatenate) a string to the end of another string.
		String firstName="Suresh";
		String lastName="Nagur";
		
		System.out.println("concat() method : "+firstName.concat(lastName));
		
		//Technical Details
		//Returns:	A String, representing the text of the combined strings
		
		//-------------------------------------------------------------------
		
	   //3)charAt() :-- The charAt() method returns the character at the specified index in a string.
	   // The index of the first character is 0, the second character is 1, and so on.
		/*Technical Details
		Returns:	A char value at the specified index of this string.
		The first char value is at index 0
		Throws:	IndexOutOfBoundsException - if index is negative or not less than the length of the specified string*/
		
		char result=firstName.charAt(0);
		
		System.out.println("charAt() method : "+result);
		
		//----------------------------------------------------------------------
		
		//4)indexOf()	Returns the position of the first found occurrence of specified characters in a string
		
		int p=firstName.indexOf("u");	
		System.out.println("indexOf() method : "+p);
		
		//----------------------------------------------------------------------
		
		//5)contains()  :---The contains() method checks whether a string contains a sequence of characters.

						//Returns true if the characters exist and false if not.
						//Find out if a string contains a sequence of characters
		
						System.out.println("contains() method : "+firstName.contains("Sur"));
						
		//--------------------------------------------------------------------------
						
		//6)endsWith()  :---The endsWith() method checks whether a string ends with the specified character(s).

						/*Technical Details
						Returns:	A boolean value:
						true - if the string ends with the specified character(s)
						false - if the string does not end with the specified character(s) */
		
						System.out.println("endsWith() method : "+firstName.endsWith("resh"));


	}

}
