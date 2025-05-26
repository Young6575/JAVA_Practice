package 자바_13장_제너릭과어노테이션;

class StringUtil {
	private String value;
	
	<T extends CharSequence> StringUtil(T value) {
		this.value = value.toString();
	}
	
	void printVal() {
		System.out.println("value:" + value);
	}
}


public class GenConsTest {

	public static void main(String[] args) {
		String s = new String("서울");
		StringBuffer sBuffer = new StringBuffer("대전");
		StringBuilder sBuilder = new StringBuilder("대구");
		
		StringUtil su1 = new StringUtil(s);
		StringUtil su2 = new StringUtil(sBuffer);
		StringUtil su3 = new StringUtil(sBuilder);
		
		su1.printVal();
		su2.printVal();
		su3.printVal();
	}
		
}
