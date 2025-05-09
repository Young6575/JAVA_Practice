package 자바_2장_데이터활용;

public class Test7 {

	public static void main(String[] args) {
		
		int a = 10;
		int b,c;
		
		b = a++;
		c = ++a;
		
		System.out.println("a=" +a + ",b =" + b + ", c= " + c);
		
		int num = -a; //negation 연산자
		System.out.println(num);
		
		short snum = -10;
		short snum2 = (short) -snum;
		
		System.out.println(snum2);
		
		long snum3 = snum+10;
		
		System.out.println(snum3);
		
		
		boolean isOn = false;
		boolean result = !isOn;//부정연산자

		
		System.out.println(result);
		
		
		
	}
}
