package ex;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		
		Integer iValue = 10;  // new Integer(10); Auto Boxing
		Double dValue = 3.14; // new Double(3.14);
		
		System.out.println(iValue.toString());
		System.out.println(dValue.toString());
		
		int num1 = iValue;	 // Auto Unboxing
		double num2 = dValue;
		
		System.out.println(num1);
		System.out.println(num2);

	}
	//기본형 데이터를 다루는 것도 문제 없다 => 인스턴스를 다루는 것

}
