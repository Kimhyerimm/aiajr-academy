package ex;

public class SwitchCaseBreak {

	public static void main(String[] args) {

		int menuNum = 3;
		
		switch(menuNum) {
		
		case 1 :
			System.out.println("1. Simple JAVA");
		case 2 :
			System.out.println("2. Funny JAVA");
		case 3 :
			System.out.println("3. Fantastic JAVA");
		default :
			System.out.println("d. The Best Programming Lanaguage");
			
		}
		
		System.out.println("Do you like coffee?");

	}

}
