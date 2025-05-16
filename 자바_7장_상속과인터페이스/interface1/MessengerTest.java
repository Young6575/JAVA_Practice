package 자바_7장_상속과인터페이스.interface1;

public class MessengerTest {
	
	public static void main(String[] args) {
		
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기 " + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기 " + Messenger.MAX_SIZE);
		
		
		System.out.println("==========");
		iphone.setLooin(true);
		iphone.setMessage("hello");
		iphone.clearMesseage();
		iphone.fileUpload();
		iphone.fileDownload();
		iphone.draw_textbox();
		iphone.draw_submitButton();
		iphone.getMessage();
		
		System.out.println("==========");
		
		galaxy.setLooin(true);
		galaxy.setMessage("hi");
		galaxy.clearMesseage();
		galaxy.fileUpload();
		galaxy.fileDownload();
		//galaxy.setMaker("삼성 galaxy");
		System.out.println(galaxy.getMessage());
		
	}

}
