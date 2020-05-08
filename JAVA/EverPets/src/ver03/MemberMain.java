package ver03;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		 MemberManager manager = new MemberManager();
		      
		 Scanner sc = new Scanner(System.in);
		      
		      
		    while(true) {
		         
		       Menu.showMenu();
		         
		       int selectNum = sc.nextInt();
		         
		       sc.hasNextLine();
		         
		       switch(selectNum) {
		       case 1:
		          // MemberInfor info = manager.createInstance();
		          // manager.addInfo(info)
		          manager.addInfo();
		         
		          break;
		       }
		    }

	
	}
}