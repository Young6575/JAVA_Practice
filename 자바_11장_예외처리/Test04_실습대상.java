package 자바_11장_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//함수에 throw절을 추가하는 경우 - 함수내에서 throw할 수 있고 호출하는 코드에서 예외를 반드시 처리해야 한다
public class Test04_실습대상 {
	
	public static void c() throws Exception {
		System.out.println("c():: 실행");
		throw(new Exception());
	}
	public static void b() throws Exception {
		try {
			c();

		}catch(Exception e) {
			System.out.println("C():: 예외처리");
		}

	}
	
	/*
	public static void main(String[] args)  {
		try {
		//Unhandled exception type FileNotFoundException
			FileInputStream fi = new FileInputStream("a5.txt");//에러 발생 이유
			int c = fi.read();
			System.out.println((char) c);
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fi = new FileInputStream("a1.txt");
		int c = fi.read();
		System.out.println((char) c);
	}
	
}