package ex01.collection.set;
//Set: 순서 없고, 중복 허용 X

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
	Object[] objArr = {"1", new Integer(1), "2", "3","3","4","4","4"};
		
		Set set = new HashSet();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);  //set에 2,3,4,4,4 순으로 넣음
			
			System.out.println(set);
			//1은 자료형과 정수형 두 개가 찍히고, 4는 중복 제거됨
		}
	 	
	}
	
}
