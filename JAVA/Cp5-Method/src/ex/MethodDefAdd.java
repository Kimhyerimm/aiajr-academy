package ex;

public class MethodDefAdd {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
	
		 hiEveryone(7, 110.5);
		 hiEveryone(21, 178.2);
		 hiEveryone(23, 162.4);
		 hiEveryone(26, 176.3);
		 hiEveryone(16, 152.4);
		 hiEveryone(18, 184.2);
		 
		
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 19세 입니다." );
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 28세 입니다." );
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 22세 입니다." );
//		System.out.println("좋은 아침입니다.");
//		System.out.println("제 나이는 16세 입니다." );
	
		System.out.println("프로그램 종료");
	}

	//인사말 출력, 나이값을 받아서 나이를 출력하는 메서드
	static void hiEveryone(int age, double height) {
		System.out.println("안녕하세요.");
		
		if(age<10) {
			return;
		}
		System.out.println("제 나이는 "+age+"세 입니다." );
		System.out.println("저의 키는 "+height+ "cm 입니다.");
	}

}
