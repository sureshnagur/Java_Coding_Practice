package stringRelated;

public class SumOfArray {
	
	public static int []arr= {4,6,23,56};

	public static void main(String[] args) {
		
		int value=SumOfDigits(arr.length-1);
		
		System.out.println(value);

	}

	public static int SumOfDigits(int n) {
		
		if(n==0)
		return arr[n];
//		return arr[n]+SumOfDigits(n-1);
//		return arr(n);
		return arr[n]+SumOfDigits(n-1);
		
		
	}


}