package 자바_4장_배열;

import java.util.Random;

public class 실습_4_3_배열_점수평균 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 학생 10명 성적 저장할 배열 선언
		int score[] = new int[10];
		
		//10명 학생의 학점 출력
		for (int i=0;i<score.length;i++) {
			score[i]= rnd.nextInt(100);
		}
		
		//10명의 성적 평균
		int sum =0;
		char grade=' ';
		
		for (int x : score) {
			sum += x;
			if (x>=90) 
				grade ='A';
			else if (x<90 & x>=80) 
				grade ='B';
			else if (x<80 & x>=70) 
				grade ='C';
			else if (x<70 & x>=60) 
				grade ='D';
			else
				grade ='F';
			System.out.println(x+"점" +"("+ grade + "학점)");
			
		}
		System.out.println("평균:" + sum/score.length);
		
		//10명 학생의 학점 출력
		

		
		
		
	}

}
