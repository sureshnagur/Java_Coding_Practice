package integerRelatedQuestions;

public class ArraySum {

	public static void main(String[] args) {


		int sum=0;
		
		int[] array= {12,23,10,22,10,5};
		
		for(int i=0;i<array.length;i++) {
			
			sum=sum+array[i];
		}
		
		System.out.println("Sum on array : "+sum);

	}

}
