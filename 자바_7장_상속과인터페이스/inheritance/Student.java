package 자바_7장_상속과인터페이스.inheritance;

public class Student extends Person {
	
	private String major;
	
	public Student() {
		System.out.println("Student 생성자 실행");
	}

	public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
		System.out.println("Student 생성자 실행");
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " : " + major;
	}

}
