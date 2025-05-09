package 자바_4장_배열;

import java.util.Random;

public class Arrangement {

	public static void main(String[] args) {

// 1.3행 5열짜리 표 A 만들기
		int[][] arrA = new int[3][5];

		Random rnd = new Random();
		for (int i = 0; i < arrA.length; i++) {

			for (int j = 0; j < arrA[i].length; j++) {
				arrA[i][j] = rnd.nextInt(99);
			}
		}

		System.out.print("[A반 시험점수]");
		for (int[] row : arrA) {
			System.out.println();

			for (int x : row) {
				System.out.print(x + " ");

			}

		}

// 2.같은 크기 표 B 만들고 무작위 점수 채우기
		System.out.println('\n');
		
		int[][] arrB = new int[3][5];

		for (int i = 0; i < arrB.length; i++) {

			for (int j = 0; j < arrB[i].length; j++) {
				arrB[i][j] = rnd.nextInt(99);
			}
		}

		System.out.print("[B반 시험점수]");
		for (int[] row : arrB) {
			System.out.println();

			for (int x : row) {
				System.out.print(x + " ");

			}

		}
		
// 3.C = A + B
		System.out.println('\n');
		int[][] sumArr = new int [3][5];
		
		for (int i=0; i<arrA.length;i++) {
			for (int j=0; j<arrA[i].length;j++) {
				
				sumArr[i][j] = arrA[i][j] + arrB[i][j];
				
			}
		}
		
		System.out.print("[A+B반 시험점수]");
		for (int[] row : sumArr) {
			System.out.println();

			for (int x : row) {
				System.out.print(x + " ");

			}

		}
		
		
		
// 4.5행4열 표D 만들기
//D[5][4]는 예를 들어 과목별 프로젝트 점수라고 생각해보자
		
		System.out.println('\n');
		int[][] arrD = new int [5][4];
		
		for (int i=0; i<arrD.length;i++) {
			for (int j=0; j<arrD[i].length;j++) {
				
				arrD[i][j] = rnd.nextInt(99);
				
			}
		}
		
		System.out.print("[D반 프로젝트점수]");
		for (int[] row : arrD) {
			System.out.println();

			for (int x : row) {
				System.out.print(x + " ");

			}

		}
		
		
// 5.E = A X D

// 6.F = D의 전치 행렬

// 7.G = A X F

// 8.E와 G가 같은지 비교

// 9.2차원 배열을 테이블 행태로 출력

	}

}
