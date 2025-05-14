package 자바_2장_데이터활용;

public class Test3 {

public static void main(String[] args) {
	
	long totalSales;
	totalSales = 2147483648L; //단순 숫자는 int로 인지한다. 그렇기에 L을 붙여서 Long literal로 인식하도록 한다.
	
	System.out.println(totalSales);

	
		float excahngeRate = 1136.50F;
		
		String name = "Amy";
		String greet = "Hello, how are you! I am Great";
		
		System.out.println(name + "(" + name.length() + ")");
		System.out.println(greet + "(" + greet.length() + ")");
		System.out.println(greet.getBytes());
 }
}
