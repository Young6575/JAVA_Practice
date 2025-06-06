package 자바_10장_컬랙션API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		for (int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
		list.add("런던"); list.add("로마"); list.add("방콕");
		list.add("북경"); list.add("도쿄"); list.add("서울");
		
		//void add
		list.add(1, "LA");    print(2, list);
		
		// .IndexOf("X") => X가 몇번째 있는지
		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));
		
		// .remove("X") => X를 삭제
		list.remove("LA"); print(5, list);
		
		// .contains("X") => X가 있는지 없는지 true/false로 알려줌
		System.out.println("7 : " + list.contains("LA"));
		
		//
		Object obj[] = list.toArray();
			System.out.println("8 : "+ Arrays.toString(obj));
			
		//
		String cities[] = new String[0];
		cities = list.toArray(cities);
		System.out.println("9 : "+ Arrays.toString(cities));
		
		// .clear()
		list.clear(); print(10, list);
		
		// .isEmpty() => 배열이 비어있는지 여부를 true/false로 알려줌
		System.out.println("11 :" + list.isEmpty());  
		
		list.add("파리");
		list.add("방콕");
		list.add("LA");
		
		
		List<String> list2 = Arrays.asList("서울","뉴욕","상해");
		print(12, list2);
		
		list.addAll(list2); print(13, list);
		
		
		System.out.println("14 : "+ list.containsAll(list2));
		
		list.retainAll(list2); print(15, list);
		
		
		list.removeAll(list2); print(16, list);
		
		
		
		
		
		
	}

	private static void print(int i, List<String> list) {
		System.out.println(i +" : " + list);
		
	}
}
