package 자바_7장_상속과인터페이스.inheritance;

public  class Person {

		public String name;
		public int age;
		
		public Person() {
			System.out.println("Person() 생성자 실행");
		}
		
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
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
		
		public  String toString() {
			return name + " : " +age;
		}
}



