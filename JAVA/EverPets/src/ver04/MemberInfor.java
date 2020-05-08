package ver04;

public class MemberInfor {

	private String id;
	private String password;
	private String name;
	private String phonenumber;
	
	//초기화를 위한 생성자
	MemberInfor(String id, String password, String name, String phonenumber ){
		this.id = id;
		this.password = password;
		this.name = name;
		this.phonenumber = phonenumber;
	}
	
	void showInfo() {
		System.out.println("ID : " +id+ "Password : " +password+ "Name : " +name+ "PhoneNumber : " +phonenumber);
	}

	
	// name 속성값과 전달받은 문자열을 비교해서 결과 반환
	   boolean checkId(String id) {
	      return this.id.equals(id);
	   }
	}
