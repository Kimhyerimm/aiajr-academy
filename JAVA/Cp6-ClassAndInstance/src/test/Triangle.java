package test;

public class Triangle {

	// 변수 : 밑변, 높이
	int width;	// 밑변의 데이터
	int height; // 높이 데이터
	
	// 생성자 : 인스턴스 생성시에 반드시 한 번 실행 -> 인스턴스변수들의 초기화 작업
	//	   	  생략가능 (default Constructor)
	
	//기본 생성자
	Triangle() {
		
	}
	// 데이터 두개를 받아서 저장하는 생성자(얘 있으면 위에 기본생성자 생략 불가??)
		Triangle(int w, int h){
			width = w;
			height = h;
		}
	
	
	// 밑변과 높이 데이터를 변경하는 메서드
	void setData(int w, int h) {
		width=w;
		height=h;
	}
	
	// 삼각형의 넓이를 구해서 반환하는 메서드, 데이터는 받을 필요없다.
	float area() {
		float result = width*height/2f;
		return result;
	}
	
	public static void main(String[] args) {
	
		// 삼각형 객체 생성
		Triangle t = new Triangle();
		
		// 데이터 설정. 객체에 참조변수 만들어져있으니
		t.setData(5,3);
		System.out.println("삼각형의 밑변 : "+t.width+", 높이는 " +t.height+ " 입니다.");
		
		// 넓이를 구하는 메서드 실행
		System.out.println("삼각형의 넓이는 " +t.area()+ "입니다.");
	}
}
