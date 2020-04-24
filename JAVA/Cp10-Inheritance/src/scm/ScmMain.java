package scm;

public class ScmMain {

	public static void main(String[] args) {


		// 상속관계에서 "다형성":
		// 상위클래스 타입의 참조변수 = 하위클래스의 인스턴스
		
		// 생성자의 가격을 넣어줌
		Product p = new Tv(100);
		
		//System.out.println(p1);

		Tv tv = new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);
		
		//효율적x, 반복문o -> 배열o
		int sum = tv.price+com.price+aud.price;
		
		Product p1 = (Product)tv; //자바에서 자동으로 형변환 해준다.(Product)
		Product p2 = com;
		Product p3 = aud;
	
		// 상위클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(200);
		products[2] = new Audio(300);
		
		
		
		// 참조변수에 따라서 맞는 참조변수만 ...
		// products[0].display();
		// 명시적인 형변환. 상위타입의 변수 -> 하위타입의 변수로 바꿔 줄 때 명시적으로 해 줘야한다.
		// instanceof 연산자 -> ex) p1 instanceof Computer ==> true/false
		// 참조변수가 참조하는 인스턴스를 특정 클래스 타입으로 형변환 가능한지 여부를 확인 
		
		// 전달하는 배열에 컴퓨터가 있다면 프로그래밍을 하겠다.
		for(int i=0; i<products.length; i++) {
			
			if(products[i] instanceof Computer) {
				((Computer)products[i]).programming();
			}
		}
		
		
		System.out.println("==============================");
		System.out.println("==============================");
		
		
		
		// 금액,포인트의 합
		int sumOfPrice = 0;
		int sumOfBonusPoint = 0;
		
//		for(int i=0; i<products.length; i++) {//0번지부터 일괄처리, 리스트,합계,기타포인트 출력
//			System.out.println(products[i]); // 각각의 요소들이 출력 될 것이다.
//			sumOfPrice += products[i].price; //금액의 합 출력
//			sumOfBonusPoint += products[i].bonusPoint; //포인트의 합
//		}
		
//		System.out.println("전체 제품의 가격의 합은 : " + sumOfPrice);
//		System.out.println("전체 포인트의 합은 : " + sumOfBonusPoint);
		
		
		
		// 구매자가 제품을 구매하는 시뮬레이션
		// 구매자 생성
		Buyer buyer = new Buyer();
		//제품 생성
		Tv product1 = new Tv(200);
		Computer product2 = new Computer(250);
		Audio product3 = new Audio(100);
		
		// Tv구매
		buyer.buy(product1);
		// Computer구매
		buyer.buy(product2);
		// Audio구매
		buyer.buy(product3);
		// Computer구매
		buyer.buy(product2);
		
//		System.out.println("현재 보유 금액 : " +buyer.money);
//		System.out.println("현재 보유 포인트 : " +buyer.bonusPoint);	
		
		buyer.summary();
	}

}
