package 자바_6장_객체지향구현;

public class Member {
	private String name;
	private int age;

	public Member() {
		System.out.println("Member() 생성자 실행");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Member(String name) {
		setName(name);
	}
	
	public Member(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println(getName() + " : " + getAge());
	}


	public static void main(String[] args) {
		System.out.println("main() 매서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
		
	}

}
