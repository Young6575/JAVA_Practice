package edu.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("num:");
		int num = scanner.nextInt();
		
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		
		//1~100 홀수 합
		
		for (i = 1; i <= num; i++) {
			
			if(i%2 == 0) 
				a += i ; 	// a = a+i
			
			
			else
				b += i;
			
			c += i;
			
		
		
		
		
		
	}
		System.out.println("짝수합:" + a);
		System.out.println("홀수합:" + b);
		System.out.println("전체합:" + c);
	}	

}
//1~100 홀수 합 / 짝수 합 / 총합