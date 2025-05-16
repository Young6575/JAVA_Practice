package 자바_4장_배열;

public class 장기말 {
	
	public static void main(String[] args) {
		
		
		
		
		//말 위치
		int[][] p1 = postion(1, 1);
		
	
		
		printPosition(p1,"배치 가능 위치");
		
		
	}
	
	
	private static int [][] postion(int row, int col) {
	

		
		//장기판
		int [][] arr = new int [8][8];
		
		arr[row][col] = 8;
		
		if (row-2>=0 & col-1>=0) {
			arr[row-2][col-1] = 1;
		}
		
		if (row-2>=0 & col+1>=0) {
			arr[row-2][col+1] = 1;
		}
		
		//
		if (row-1>=0 & col+2>=0) {
			arr[row-1][col+2] = 1;
		}
		
		if (row+1>=0 & col+2>=0) {
			arr[row+1][col+2] = 1;
		}
		
		//
		if (row+2>=0 & col+1>=0) {
			arr[row+2][col+1] = 1;
		}
		
		if (row+2>=0 & col-1>=0) {
			arr[row+2][col-1] = 1;
		}
		
		//
		if (row-1>=0 & col-2>=0) {
			arr[row-1][col-2] = 1;
		}
		
		if (row+1>=0 & col-2>=0) {
			arr[row+1][col-2] = 1;
		}
		
		
	return arr;
		
	}
	
	private static void printPosition(int A[][], String msg) { 
		
		
		for (int [] row : A) {
			System.out.println();
			for (int x : row) {
				
				if (x>=8) {	
					System.out.print('⬤' + " ");
				}
				else if (x>=1) {	
					System.out.print('⬧' + " ");
				}
				else
				
				System.out.print(x + " ");
			}
		}
		
		
		
	}
	
	

}
