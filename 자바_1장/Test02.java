package edu.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		
		// 1번째 숫자 입력 받을 곳 만들기
		
		// 2번째 숫자 입력 받을 곳 만들기
		
		
		//
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1번째 숫자:");		
		int num1 = scanner.nextInt();
		
		System.out.print("2번째 숫자:");
		int num2 = scanner.nextInt();
		
		
		int snum = num1;
		int bnum = num2;
		int firstNum;
		int secondNum;
		
		if (num1>num2) {
			bnum = num1;
			snum = num2;
		
		}
		
		for (firstNum = snum; firstNum<=bnum; firstNum++) {
			
		for (secondNum = 1; secondNum<10; secondNum++) {
			
			if (secondNum ==1) {
				System.out.println("[" + firstNum + "단" + "]");
			}
			
			System.out.println(firstNum + " X " + secondNum + " = " + firstNum * secondNum);
			
		}
		
		 System.out.print('\n');
		
		}
		

		
		
		
		
	}
	
}
