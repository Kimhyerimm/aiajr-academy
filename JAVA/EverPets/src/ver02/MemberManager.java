package ver02;

import java.util.Scanner;

public class MemberManager {

	Scanner sc = new Scanner(System.in);

	MemberInfor createInstance() { // createInfor

		MemberInfor info = null;

		System.out.println("회원의 정보를 입력 해주세요.");

		System.out.println("아이디를 입력 해 주세요. >> ");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력 해 주세요. >> ");
		String password = sc.nextLine();

		System.out.println("이름을 입력 해 주세요. >> ");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력 해 주세요. >> ");
		String phoneNumber = sc.nextLine();

		info = new MemberInfor(id, password, name, phoneNumber);

		return info;

	}

}
