package ex;

public class LinkedTest {

	public static void main(String[] args) {

		String str1 = "one";
		String str2 = "two";
		String str3 = "three";
		String str4 = "four";
		
		Data d1 = new Data(str1, str2);
		
		//Data d4 = new Data("four", str2);
		
		Data d2 = new Data(str2, str3);
		Data d3 = new Data(str2, null);
		
		//중간에 삽입
		Data d4 = new Data(str4, str2);
		d1.setNextValue(str3);
		
				

	}

}


class Data{
	
	Object value;
	Object nextValue;
	
	Data(Object obj, Object nextObject){
		this.value = obj;
		this.nextValue = nextValue;
	}
	
	Object getValue() {
		return value;
	}
	
	void setNextValue(Object nextValue) {
		this.nextValue = nextValue;
	}
	
}