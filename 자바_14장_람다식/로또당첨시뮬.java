package 자바_14장_람다식;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

class lottoStaticNum {
	
	public ArrayList<Integer> creatNum() {
		ArrayList<Integer> lottoArrayList = new ArrayList<>(7);
		   Random random = new Random();
		int count =0;
		int prenum = 0;
		   while (count < 8 ) {
			   int number = random.nextInt(45) + 1;
			   
			   if(lottoArrayList.contains(number) == false) {
			   lottoArrayList.add(number);
			   prenum = number;
			   count ++;
			   }
		   }
		   lottoArrayList.sort((a, b) -> a - b); // 오름차순 정렬

		   return lottoArrayList;
	}	   
	
}



class Lottonum {
	
	public void creatNum() {
		ArrayList<Integer> lottoArrayList = new ArrayList<>(7);
		   Random random = new Random();
		int count =0;
		int prenum = 0;
		   while (count < 8 ) {
			   int number = random.nextInt(45) + 1;
			   
			   
			   if(lottoArrayList.contains(number) == false) {
			   lottoArrayList.add(number);
			   prenum = number;
			   count ++;
			   }
		   }
		
			   
			   
			   
//			   for (int i =0; i <8; i++) {
//			int number = random.nextInt(45) + 1;
//			lottoArrayList.add(number);
//		}
		   lottoArrayList.sort((a, b) -> a - b); // 오름차순 정렬
		System.out.println(lottoArrayList);
	}
	
}


public class 로또당첨시뮬 {
	
	public static void main(String[] args) {
		lottoStaticNum staticNum = new lottoStaticNum();
		ArrayList<Integer> base = staticNum.creatNum();
        System.out.println("기준 번호: " + base);
		
		int count = 0;
		
		  while (true) {
	            count++;
	            List<Integer> current = staticNum.creatNum();

	            if (base.equals(current)) {
	                System.out.println("★ " + count + "번째 시도에서 일치! " + current);
	                break;
	            }

	            // 중간 진행 상황 보기 (옵션)
	            if (count % 100000 == 0) {
	                System.out.println(count + "회 시도 중...");
	            }
	        }
	
		
	
	}

}
