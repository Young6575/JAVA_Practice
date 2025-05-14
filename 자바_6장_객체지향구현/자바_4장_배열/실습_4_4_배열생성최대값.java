package 자바_4장_배열;

import java.util.Random;

public class 실습_4_4_배열생성최대값 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int [] price = new int [10];
		
		
		// 난수 10개 배열에 저장
		for (int i=0;i<price.length;i++) {
			price[i] = rnd.nextInt(100);
		}
		
		
		//최대값
		int priceMax = price[0];
		int priceMin = price[0];
		int sum=0;
		
		for (int i=1;i<price.length;i++) {
			
			if (priceMax<price[i-1]) {
				priceMax = price[i-1];
			}
			
			if (priceMin>price[i-1]) {
				priceMin = price[i-1];
			}
			
			sum += price[i-1];
		}	
		
		
		System.out.println("최대값:" + priceMax);
		System.out.println("최소값:" + priceMin);
		System.out.println("평균값:" + sum/10);
		
		
		int arr;
		int i =0;
		System.out.print("[");
		for (int x:price) {
			arr = x;
			
			if (i>price.length-2) {
				System.out.print(arr);
			}
			
			else 
			System.out.print(arr + ", ");

			
			i =+ i+1;
		
	}
		System.out.print("]");
		

		
		
		
		
		
}
}