package ex;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTet {

	public static void main(String[] args) {

		// List<E> -> ArrayList<E>
		// List<e> : 저장 순서를 가진다. 데이터의 중복 저장 가능
		// 순서 -> 일괄 처리 가능하다(반복적인 동일한 작업을 빠르게 처리한다)

		// ArayList 인스턴스 생성 : Integer 타입의 객체만 저장
		// ArrayList<Integer> list = new ArrayList<>(); // 인스턴스 생성시에 자료형 생략 가능하다.
		// List<Integer> list = new ArrayList<>(); // 다형성

		// ArrayList<Integer> list = new ArrayList<Integer>();

		LinkedList<Integer> list = new LinkedList<Integer>();

		// List<E> 정의된 메서드 ->
		// add(E):인스턴스의 저장(참조값 저장)
		// remove(index):해당 index의 요소를 삭제
		// size():List 요소의 개수를 반환 해 준다
		// get(index):해당 index위치의 요소반환

		// 데이터의 저장 : 저장의 순서를 가지고 있다.
		// Auto Boxing
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));

		// 데이터의 참조
		System.out.println("저장 된 데이터를 확인 합니다.");
		// 반복문을 통해서 일괄 참조가 가능하다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-------------------------------");

		// 데이터의 삭제
		list.remove(1);
		System.out.println("데이터 삭제 후 데이터를 확인합니다.");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Iterator를 이용한 모든 요소 출력");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
	}
	
}
