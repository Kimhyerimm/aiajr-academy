package ver05;

import java.util.InputMismatchException;

import ver05.exception.BadNumberExeption;

public class PhoneBookMain {

   public static void main(String[] args) {
      
      //PhoneBookManager manager = new PhoneBookManager(100);
	   PhoneBookManager manager = PhoneBookManager.gerInstance();
	   
      while(true) {
         
         Menu.showMenu();
         
         int select = 0;
         
         try {
        	 select = manager.kb.nextInt(); //버퍼가 남아있어서 무한반복됨...
        	 
        	 // 정상범위는 1~6
        	 // MenuNum.INSERT ~ MenuNum.EXIT
        	 if(!(select >= MenuNum.INSERT && select <= MenuNum.EXIT)) {
        		 
        		 BadNumberExeption e = new BadNumberExeption("잘못 된 메뉴 입력");
        		 
        		 //강제적인 예외 발생
        		 throw e;
        	 }
        	 
         }catch (InputMismatchException e) {
        	 System.out.println("잘못 된 메뉴 입력 입니다. \n확인하고 다시 입력 해 주세요.");
        	   //manager.kb.nextLine();
        	 continue;
         }catch (BadNumberExeption e) {
        	 System.out.println("메뉴 범위를 벗어난 숫자 입력 입니다.\n확인 후 다시 입력 해 주세요.");
        	 continue;
         } catch (Exception e){ 
        	 System.out.println("잘못 된 메뉴 입력 입니다. \n확인하고 다시 입력 해 주세요.");
        	   //manager.kb.nextLine();
        	 continue;
         }finally {
        	 manager.kb.nextLine();
         }
         
         //manager.kb.nextLine();
         
         
         switch(select) {
         case MenuNum.INSERT:
            manager.createInfo();
            break;
         case MenuNum.SEARCH:
            manager.showInfo();
            break;
         case MenuNum.DELETE:
            manager.deleteInfo();
            break;
         case MenuNum.EDIT:
            manager.editInfo();
            break;
         case MenuNum.PRINT_ALL:
            manager.showAllInfor();
            break;
         case MenuNum.EXIT:
            System.out.println("프로그램을 종료합니다.");
            return;
         }
         
      }

   }

}