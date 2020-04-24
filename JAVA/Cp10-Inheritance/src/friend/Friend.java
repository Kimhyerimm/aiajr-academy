package friend;


/*
 	친구의 정보를 저장하기 위한 클래스
 	상속을 목적으로 기본 클래스 정의 
	기본 속성과 기능을 구성
	
	대학 = 친구(상위클래스:친구정보(기본 변수들,메서드 => 1.대학친구 2.고교친구)
	이름, 전번, 주소, 이메일, 전공, 학년
	
	고교 = 친구
	이름,전번,주소,직업
*/
public class Friend {
	
	
	String name; 	 // 친구의 이름
	String phoneNum; // 친구의 전화번호
	// address 두 번째 모음 앞에서 끊어준다 -> addr
	String addr; 	 // 친구의 주소
	
	// 생성자
	Friend(String name, String phoneNum, String addr){
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
	}

	void showBasicInfo() { // 하나하나 출력
		System.out.println("이름: " +this.name);
		System.out.println("전화번호: " +this.phoneNum);
		System.out.println("주소: " +this.addr);
	}
	
	// 상속의 목적으로 오버라이딩 할 메서드
	// 기본데이터와 하위클래스의 데이터를 출력하도록 오버라이딩 한다.
	void showData() {
		
	}









}