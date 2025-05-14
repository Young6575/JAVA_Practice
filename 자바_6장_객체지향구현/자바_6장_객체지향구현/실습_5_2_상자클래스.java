package 자바_6장_객체지향구현;

///*
// * class Box {
//    // 필드 (속성)
//    double width;  // 가로
//    double height; // 세로
//    double depth;  // 높이
//    // 부피 계산 메소드
//    double getVolume() {
//        return width * height * depth;
//    }
//
//	// 둘레 길이 계산 메소드
//    double getPerimeter() {
//        
//    }
//    
//    // 박스 크기 조정 (메소드 오버로딩)
//    void resize(double newWidth, double newHeight, double newDepth) {
//        //박스의 가로,세로,높이를 변경
//    }
//
//    void resize(double scale) {
//        //박스의 가로,세로,높이를 scale 비율로 변경
//    }
//    
//    void show() {
//    	System.out.println("width="+width+ ", height = " + height + ", depth = " + depth);
//    }
//    
//    @Override
//    String toString() {
//       return "width="+width+ ", height = " + height + ", depth = " + depth;
//    }
// */
//public class 실습_5_2_상자클래스 {
//	public static void main(String[] args) {
//        // 박스 객체 생성
//        Box box1 = new Box(10, 5, 3);
//
//        // 박스 정보 출력
//        box1.show();
//        System.out.println(box1.getVolume());
//        // 박스 크기 변경
//        box1.resize(15, 8, 5);
//        box1.show();
//        System.out.println(box1.getPerimeter());
//        // 박스를 2배 확대
//        box1.resize(0.5);
//        box1.show();
//        
//        Box box2 = new Box(4, 7, 3);
//        System.out.println(box2);
//        //box2.show();
//     // 박스 크기 변경
//        box2.resize(9, 3, 8);
//        System.out.println(box2);
//        //box2.show();
//
//        // 박스를 2배 확대
//        box2.resize(1.5);
//        System.out.println(box2);
//        //box2.show();
//

class Box {

	// 필드 (속성)
	double width; // 가로
	double height; // 세로
	double depth; // 높이
	double volume; // 부피
	double Perimeter; // 둘레
	// 생성자

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		setVolume(width, height, depth);
		setPerimeter(width, height, depth);

		// System.out.println("[" + this.getClass().getSimpleName()+ "]");
	}

	// 박스정보 출력
	public void show() {
		System.out.println("width=" + width + ", height = " + height + ", depth = " + depth);
	}

	// 박스부피
	private void setVolume(double width, double height, double depth) {
		volume = width * height * depth;
	}

	public String getVolume() {
		return "박스 부피 : " + volume;
	}

	// 사이즈 재설정
	public void resize(double scale) {
		this.width = width * scale;
		this.height = height * scale;
		this.depth = depth * scale;
		System.out.println("박스사이즈 비율변경");
	}

	public void resize(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		// System.out.println("박스 사이즈 변경 완료" + "(" + width + "," +height +"," + depth
		// +")");
	}

	// 둘레 계산
	private void setPerimeter(double width, double height, double depth) {
		this.Perimeter = 123;
	}

	public double getPerimeter() {
		return Perimeter;
	}

	public String toString() {
		return "width=" + width + ", height = " + height + ", depth = " + depth;
	}

}

public class 실습_5_2_상자클래스 {

	public static void main(String[] args) {

		// 박스 객체 생성
		Box box1 = new Box(10, 5, 3);

		// 박스 정보 출력
		box1.show();
		System.out.println(box1.getVolume());
//        // 박스 크기 변경
		box1.resize(15, 8, 5);
		box1.show();
		System.out.println(box1.getPerimeter());
//        // 박스를 2배 확대
		box1.resize(0.5);
		box1.show();
        System.out.println('\n');
		
		Box box2 = new Box(4, 7, 3);
		System.out.println(box2);
		box2.show();
//      박스 크기 변경
		box2.resize(9, 3, 8);
		System.out.println(box2);
		box2.show();

		// 박스를 2배 확대
		box2.resize(1.5);
		System.out.println(box2);
		box2.show();

	}

}
