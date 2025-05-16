package 자바_7장_상속과인터페이스.interface1;

public class IPhoneMessenger extends GrapgIOS implements Messenger {

	@Override
	public String getMessage() {
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println(getMessage()+"에서 메시지를 설정합니다 : " + msg);

	}
	
	public void clearMesseage() {
		System.out.println("좌우로 흔덜어 문자영을 지웁니다.");
	}
	
	public void fileUpload() {
		System.out.println("file을 업로드합니다.");
	}

	public void fileDownload() {
		System.out.println("file을 다운로드합니다.");
		
	}

}
