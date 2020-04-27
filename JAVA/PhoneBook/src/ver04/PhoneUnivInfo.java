package ver04;

// PhoneInfo 클래스를 상속해서 새로운 클래스를 정의
public class PhoneUnivInfo extends PhoneInfo{

	String major; // 친구의 전공
	String grade; // 친구의 학년
	
	PhoneUnivInfo(
			String name, 
			String phoneNumber, 
			String addr, 
			String email,
			String major,
			String grade) {
		// 상위클래스의 생성자를 호출 해 주어야 한다.
		super(name, phoneNumber, addr, email);
		this.major = major;
		this.grade = grade;
	}

	@Override
	void showAllInfor() {
		super.showAllInfor();
		System.out.println("전공 : " +major);
		System.out.println("학년 : " + grade);
	}
	
	
	
}
