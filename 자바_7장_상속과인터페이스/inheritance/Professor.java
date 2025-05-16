package 자바_7장_상속과인터페이스.inheritance;

public class Professor extends Person {

	private String subject;
	
	public Professor() {
		System.out.println("Professor 생성자 실행");
	}

	
	public Professor(String name,int age, String subject){
		super(name, age);
		this.subject = subject;
		System.out.println("Professor 생성자 실행");
	}
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + " : " + subject;
	}
	
}
