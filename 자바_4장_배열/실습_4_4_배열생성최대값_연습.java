package 자바_4장_배열;

import java.util.Random;

public class 실습_4_4_배열생성최대값_연습 {
	
	public static void main(String[] args) {
		
		//랜덤 값 10개 들어갈 배열 생성
		int [] arrA = new int [10];
		
		//랜덤 객체 생성
		Random rnd = new Random();
		
		System.out.print("[");
		//배열에 랜덤 값 지정
		for (int i=0; i<arrA.length;i++) {
			arrA[i]=rnd.nextInt(100);
			
			if (i>=arrA.length-1) {
			System.out.print(arrA[i]);
			
			}
			else
				System.out.print(arrA[i] + ",");
		}
				
		System.out.println("]");
		
		//최대,최소,평균구하기
		
		int max = arrA[0];
		int min = arrA[0];
		int sum = 0;
		
		for (int x : arrA) {
			
			if (max<x) {
				max = x;
			}
			
			if (min>x) {
				min = x;
			}
			
			sum += x;
		}
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println("평균값:" + sum/arrA.length);
		
		
		
		
		
	}
	
	
	
}