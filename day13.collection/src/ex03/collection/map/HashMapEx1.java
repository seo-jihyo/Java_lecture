package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		Map map = new HashMap(); // 파라미터 지정 안 함 모든 타입이 올 수 있다.
		map.put("kosa", "1234");
		map.put("daebo", "1004");
		map.put("jihyo", "4040");
		map.put("kosa", "1234");
		map.put("kosa1", "1234");
		
		System.out.println("요소 개수: " + map.size()); //3개 (중복 처리 가장 마지막에 들어간 값이 덮어씀)
		// value 값은 중복 허용하나 key 값은 허용하지 않음
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력해 주세요.");
			System.out.print("id: ");
			String id = sc.nextLine().trim(); //공백 제거
			System.out.print("pw: ");
			String pw = sc.nextLine().trim(); //공백 제거
			System.out.println();
			
			if ( !map.containsKey(id)) { //만약 아이디가 있다면
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해 주세요.");
				continue;
			} else {
				if ( !map.get(id).equals(pw)) { //해당하는 id에 대응되는 pw까지 물어봄, 맞지 않는다면
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
				} else {
					System.out.println("id와 pw가 일치합니다.");
					break;
				}
			}
		}	// end of while
	} // main end
}
