package 자바_7장_상속과인터페이스.실습;

class Item { // 제품
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}



	public Item(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;

		
	}
	
	

	// 재고 감소 메소드
	public void reduceStock(Item item,int quantity) {
		
		Item itme;
		int fixquantity;
		
		item.stockQuantity = item.stockQuantity-quantity;
		
		System.out.println(item.name+ "의수량감소: " + item.stockQuantity);
		
		
	}

	// 재고 증가 메소드
	public void increaseStock(Item item,int quantity) {
		
		Item itme;
		int fixquantity;
		
		item.stockQuantity = item.stockQuantity+quantity;
		
		System.out.println(item.name+ "의수량증가: " + item.stockQuantity);
		
	}

	// 정보 출력 메소드
	public void show() {
		
		System.out.println("[제품 기본정보]");
		System.out.println("제품명: "+name + " 단가: "+price + " 재고수량: "+stockQuantity);

			
			
//		for (int i=0;i<5;i++) {
//			System.out.println("제품명: "+name + "단가: "+price + "재고수량: "+stockQuantity);
//		}
			
		
	}

	@Override
	public String toString() {
		return "제품명 : " + name + "단가 : " + price + "재고수량 : " + stockQuantity;
	}

	// 접근자 메소드
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

//
//
//

class Customer {
	private String cname;
	private String city;
	private int age;

	public Customer(String cname, String city, int age) {
		this.cname = cname;
		this.city = city;
		this.age = age;
	}

	public String getCname() {
		return cname;
	}

	// 정보 출력 메소드
	public void show() {

	}

	@Override
	public String toString() {
		return "고갱명 : " + cname + "지역 : " + city + "나이 : " + age;

	}
}
//
//
//

class Order {
	private String customer; // 고객
	private Item[] items; // 주문 제품들
	private int[] quantities; // 주문 제품 수량들
	private String[] orderDates;
	private int count = 0; // 아이템 개수

	private Item[] preItem;
	private int[] prequantities;
	private String[] preorderDates;

	public Order(Customer customeid, int itemnum) {

		this.customer = customeid.getCname();
//		this.count = itemnum;

		System.out.println("[" + customer + "님의 주문목록" + "]");
	}

	// 아이템 추가 메소드
	public void addItem(Item item, int orderQuantity) {

		
		if (count != 0) {

			
			// 이전 데이터 백업
			prequantities = quantities;
			preItem = items;
			preorderDates = orderDates;

			// 배열 재정의
			items = new Item[count + 1];
			quantities = new int[count + 1];
			orderDates = new String[count + 1];

			// 이전 내역 붙여넣기
			for (int i = 0; i < count; i++) {
				items[i] = preItem[i];
				quantities[i] = prequantities[i];
				orderDates[i] = preorderDates[i];
			}
			// 신규 내역 추가
			items[count] = item;
			quantities[count] = orderQuantity;
			orderDates[count] = "5.16";
		} else {

			items = new Item[1];
			quantities = new int[1];
			orderDates = new String[1];

			items[0] = item;
			quantities[0] = orderQuantity;
			orderDates[0] = "5.16";
		}
		this.count += 1;

	}

	// 총액 계산 메소드
	public double calculateTotal() {
		
		int sumTotal=0;
		
		for (int i=0;i<count;i++) {
			
			sumTotal += items[i].getPrice() * quantities[i];
		}
		
		return sumTotal;
	}

	// 주문 요약 출력 메소드
	public void printOrderSummary() {

		System.out.println("고객명 :" + customer);

		for (int i = 0; i < count; i++) {

			System.out.print("제품명: " + items[i].getName() + ", ");
			System.out.print("단가: " + items[i].getPrice() + ", ");
			System.out.print("수량: " + quantities[i] + ", ");
			System.out.print("총 가격: " + items[i].getPrice() * quantities[i] + ", ");
			System.out.println("주문일: " + orderDates[i]);

		}
		System.out.println("총액: " + calculateTotal());
		System.out.println("--------------------------------");
	}
}

//
//
//
public class 실습과제_7장_B1_객체생성 {

	public static void main(String[] args) {
		// 아이템 생성
		Item laptop = new Item("노트북", 1200.00, 10);
		Item tshirt = new Item("티셔츠", 20.00, 50);
		Item phone = new Item("휴대폰", 800.00, 30);
		Item headphones = new Item("헤드폰", 150.00, 20);
		Item mouse = new Item("마우스", 30.00, 15);

//		// 고객 생성
		Customer boy = new Customer("홍길동", "부산", 21);
		Customer girl = new Customer("계백", "양산", 22);
//
//		// 주문 생성
		Order order1 = new Order(boy, 5); // 최대 5개 아이템
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);
//		order1.addItem(phone, 1);
//		order1.addItem(headphones, 1);
//		order1.addItem(mouse, 2);

		Order order2 = new Order(girl, 5); // 최대 5개 아이템
		order2.addItem(laptop, 1);
		order2.addItem(tshirt, 1);
		order2.addItem(phone, 1);
		order2.addItem(headphones, 1);
		order2.addItem(mouse, 1);
//
//		 주문 요약 출력
		order1.printOrderSummary();
		order2.printOrderSummary();

		// 아이템 감소
		laptop.reduceStock(laptop,2);
		laptop.increaseStock(laptop,3);
		laptop.show();
		
		
		
		
		
		
		
	}
}
