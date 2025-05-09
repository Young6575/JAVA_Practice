package 자바_4장_배열;

public class Test35 {

	public static void main(String[] args) {
		
		double arr[ ] = {1.1,2.2,3.3,4.4,5};
		
		for (double num : arr) {
			System.out.println(num);
		}
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > 3.3)
				System.out.print("\n");
				System.out.println(arr[i]);
			
		}
	
	}
}
