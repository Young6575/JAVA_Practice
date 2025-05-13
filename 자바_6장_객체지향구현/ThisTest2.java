package 자바_6장_객체지향구현;

public class ThisTest2 {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		ThisTest2 exam = new ThisTest2(); 
			exam.setName("AMY");
			
			System.out.println(exam.getName());
		
	}
	
	
}
