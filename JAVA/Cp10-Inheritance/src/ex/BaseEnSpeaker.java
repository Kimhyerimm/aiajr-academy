package ex;

public class BaseEnSpeaker extends Speaker{

	private int baseRate;
	
	void setBaseRate(int base) {
		this.baseRate=base;
	}

	@Override //부가적인 속성을 정의 해 주는 것
	void showCurrentState() {
		// TODO Auto-generated method stub
		super.showCurrentState();
		System.out.println("베이스의 크기 : " + baseRate);
	}

	@Override
	public String toString() {
		return "베이스 스피커";
	}
	
}
