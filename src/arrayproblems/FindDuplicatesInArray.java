package arrayproblems;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		String[] arr = { "java", "python", "C", "C++", "java","python" };
		
		for (int i = 0; i<arr.length; i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("Found duplicate element "+arr[i]);
				}
			}

		}

	}

}
