package ex;

public class ThreadMain2 {

	public static void main(String[] args) {

		// Runnable을 구현하는 인스턴스 생성 <-Thread만들기위해서는 Runnable쓴다.
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);

		// Thread 인스턴스 생성 -> 흐름&실행은 x
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);

		// 실행의 흐름 생성
		t1.start(); // run()메서드를 호출해서 프로그램을 실행하게 된다.
		t2.start();

		try {
			t1.join(); // t2,main대기
			t2.join(); // main대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("1~100까지의 합 : " + (at1.getNum() + at2.getNum())); // 1~50,51~100까지의 합
	}

}
