package 자바_6장_객체지향구현;

public class ArmorTest {

	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		
		suit1.setName("mark6");
		suit1.setHeight(180);
		
		suit2.setName("mark16");
		suit2.setHeight(220);
		
		suit3.setName("mark38");
		suit3.setHeight(200);
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit3.getHeight());
		System.out.println(suit2.getName() + " : " + suit3.getHeight());
		
		
		
	}
}
