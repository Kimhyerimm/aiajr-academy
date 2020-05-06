package ex;

public class MemberInfor {

	private String id; // 회원의 ID
	private String passWord; // 회원의 비밀번호
	private String name; // 회원의 이름
	private String phoneNumber; // 회원의 전화번호

	// 초기화를 위한 생성자
	MemberInfor(String id, String passWord, String name, String phoneNumber){
		this.id = id;
		this.passWord = passWord;
		this.name = name;
		this.phoneNumber = phoneNumber;
			
			
		}

	void showInfo() {
		System.out.println("id : " + this.id);
		System.out.println("passWord : " + this.passWord);
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
	
	}
}
