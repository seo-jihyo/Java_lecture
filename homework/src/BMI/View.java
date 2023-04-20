package BMI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class View {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> persons = new ArrayList<>();
		
		while (true) {
			System.out.println("BMI 프로그램");
			System.out.println("1.추가 2.수정 3.삭제 4.파일저장 5.리스트출력 0.종료");
			int num = Integer.parseInt(br.readLine());
			
			switch (num) {
			case 1:
				System.out.println("추가할 사람의 이름, 키, 몸무게 순으로 입력");
				Person ps = new Person(br.readLine(), Double.parseDouble(br.readLine(), Double.parseDouble(br.readLine())));
				Controller.addPerson(persons, ps);
				break;

			default:
				break;
			}
		}
	}
}
