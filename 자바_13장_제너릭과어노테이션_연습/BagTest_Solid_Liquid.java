package 자바_13장_제너릭과어노테이션_연습;

import java.security.PrivateKey;

class Bag<T extends Solid> {
	private T thing;
	private String owner;
	
	public Bag(T thing) {
		this.thing = thing;	}
	
	public T getThing() {
		return thing;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	String isSameOwner(Bag<?> obj) {
		if(this.owner.equals(obj.getOwner()))
			return "소유자가 동일합니다.";
		return "소유자가 동일합니다.";
	}
	
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Solid {}
class Liquid {}

class Book extends Solid{}
class PencilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Liquid {}
class Coffee extends Liquid {}

public class BagTest_Solid_Liquid {
	
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

//		Bag<Water> bag4 = new Bag<>(new Water());
//		Bag<Coffee> bag5 = new Bag<>(new Coffee());
		
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		bag.isSameOwner(bag2);
	

	
	
		

	}
	
}
