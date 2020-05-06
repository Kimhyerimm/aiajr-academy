package ex;

public class Sum {

	long num;

	Sum() {
		num = 0;// num=합의결과를 가지는 변수...초기화
	}

	void addNum(long n) {
		num += n; // num = num + n;
	}

	long getNum() {
		return num;
	}
}
