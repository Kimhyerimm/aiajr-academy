package membership;


// 회원 정보를 저장하기 위한 클래스 생성
public class Member {
	// static은 변수가 하나만 만들어지는것. 현재는 고유한 변수들을 만든다.
	String memberId;
	String memberName;
	String memberEmail;
	
	// 생성자(초기화 메서드)
	Member(String memberId, String memberName, String memberEmail) {
		// this는 나 자신을 가리키는 참조변수,주소값
		this.memberId=memberId;
		this.memberName=memberName;
		this.memberEmail=memberEmail;
		}
	
	void showInfo() {
		System.out.println("아이디 : " +this.memberId);
		System.out.println("이  름 : " +this.memberName);
		System.out.println("이메일 : " +this.memberEmail);
	}
	//Alt+Shift+s -> toString
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}
	
}
