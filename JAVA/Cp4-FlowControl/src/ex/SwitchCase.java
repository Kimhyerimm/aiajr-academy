package ex;

public class SwitchCase {

	public static void main(String[] args) {

		int menuNum = 1;
		
		switch(menuNum) {
		
		case 1 :
			System.out.println("1. Simple JAVA");
			break;
		case 2 :
			System.out.println("2. Funny JAVA");
			break;
		case 3 :
			System.out.println("3. Fantastic JAVA");
			break;
		default :
			System.out.println("d. The Best Programming Lanaguage");
			
		}
		
		System.out.println("Do you like coffee?");

	}

}
