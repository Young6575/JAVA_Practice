package 자바_7장_상속과인터페이스.interface1;

public class GalaxyMessenger implements Messenger, workfile {

	private  String maker = "galaxy";

	private String msg;
	
	@Override
	public String getMessage() {
		return maker + "에서 메시지를 설정합니다 : " + msg;
	}

	@Override
	public void setMessage(String msg) {
		// System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
		this.msg = msg;
	}

	
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void clearMesseage() {
		System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
	}

	public void fileUpload() {
		System.out.println("file을 업로드합니다.");
	}

	public void fileDownload() {
		System.out.println("file을 다운로드합니다.");

	}

}
