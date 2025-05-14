package 자바_3장_제어문;

public class Test30 {

	public static void main(String[] args) {
		
		int i = 4;
		
		if((i%2)==0 & (i%3)==0) {
			System.out.println("2와 3의 배수입니다");
		}
		
	    if((i%2)==0) {
			System.out.println("2의 배수입니다");
		}
		
		if((i%3)==0) {
			System.out.println("3의 배수입니다");
		}
		
	}
}
