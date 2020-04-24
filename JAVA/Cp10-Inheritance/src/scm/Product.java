package scm;


// 상품 객체들의 조상클래스(상위클래스)로 정의를 합니다.
public class Product {

	// 의미없는 변수를 자꾸 만들지 말 것, 주석 다는 것을 습관 들일 것
	// final - 생성자 총해서 초기화(?)
	final int price; // 제품의 가격
	final int bonusPoint; // buyer가 가지는 제품의 포인트 

	
	Product(int price){
		this.price = price;
		this.bonusPoint = this.price/10;
	}
	
}
