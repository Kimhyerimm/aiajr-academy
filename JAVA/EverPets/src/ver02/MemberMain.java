package ver02;

public class MemberMain {

	public static void main(String[] args) {

		MemberManager manager = new MemberManager();
		
		MemberInfor info = null;
		
		while(true) {
			info = manager.createInstance();
			info.showInfo();
		break;
		}
		
		}
	}