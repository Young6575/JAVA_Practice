package 자바_7장_상속과인터페이스.abstraction;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee {

	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
	
	
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	
	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager {
	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}

}

public class HRSTest {

	public static void main(String[] args) {

		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();

		
		s.calcSalary();
		s.calcBonus();
		
		System.out.println("==========");
		
		c.calcSalary();
		c.calcBonus();
		
		System.out.println("==========");
		
		d.calcSalary();
		d.calcBonus();

		

	}

}
