package quiz2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Scanner;

public class View {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Person> persons = new ArrayList<>();
		
		while (true) {
			System.out.println("BMI 프로그램");
			System.out.println("1.추가 2.수정 3.삭제 4.파일저장 5.출력 0.종료");
			int num = Integer.parseInt(br.readLine());
			
				switch (num) {
				case 1:
					System.out.println("추가할 사람의 이름, 키, 몸무게 순으로 입력");
					Person ps = new Person(br.readLine(),Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
					Controller.addPerson(persons, ps);
					break;
				case 2: //수정
					Controller.listPerson(persons);
					System.out.println("삭제할 사람의 번호 입력");
					int i = Integer.parseInt(br.readLine());
					System.out.println("수정할 사람의 이름, 키, 몸무게 순으로 입력");
					Person ps2 = new Person(br.readLine(), Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
					Controller.modifyPerson(persons,i,ps2);
					break;
				case 3: //삭제
					Controller.listPerson(persons);
					System.out.println("삭제할 사람의 번호 입력");
					
					Controller.removePerson(persons, Integer.parseInt(br.readLine()));
					break;
				case 4: //파일 저장
					Controller.savePerson(persons);
					break;
				case 5: //출력
					Controller.listPerson(persons);
					break;
					
				case 0:
					System.out.println("프로그램이 종료됩니다.");
					System.exit(0);

				default:
					System.out.println("잘못입력하셨습니다.");
					break;
				} // switch end
		}//while end
	} // main end
}
