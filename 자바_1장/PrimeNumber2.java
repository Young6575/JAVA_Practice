package edu.test;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Number:[0:exit]:");
			int num = scanner.nextInt();
			if (num == 0 ) break;
			if (isPrime(num) == true)
				System.out.println(num + " 소수입니다.");
			else
				System.out.println(num + " 소수가 아닙니다.");
		}
		scanner.close();
		System.out.println("완료!");
	}

	private static boolean isPrime(int num) {
		
		int i;
		int a;
		
		//절반까지의 숫자까지만 나눠보기
			for (i = 2; i<=num/2; i++) {
				
				num %= i;
				
				if	(num == 0)
				return false;
	
		
	}
			
	return true;
	
	}
}
