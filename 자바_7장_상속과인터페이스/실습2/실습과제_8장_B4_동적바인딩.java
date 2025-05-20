package 자바_7장_상속과인터페이스.실습2;

//2단계 - 문제 4: 동적바인딩
//Item 추상 클래스
abstract class Item {
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량

	public Item(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void reduceStock(int quantity) {
		stockQuantity -= quantity;
	}

	public void show() {
		System.out.print("제품명: " + name + "가격: " + price + "재고량: " + stockQuantity);
	}
}

//Electronics 클래스: Item 클래스 상속
class Electronics extends Item {
	int madeYear;

	public Electronics(String name, double price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear = madeYear;

	}

	@Override
	public void show() {
		super.show();
		System.out.println(" 제작연도: " + madeYear);
	}
}

//Clothing 클래스: Item 클래스 상속
class Clothing extends Item {

	int size;

	public Clothing(String name, double price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size = size;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(" 사이즈: " + size);
	}
}

//Discountable 인터페이스 정의
interface Discountable {
	double getDiscountedPrice(double price);
}

//SeasonalDiscount 클래스: Discountable 인터페이스 구현
class SeasonalDiscount implements Discountable {
	private double discountRate;

	public SeasonalDiscount(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public double getDiscountedPrice(double price) {
		return price * discountRate;
	}

}

class Order extends SeasonalDiscount {
	
	private final int N = 20;
	private Customer customer; // 고객명
	private Item[] items; // 주문 제품들
	private int[] quantities; // 주문 제품 수량들
	private String[] orderDates; // 주문일자들
	private int count = 0;
	double sumTotal;

	public Order(Customer customer) {
		super(0.1);
		this.customer = customer;
		this.items = new Item[N]; // N 크기의 Item 배열 생성
		this.quantities = new int[N]; // N 크기의 int 배열 생성
		this.orderDates = new String[N]; // N 크기의 String 배열 생성
	}

	public void addItem(Item item, int quantity, String date) {
		items[count] = item;
		quantities[count] = quantity;
		orderDates[count] = date;

		item.reduceStock(quantity);
		
		count++;
	}

	public double calculateTotal() {

		sumTotal = 0;
		// 할인없이 수량 단가로 비용 계산
		for (int i = 0; i < count; i++) {

			sumTotal += items[i].getPrice() * quantities[i];

		}
		return sumTotal;
	}

	public void printOrderSummary() {
		System.out.println("[" + customer.getName() + "님의 주문내역]");

		for (int i = 0; i < count; i++) {
			System.out.println("제품명: " + items[i].getName() + ", " + "주문수량: " + quantities[i] + ", " + "주문날짜: "
					+ orderDates[i] + " 합계: " + items[i].getPrice() * quantities[i]);

		}

	}

	// 할인된 내역을 출력하는 메소드
	public void printDiscountDetails() {
		

		// 정가 - 시즌 할인 적용 - 고객 할인 적용 => 할인된 가격 * 수량 > 총 지불 금액
		//정가
		
		//할인된 가격
		System.out.print("할인된 가격: ");
		System.out.println(calculateTotal()
				- super.getDiscountedPrice(calculateTotal()) //시즌 할인 적용
				- customer.applyDiscount(super.getDiscountedPrice(calculateTotal()))); //고객 할인 적용

		System.out.println(customer.applyDiscount(10));

	}

}

// Customer 추상 클래스 정의
abstract class Customer {
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract double applyDiscount(double totalAmount);
}

// RegularCustomer 클래스: Customer 클래스를 상속받음
class RegularCustomer extends Customer {
	static final double REGULARDISCOUNT_RATE = 0.03;

	public RegularCustomer(String name) {
		super(name);
	}

	@Override
	double applyDiscount(double totalAmount) {
		
		
		return totalAmount * REGULARDISCOUNT_RATE;
	}

}

// PremiumCustomer 클래스: Customer 클래스를 상속받음
class PremiumCustomer extends Customer {

	static final double PREMIUMDISCOUNT_RATE = 0.1;

	public PremiumCustomer(String name) {
		super(name);

	}

	@Override
	double applyDiscount(double totalAmount) {
		return totalAmount * PREMIUMDISCOUNT_RATE;
	}

}

public class 실습과제_8장_B4_동적바인딩 {
	static void showItemsStock(Item[] items) {
		// 모든 아이템의 이름과 재고량, 가격 출력
		for (Item item : items) {
			item.show(); // 동적 바인딩에 의해 각 클래스의 show() 메서드가 호출됨
		}
	}

	public static void main(String[] args) {
		// Item 타입의 배열 생성
		Item[] items = new Item[4];

		// 배열에 전자제품과 의류패션 객체 추가
		items[0] = new Electronics("노트북", 1500, 100, 23);
		items[1] = new Clothing("티셔츠", 50, 100, 95);
		items[2] = new Electronics("휴대폰", 800, 100, 24);
		items[3] = new Clothing("청바지", 80, 100, 90);

		// 모든 아이템의 이름과 재고량, 가격 출력
		showItemsStock(items);

		// 고객 생성
		Customer regularCustomer = new RegularCustomer("홍길동");
		Customer premiumCustomer = new PremiumCustomer("강감찬");

		// 주문 생성 및 계산 (RegularCustomer)
		Order regularOrder = new Order(regularCustomer);
		regularOrder.addItem(items[0], 1, "240901");
		regularOrder.addItem(items[1], 2, "240902");

		regularOrder.printOrderSummary();
		regularOrder.printDiscountDetails(); // 할인된 내역 출력

		// 주문 생성 및 계산 (PremiumCustomer)
		Order premiumOrder = new Order(premiumCustomer);
		premiumOrder.addItem(items[1], 1, "240901");
		premiumOrder.addItem(items[3], 2, "240903");

		premiumOrder.printOrderSummary();
		premiumOrder.printDiscountDetails(); // 할인된 내역 출

		// 모든 아이템의 이름과 재고량, 가격 출력
		showItemsStock(items);
		

	}
}
