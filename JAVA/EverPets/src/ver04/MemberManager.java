package ver04;

import java.util.*;
/*
 *  PhonebookManager 목적
 전화번호 정보를 저장하는 기능만을 포함하는 클래스
 1. 사용자로부터 데이터를 받아서 인스턴스를 생성하고 반환하는 기능
 */

public class MemberManager {

	final MemberInfor[] mBooks;

	// 입력된 친구의 정보 개수 --> 입력된 배열의 요소 개수
	// 1. 참조할 때 반복의 횟수
	// 2. 새로운 객체를 저장할 때 index로 사용

	int cnt = 0;

	Scanner sc;

	public MemberManager() {

		// 배열 초기화
		mBooks = new MemberInfor[100];
		// 저장개수 초기화
		cnt = 0;
		// Scanner 객체 초기화
		sc = new Scanner(System.in);

	}

	// 저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장
	// 배열에 PhoneInfor 타입의 참조값을 저장
	void addInfo(MemberInfor info) {

		// 배열에 요소 대입
		mBooks[cnt] = info;

		// 등록된 정보의 개수를 증가
		cnt++;

	}

	void addInfo() {

		// 배열에 요소 대입
		mBooks[cnt] = createInstance();

		// 등록된 정보의 개수를 증가
		cnt++;

	}

	// 사용자의 입력데이터로 PhoneInfor 객체를 생성
	MemberInfor createInstance() {

		MemberInfor info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("회원의 정보를 입력 해주세요.");

		System.out.println("아이디를 입력해주세요. >> ");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력해주세요. >> ");
		String password = sc.nextLine();

		System.out.println("이름을 입력해주세요. >> ");
		String name = sc.nextLine();

		System.out.println("전화번호를 입력해주세요. >> ");
		String phoneNumber = sc.nextLine();

		info = new MemberInfor(id, password, name, phoneNumber);

		return info;

	}

	// 전체 리스트 출력
	void showAllData() {

		// 전체 데이터 --> 입력된 데이터의 개수 cnt
		for (int i = 0; i < cnt; i++) {
			mBooks[i].showInfo();
			System.out.println("-----------------------------");
		}

	}

	// 배열에서 이름을 기준으로 검색 후 index 값을 반환
	int searchIndex(String id) {

		int searchIndex = -1;

		// 사용자가 입력한 이름으로 배열에 요소를 검색 --> index를 찾아야함
		for (int i = 0; i < cnt; i++) {
			if (mBooks[i].checkId(id)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}

	// 검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
	// 배열의 요소(PhoneInfor)의 name 속성 값으로 배열의 요소를 찾음
	void searchInfo() {

		System.out.println("검색하고자하는 아이디를 입력 해 주세요");
		String id = sc.nextLine();

		int searchIndex = searchIndex(id);

		if (searchIndex >= 0) {
			mBooks[searchIndex].showInfo();
		} else {
			
			System.out.println("찾으시는 아이디의 데이터가 존재하지 않습니다");
		}

	}

	// 삭제: 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제
	void deleteInfo() {

		System.out.println("삭제하고자하는 아이디를 입력해주세요");
		String id = sc.nextLine();

		int searchIndex = searchIndex(id);

		// 삭제
		// pBooks[2] : 삭제, pBooks[2] = null
		// 데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
		// 재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.

		if (searchIndex >= 0) {

			// 삭제 : 검색한 index부터 저장된 위치까지 왼쪽으로 시프트
			for (int i = searchIndex; i < cnt - 1; i++) {
				mBooks[i] = mBooks[i + 1];
			}

			// 저장된 정보의 개수를 -1
			cnt--;

			System.out.println("요청하신 아이디의 정보를 삭제했습니다");
		} else {

			System.out.println("찾으시는 아이디의 데이터가 존재하지 않습니다");
		}
	}
}
