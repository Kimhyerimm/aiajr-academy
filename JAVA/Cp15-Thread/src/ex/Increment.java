package ex;

public class Increment {

	int num = 0;

	// synchronized가 동시참조를 막아준다.
	// synchronized void increment() {
	void increment() {

		synchronized (this) {
			num++;
		}

	}

	int getNum() {
		return num;
	}

}
