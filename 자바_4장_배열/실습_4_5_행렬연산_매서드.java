package 자바_4장_배열;

import java.util.Random;

public class 실습_4_5_행렬연산_매서드 {
	
	private static Random rnd = new Random();

	public static void main(String[] args) {
		
		int[][] A = setMatrixRandom (3, 5);
		printMatrix(A, "Matrix A");
		
		int[][] B = setMatrixRandom (5, 2);
		printMatrix(B, "Matrix B");
		
		int[][] C = setPlusMatrix (A, B);
		printMatrix(C, "Matrix A+B");
		
		int[][] D = setMultMatrix (A, B);
		printMatrix(D, "Matrix A*B");

	}
	
	//입력한 행렬 Matrix 만들고, 랜덤 수 집어넣기
	private static int[][] setMatrixRandom(int row, int col) {
		int[][] a = new int[row][col];
		
		for (int i=0; i<row;i++ ) {
			for (int j=0; j<col; j++) {
				
				a[i][j] = rnd.nextInt(11);
			}
		}
		return a;
	}
	
	// Matrix 양식에 맞춰서 출력하기
	private static void printMatrix(int A [][], String s) {
		
		
		if (A == null) {
			System.out.println();
			return;
		}
		System.out.print("["+ s + "]");
		
		for (int[] row : A) {
			System.out.println();
			for (int x : row) {
				System.out.print(x + " ");
			}
			
		}
		System.out.println('\n');
	}
	
	private static int[][] setPlusMatrix(int A[][], int B[][]) {
		
		int[][] a = new int [A.length][A[0].length];
		
		if (A.length != B.length | A[0].length != B[0].length) {
			System.out.println("Matrix의 행열이 같아야 합니다");
			return null;
		}
		else
			
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[0].length; j++) {
				
				a[i][j] = A[i][j] + B[i][j]; 
			}
			
		}
		return a;	
	}
	
	
	private static int[][] setMultMatrix(int A[][], int B[][]) {
	
		int sum = 0;
		int [][] a = new int [A.length][B[0].length];
		
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B[0].length; j++) {
				for (int k=0; k<B.length; k++) {
					
					sum += A[i][k] * B[k][j];
					
				}
				a[i][j] = sum;
				sum = 0;
			}
		}
		return a;
		
		
		
		
		
		
		
		
	}
	
	
	
}
