package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainEntry {
	public static void main	(String[] args) {
		HashSet<String> hs = new HashSet<>(); // 앞에 지정해주면 뒤에는 쓰지 않아도 됨
		
		hs.add("키보드");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("컵");
		hs.add("키보드");
		hs.add("키보드");
		
		System.out.println("요소 개수: " +hs.size());
		System.out.println(hs);
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("String");
		
		
		HashSet hs3 = new HashSet<>();  //type을 입력하지 않으면 모든 타입가능함
		hs3.add(10.0);
		hs3.add(3);
		hs3.add(1000);
//		hs3.add("String");
		
		
		
		//iterator로 값 뽑아내기
		Iterator it = hs.iterator();
		//iterator를 상속받은 객체를 통해서 반환
		while(it.hasNext()) { // 다음 요소가 있다면
			System.out.println(it.next()); 	//요소를 꺼내와서 출력함
		}
		System.out.println();
		it = hs3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
