package ex;

public class InstanceOf {
	
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new PaperBox();
		Box box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	public static void wrapBox(Box box) {
			box.wrap();
	}
	
}


	
class Box {
	//오버라이딩	
	public void wrap() {
		System.out.println("simple wrap");
	}
}
		
		
class PaperBox extends Box {
	// 오버라이딩
	public void wrap() {
		System.out.println("paper wrap");
	}
}
	
		
class GoldPaperBox extends PaperBox {
	// 오버라이딩	
	public void wrap() {
		System.out.println("gold wrap");
	}
}



