package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
		
			System.out.println("-------------\n1. 고객 추가\n2. 삭제\n3. 고객 리스트 출력\n4. 수정\n0. 프로그램 종료");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("고객 추가를 선택. 고객을 입력하세요.");
				System.out.println("-------------");
				System.out.println("이름");
				String name = sc.next();
				System.out.println("주소");
				String address = sc.next();
				System.out.println("번호");
				String tel = sc.next();
				customer.add(new Customer(name, address, tel));
				System.out.println("추가 완료");
				break;
				
			case 2:
				System.out.println("고객 삭제를 선택. 삭제할 고객 이름을 입력하세요.");
				System.out.print("이름: ");
				name = sc.next();
				for (int i = 0; i < customer.size(); i++) {
					if (name.equals(customer.get(i).getName())) {
						customer.remove(i);
						System.out.println("삭제 완료~~");
					} else
						System.out.println("회원이 존재하지 않습니다.");
				}//for end
				break;
				
			case 3:
				System.out.println("고객 리스트 출력을 선택");
				for (int i = 0; i < customer.size(); i++) {
					System.out.println(customer.get(i));
				}
				break;
				
			case 4:
				System.out.println("수정할 고객 이름을 입력하세요.");
				name = sc.next();
				for (int i = 0; i < customer.size(); i++) {
					if (name.equals(customer.get(i).getName())) {
						System.out.println("수정할 항목 선택\t 1.이름 2.주소 3.번호");
						num= sc.nextInt();
						switch (num) {
						case 1:
							System.out.println("이름 입력");
							name = sc.next();
							customer.get(i).setName(name);
							break;
						case 2:
							System.out.println("주소 입력");
							address = sc.next();
							customer.get(i).setAddress(address);
							break;
						case 3:
							System.out.println("번호 입력");
							tel = sc.next();
							customer.get(i).setTel(tel);
							
							break;

						} // switch end
					} //if end
					System.out.println("수정 완료~~");
				}//for end
			
				break;
		
			default:
				System.out.println("알 수 없는 명령입니다.");
				break;
		}
	}
}
}