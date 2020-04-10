package ex1;

public class Test4 {

	public static void main(String[] args) {
		
			char ch1='A'; // 문자타입의 변수 ch1선언,초기화 'A'저장, 대입
			char ch2='Z';
			int num1=ch1;  //ch1 char --> int
			int num2=(int)ch2; //명시적 형변환
			 System.out.println("문자 A의 유니코드 값: "+num1);
			 System.out.println("문자 Z의 유니코드 값: "+num2);
			}
			}