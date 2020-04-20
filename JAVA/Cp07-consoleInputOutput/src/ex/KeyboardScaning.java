package ex;

import java.util.Scanner;

public class KeyboardScaning {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ctrl+shift+O
		// 하고싶은 맨끝에서 ctrl+space
		System.out.println("숫자를 입력 해 주세요.");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력 해 주세요.");
		int num2 = sc.nextInt();
		System.out.println("숫자를 입력 해 주세요.");
		int num3 = sc.nextInt();
	
		int sum = num1 + num2 + num3;
		System.out.printf("입력된 정수 %d, %d, %d 입니다. 숫자들의 합은 %d 입니다.",
				num1,num2,num3,sum);
	}

}
