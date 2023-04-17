package ex05.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//중복 혀용o 순서 x
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a");
		list.addLast("z");
		System.out.println(list);
		list.remove("k"); //데이터 값으로 찾아서 삭제
		System.out.println(list);
		list.remove(2);  //인덱스 번호로 찾아서 삭제
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.set(2,"a"); //index2번을 a로교체(변경)
		System.out.println(list);
		list.set(3,list.get(1)+"change"); //첫번쨰 데이터에change붙여서 3에 넣기
		System.out.println(list);
		String str1 = (String)list.peek(); 
		//큐의 맨 앞(아래)에 있는 값 반환 이때 객체를 큐에서 제거하지는 않는다.
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll();  
		//queue에서 데이터를 꺼내옴, 큐 맨 앞에 있는 값 반환 후 삭제, 큐가 비어있을 경우 null 반환
		System.out.println(str2); 
		System.out.println(list);
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
