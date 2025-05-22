package 자바_10장_컬랙션API;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;



public class TestLottoNum {
	
	
	public static void main(String[] args) {
		
		Random rnd = new Random(1234);
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i =0; i<6; i++) {
			set = new HashSet<>();
			list = new ArrayList<>();
			while (set.size()!=6) {
			
				int num = rnd.nextInt(1,46);
				set.add(num);
			}
			
			for (int x : set) list.add(x);
			
			list.sort(null);
			System.out.println(set);
			System.out.println(list);
			System.out.println("=================");
		}

	}



}
