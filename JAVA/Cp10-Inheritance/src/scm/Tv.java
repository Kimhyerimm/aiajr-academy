package scm;

// 상위클래스에 있는 생성자는 초기화 해주어야 한다.
public class Tv extends Product {
	
	Tv(int price) {
		super(price);
	}
	
	//toString: 이 제품이 무엇을 의미하는지.
	//Product를 toString 해도 Tv가 나온다.
	public String toString() {
		return"Tv";	
	}
	
	void display() {
		System.out.println("Tv를 시청합니다.");
	}
	
}

