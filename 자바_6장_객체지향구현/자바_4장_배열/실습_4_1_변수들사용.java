package 자바_4장_배열;

public class 실습_4_1_변수들사용 {

	public static void main(String[] args) {

		int score1 = 49;
		int score2 = 91;
		int score3 = 87;
		int score4 = 67;
		int score5 = 73;

		int maxscore1 = score1 > score2 ? score1 : score2;
		int maxscore2 = score3 > score4 ? score3 : score4;
		int maxscore3 = maxscore1 > maxscore2 ? maxscore1 : maxscore2;
		int maxscore4 = maxscore1 > maxscore2 ? maxscore1 : maxscore2;
		
		int max;
		int min;
		int avg;
		
		System.out.println("최대값: " + maxscore4);

		int minscore1 = score1 < score2 ? score1 : score2;
		int minscore2 = score3 < score4 ? score3 : score4;
		int minscore3 = minscore1 < minscore2 ? minscore1 : minscore2;
		int minscore4 = minscore1 < minscore2 ? minscore1 : minscore2;

		System.out.println("최소값: " + minscore4);

		int sum = score1 + score2 + score3 + score4 + score5;
		int totalnum = 5;

		System.out.println("평균값: " + sum / totalnum);
		
		
		System.out.println("최대값: " + max(score1,score2,score3,score4,score5));
		System.out.println("최소값: " + min(score1,score2,score3,score4,score5));
		System.out.println("평균값: " + avg(score1,score2,score3,score4,score5));
		
		
	}
	
	static int max(int...v) {
		
		int result =v[0];
		for (int x:v) {
			
			if	(result<x) {
				result = x;				
			}
		}
	return result;
	}
	
	
	static int min(int...v) {
		
		int result =v[0];
		for (int x:v) {
			
			if	(result>x) {
				result = x;				
			}
		}
	return result;
	}
	
	
	static int avg(int...v) {
		
		int result =0;
		for (int x:v) {
			result += x;
		
		}
	return result/v.length;
	}
	
	
}
