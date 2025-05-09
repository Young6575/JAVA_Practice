package 자바_2장_데이터활용;

public class Test2 {

	
public static void main(String[] args) {
	
	int depositAmount;
	depositAmount = 50000;
	System.out.println(depositAmount);
	
	
	boolean isMarried;
	isMarried = false;
	System.out.print("\n isMarried = " + isMarried);
	
	
	char gender;
	gender = 'A';
	int num = gender;
	num = num + 1;
	gender = (char)num; // 4바이트를 2바이트 저장할려고 하니 정보 손실 발생 > 오류
	// type casting이라고 한다.
	
	System.out.print("\n\t" + gender + "(" + num + ")");
	
	
	String gretting = "Good  Morning";
			
			System.out.println("\n" + gretting);
	
	}
}
