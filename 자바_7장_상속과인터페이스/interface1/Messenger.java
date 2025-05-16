package 자바_7장_상속과인터페이스.interface1;

public interface Messenger {

	int MIN_SIZE = 1;
	int MAX_SIZE = 10324543;

	public abstract String getMessage();

	public void setMessage(String msg);

	public default void setLooin(boolean login) {
		log();

		if (login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다.");
		}

	}
	
	
	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}
	
	private void log() {
		System.out.println("start job!");
	}

}

