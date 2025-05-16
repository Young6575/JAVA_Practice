package 자바_6장_객체지향구현.training;

class Person {

	private String name;
	private int age;
	private float weight;
	private String[] subjects;
	private int[] years;
	private int count;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void show() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("몸무게:" + weight);
		System.out.print("수강과목 : ");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + "(" + years[i] + ")" + " / ");
		}
		System.out.println("\n");
		
		
		System.out.println("While문 활용");
		int i=0;
		while ( i < count) {
			System.out.print(subjects[i] + "(" + years[i] + ")" + " / ");
			i ++;
			
		}
		System.out.println("\n");
	}

	void addSubjectYear(String subject, int year) {
		String[] nSubj = new String[count + 1];
		int[] nYear = new int[count + 1];

		for (int i = 0; i < count; i++) {
			nSubj[i] = subjects[i];
			nYear[i] = years[i];
		}

		nSubj[count] = subject;
		nYear[count] = year;

		subjects = nSubj;
		years = nYear;
		count++;
	}
}

public class 실습_5_3_배열필드 {

	public static void main(String[] args) {

		// 첫 번째 객체 생성 및 초기화
		Person p1 = new Person();
		// 다음 코드를 setter, addSubjectYear를 사용하여 수정
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setWeight(60.56f);
		p1.addSubjectYear("Mathematics", 2020);
		p1.addSubjectYear("Science", 2021);
		p1.addSubjectYear("History", 2022);

		// 메소드 호출
		p1.show();

		// 두 번째 객체 생성 및 초기화
		Person p2 = new Person();
		p2.setName("강감찬");
		p2.setAge(55);
		p2.setWeight(62.34f);
		p2.addSubjectYear("Literature",2018);
		p2.addSubjectYear("Philosophy",2019);
		p2.addSubjectYear("Physics",2020);

		// 메소드 호출
		p2.show();
	}
}
