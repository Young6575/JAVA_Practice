package 자바_6장_객체지향구현;

public class Member {
	private String name;
	private int age;

	public Member() {
		this("guest");
		//System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
		this(name,0);
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " : " + age);
	}


	public static void main(String[] args) {
		System.out.println("main() 매서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
		
	}

}
