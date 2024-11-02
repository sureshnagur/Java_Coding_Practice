package arrayproblems;

public class FindDuplicatesInArray1 {

	public static void main(String[] args) {

		int [] arr= {12,6,23,5,7,21,8,44,12,5,6};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("Duplicates elements found "+arr[i]);
				}
			}
		}
	}

}
