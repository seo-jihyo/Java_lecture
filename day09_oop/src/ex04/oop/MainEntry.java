package ex04.oop;

public class MainEntry {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("jihyo");
		p.setAge(10);
		
		
		p.disp();
		System.out.println(p.toString());
		System.out.println(p);
		//다 같은 값 출력한다.
	}
}
