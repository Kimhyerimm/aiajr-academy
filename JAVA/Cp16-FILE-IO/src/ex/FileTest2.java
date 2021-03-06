package ex;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {

		// 폴더 경로 객체 생성
		File myDir = new File("c:\\myJava");
		String[] fNames = myDir.list();
		
//		for(int i=0; i<fNames.length; i++) {
//			System.out.println(fNames[i]);
//		}
		
		File[] files = myDir.listFiles();
		
		for(int i=0; i<files.length; i++) {
			System.out.print(files[i].getName()+"\t");
			if(files[i].isDirectory()) {
				System.out.println("[DIR]\t");
			}else {
				System.out.println("[FILE]\t");
			}
			System.out.println(files[i].getName());
		}
	}

}
