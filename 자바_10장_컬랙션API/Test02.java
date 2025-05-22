package 자바_10장_컬랙션API;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===================");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("===================");
		
		for (String x:list)
			System.out.println(x);
		System.out.println("===================");
		
		for (int i = list.size()-1; i>-1; i--) 
			System.out.println(list.get(i));
		
		
	}
	
}
