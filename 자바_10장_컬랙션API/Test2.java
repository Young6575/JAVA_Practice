package 자바_10장_컬랙션API;

import java.util.ArrayList;
import java.util.HashMap;

class Item {
	String name;
	int pid;
	String etc;

	public Item(String name, int pid, String etc) {
		this.name=name;
		this.pid=pid;
		this.etc=etc;
	}
	
	@Override
	public String toString() {
			
		return name + " : " + pid + " : " + etc ;
	}
}


public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("이름1",100,"XXL"));
		
		for (Item item:list) {
			System.out.println(item);
		}
		
		HashMap<String, Item> map = new HashMap<>();
		
		map.put("itemA",new Item("이름2",100,"XL"));
		map.put("itemB",new Item("이름2",100,"XL"));
	
		System.out.println(map.get("itemA").name);
	}
}
