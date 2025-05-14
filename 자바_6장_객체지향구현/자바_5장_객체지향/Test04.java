package 자바_5장_객체지향;

public class Test04 {
	
	
 public static void main(String[] args) {
	 
	 System.out.println(test(1));
	 System.out.println(test(1,2));
	 System.out.println(test(1,2,3));
	 System.out.println(test(1,2,3,4));
 }
		
 static int test(int... v) {
	 
	 System.out.print("합" + v.length + " : ");
	 // v.length = 배열의 길이
	 
	 
	 int sum =0;
	 
	 for(int x : v) {
		 
		 sum += x;
		 System.out.print(x + " ");
	 }
	 System.out.println(); 
	 return sum;
 }
}
