package 자바_3장_제어문;

public class Test22 {
	public static void main(String[] args) {
		
		int a = 12;
		int b = 2;
		char op ='1';
		
		switch(op) {
			case '+':
				System.out.println(a + b); break;
			case '-':
				System.out.println(a - b); break;
			case '*':
				System.out.println(a * b); break;
			case '/':
				System.out.println(a / b); break;
			default :
				System.out.println("부호를 입력해 주세요");
		}
		
		
		
	}
	
}
