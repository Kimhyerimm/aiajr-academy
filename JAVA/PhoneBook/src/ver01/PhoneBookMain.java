package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {

		PhoneInfor info = 
				new PhoneInfor(
						"손흥민",
						"000-9999-8888",
						"2000.11.11");
		
		info.showInfo();
						
		System.out.println("------------------");
		
		info = new PhoneInfor("박지성", "000-8888-7777");
		info.showInfo();
	}

}

