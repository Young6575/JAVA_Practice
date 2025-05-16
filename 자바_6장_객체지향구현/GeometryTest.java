package 자바_6장_객체지향구현;


interface Geometry {
	double getArea();
}

class Circle implements Geometry {
	int radius;
}

class Triangle implements Geometry {
	int width;
	int height;
}

class Rectangle implements Geometry {
	int width;
	int height;
}

public class GeometryTest {
	public static void main(String[] args) {
		Function<Geometry, Double> func = (g) -> {
// coding
		};
// 반지름이5인원의면적출력
//너비가10, 높이가5인삼각형의면적출력
//너비가10, 높이가5인사각형의면적출력
	}
}