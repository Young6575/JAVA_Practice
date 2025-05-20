package 자바_8장_내부클래스.실습;

public class OuterClassTest {

	public static void main(String[] args) {

		Messenger test = new Messenger() {

			@Override
			public String getMessage() {
				return "test";
			}

			@Override
			public void setMessage(String msg) {
				System.out.println("test에 메시지를 설정합니다.:" + msg);

			}
		};
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");

	}

}
