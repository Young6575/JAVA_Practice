package 자바_10장_컬랙션API;

import java.util.HashMap;

public class Test06 {

	public static void main(String[] args) {
		
		String word[] = {"BUMBLEBEE" , "HEAVEN", "ALTHOUGH", "WONDER"};
		String meaning[] = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		for (int i =0; i< word.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		
		
		System.out.println(dic);
		System.out.println(dic.size());
		
		System.out.println(dic.keySet());
		System.out.println(dic.values());
		
		System.out.println("HEAVEN : " + dic.get("HEAVEN") );
		dic.replace("HEAVEN", "아주 행복한 감정");
		System.out.println("HEAVEN : " + dic.get("HEAVEN") );
		dic.put("HEAVEN", "이상적인 세계");
		System.out.println("HEAVEN : " + dic.get("HEAVEN") );
		
	}
	
}
