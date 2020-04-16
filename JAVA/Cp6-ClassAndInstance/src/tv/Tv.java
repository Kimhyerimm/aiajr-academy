package tv;

public class Tv {

	// Tv의 속성(변수) -> 멤버 변수, 인스턴스 변수
	String color;	// Tv의 색상 값
	boolean power;	// Tv의 전원 상태
	int channel;	// Tv의 채널 값
	
	// Tv의 기능 -> 메서드, 클래스의 멤버 (멤버끼리는 식별자(이름)만가지고 참조한다)
	// Tv의 전원 키고/끄는 기능
	void power() {
//		if(power==true) {
//			power = false;
//		}else {
//			power = true;
//		}
		
		power = !power;
	}
	
	// 채널을 올리는
	void channelUp( ) {
//		channel = channel + 1;
//		channel += 1;
//		channel++;
		++channel;
	}
	
	// 채널을 내리는 기능
	void channelDown( ) {
		channel--;
	}
	
	//채널 값을 변경하는 : 채널 값을 받아서 변경
	void channelChange(int ch) {
		channel = ch;
	}
}
