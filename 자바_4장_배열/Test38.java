package 자바_4장_배열;

import java.util.Random;

public class Test38 {
	
	public static void main(String[] args) {
	
		int [][] arr = new int [5][5];
		Random rnd = new Random();
		for (int i=0;i<arr.length;i++) {
			
			for (int j=0; j<arr[i].length;j++) {
				arr[i][j]=rnd.nextInt(100);
				
			}
		}
		
		
	//2차원 배열에서 확장형 for문 사용
		
		for (int[] row : arr) {
			for (int v : row) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
	
		
	}
}
