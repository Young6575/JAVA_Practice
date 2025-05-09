package 자바_4장_배열;

public class 실습_4_2_배열생성최대값 {
	
	public static void main(String[] args) {
		
		int[] price = {97, 91, 87, 67, 73};
		int priceMax = price[0];
		
		for (int i=1;i<price.length;i++) {
			
			if (priceMax<price[i-1]) {
				priceMax = price[i-1];
			}
		}	
		
		System.out.println("최대값:" + priceMax);
		
		int arr;
		System.out.print("[");
		for (int x:price) {
			arr = x;
			
			System.out.print(arr + ", ");

		
	}
		System.out.print("]");
		
}
}