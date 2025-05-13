package 자바_6장_객체지향구현;

public class StaticMethodTest {
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
		
	
	}

	public static void print1() {
		System.out.println("hello");
	}

	public void print2() {
		System.out.println("java");
	}
}
