package op;

public class ArithOp {

	public static void main(String[] args) {
		// 1.정수 타입의 숫자 두개를 받는다.(=사용 해야 한다.) -> 변수 선언
		int num1;
		int num2;
		
		num1 = 10;
		num2 = 3;
		
		// 2.덧셈 연산 -> 결과를 출력하자.
		int result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		// 3.빼기 연산 -> 결과 출력
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		
		// 4.곱하기 연산 -> 결과 출력
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		
		// 5.나누기 연산 -> 결과 출력
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
		
		// 6. 나머지 연산 -> 결과 출력
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result);
		
		
	}

}
