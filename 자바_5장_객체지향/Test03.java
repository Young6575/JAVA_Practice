package 자바_5장_객체지향;

public class Test03 {
	
	public static void main(String[] args) {
		int a = addNumber(1, 2);
		System.out.println("합 :" + a);
	}

	private static int addNumber(int x, int y) {
		int sum = x+y;
		return sum;
	}
	
}
