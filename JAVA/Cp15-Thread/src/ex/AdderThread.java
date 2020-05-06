package ex;

public class AdderThread extends Sum implements Runnable {

	int start, end;

	// int num;
	// addNum, getNum 메서드를 가지고 있다.

	public AdderThread(int start, int end) {
		this.start = start; // 초기화
		this.end = end; // 초기화
	}

	@Override
	public void run() {
		// 새롭게 흐름을 만드는 작업을 반복하자
		for (int i = start; i <= end; i++) {
			addNum(i); // Sum 이라는 클래스에 상속받은 메서드
		}

	}

}
