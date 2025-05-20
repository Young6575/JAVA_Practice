package 자바_7장_상속과인터페이스.실습.B2_클래스상속;

 public abstract class Customer2 {
	private String cname;
	private String city;
	private int age;

	public void show() {
		
	}

	@Override
	public String toString() {
		
	}

	abstract double applyDiscount(double totalAmount);
}