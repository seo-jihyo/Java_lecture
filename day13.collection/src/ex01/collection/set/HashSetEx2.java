package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person { // extends Object
	String name;
	int age;

	public Person(String name, int age) {
		super(); // 부모의 생성자함수 호풀(object) 있어도 되고 없어도됨
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {

			Person temp = (Person) obj;

			return name.equals(temp.name) && age == temp.age;
			// temp변수에 넘어온 name, age와 비교
		}
		return false;
	}

	@Override
	public int hashCode() { //
		return name.hashCode() + age; 
		
	}

} // Person end

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet();

		set.add(new Person("jihyo", 19));
		set.add(new Person("David", 25));
		set.add(new Person("David", 25));
		set.add(new Person("David", 38));
		set.add(new Person("David", 19));
		set.add(new String("happ"));
		set.add(new String("happ"));

		System.out.println(set);
	}

}
