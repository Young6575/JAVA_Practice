package 자바_8장_내부클래스.실습;

enum Status {
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest01 {

	public static void main(String[] args) {
		Status work = null;

		int n = 2;

		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
		}
		System.out.println("현재 작업 상태 : " + work);
	}

}
