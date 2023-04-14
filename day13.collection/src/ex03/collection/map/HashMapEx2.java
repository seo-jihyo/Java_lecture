package ex03.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map =  new HashMap<String, Integer>();   //type parameter는 자료형으로 써야됨
		map.put("재진", new Integer(90));
		map.put("승원", new Integer(100));
		map.put("혁진", new Integer(50));
		map.put("지연", new Integer(70));
		map.put("승현", new Integer(60));
		
		Set set = map.entrySet(); // set에 key, value 다 들어ㅣㅆ음
//		System.out.println(set);
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Name : " +e.getKey() + ",score: " + e.getValue());
		}
		set = map.keySet(); //key값만 얻어옴
		System.out.println("참가자 명단: " + set);//유일(중복안됨)하니까 참가자 명단, 시험 응시자 로 뽑아낼 수 있다
		
		Collection values = map.values(); //value들을 뽑아옴
		it = values.iterator();
		
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue(); //누적함
				
			}
		System.out.println("총점 " + total);
		System.out.println("평균: " +(double) total / set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최하점수: " + Collections.min(values));
		
	}
}
