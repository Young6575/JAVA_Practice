package 자바_6장_객체지향구현;

class Person {

	String name;
	int age;
	float weight;
	String[] subjects;
	int[] years;
	String[] addsubjects;
	int[] addyears;

	public void show() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("몸무게:" + weight);

		System.out.print("수강과목 : ");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + "(" + years[i] + ")" + " / ");
		}

		System.out.println('\n');
		
		
	}

	void addSubjectYear(String subject, int year) {
		

		for (int i = 0; i <= subjects.length; i++) {

			if (i == subjects.length) {
				addsubjects[i] = subject;
				addyears[i] = year;
			}
			addsubjects[i] = subjects[i];
			addyears[i] = years[i];


		}

		System.out.print("추가된 과목정보 : ");
		for (int i = 0; i < addsubjects.length + 1; i++) {
			System.out.print(addsubjects[i] + "(" + addyears[i] + ")" + " / ");

		}

	}
}

public class 실습_5_3_배열필드 {

	public static void main(String[] args) {

		// 첫 번째 객체 생성 및 초기화
		Person p1 = new Person();
		// 다음 코드를 setter, addSubjectYear를 사용하여 수정
		p1.name = "홍길동";
		p1.age = 25;
		p1.weight = 60.56f;
		p1.subjects = new String[] { "Mathematics", "Science", "History" };
		p1.years = new int[] { 2020, 2021, 2022 };

		// 메소드 호출
		p1.show();
		p1.addSubjectYear("수학", 1999);

		// 두 번째 객체 생성 및 초기화
		Person p2 = new Person();
		p2.name = "강감찬";
		p2.age = 55;
		p2.weight = 62.34f;
		p2.subjects = new String[] { "Literature", "Philosophy", "Physics" };
		p2.years = new int[] { 2018, 2019, 2020 };

		// 메소드 호출
		p2.show();
	}
}
