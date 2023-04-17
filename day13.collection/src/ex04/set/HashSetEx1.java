package ex04.set;
import java.util.*;
class HashSetEx1 {
	public static void main(String[] args) 	{
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		//자료형이 다르면 중복 혀용한다. "1" /  Integer(1)
		Set set = new HashSet();  //LinkedHashSet 순서를 갖는다.
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]);	
		}
		System.out.println(set);	
	}
}