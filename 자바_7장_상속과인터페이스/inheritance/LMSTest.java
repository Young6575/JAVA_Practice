package 자바_7장_상속과인터페이스.inheritance;

public class LMSTest {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
	
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");
		
		
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
	}
	
}
