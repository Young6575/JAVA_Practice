package 자바_3장_제어문;

public class 구구단 {
	
	public static void main(String[] args) {
		
		int firstNum;
		int secondNum;
		
		
		for (secondNum = 2; secondNum<10; secondNum++) {
			
		for (firstNum = 1; firstNum<10; firstNum++) {
			
			if (firstNum ==1) {
				System.out.println("[" + secondNum + "단" + "]");
			}
			
			System.out.println(secondNum + " X " + firstNum + " = " + secondNum * firstNum);
			
		}
		
		 System.out.print('\n');
		
		}
		
	}

}
