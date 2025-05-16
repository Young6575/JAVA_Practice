package edu.test;

import java.util.Scanner;

public class MinBillCount {

		public static void main(String[] args) {
			
			
			//상품금액 입력받기
			Scanner scanner = new Scanner(System.in);
			System.out.print("상품금액: ");		
			int bill = scanner.nextInt();
			
			int count50 = bill/50000;
			int remainbill1 = bill - (50000*count50);
			
			int count10 = remainbill1/10000;
			int remainbill2 = remainbill1 - (10000*count10);
			
			int count5 = remainbill2/5000;
			int remainbill3 = remainbill2 - (5000*count5);
			
			int count1 = remainbill3/1000;
			int remainbill4 = remainbill3 - (1000*count1);
			
			// 큰 금액부터 나눠서 몫만큼 빼고 그 다음 금액으로 넘겨서하고 천원 미만은 빼주기
			
			System.out.println("5만원권: " + count50);
			System.out.println("1만원권: " + count10);
			System.out.println("5천원권: " + count5);
			System.out.println("1천원권: " + count1);
			System.out.println("남은금액 " + remainbill4);
			
			
			
			
			
			
		}
	
}
