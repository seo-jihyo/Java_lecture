package quiz2;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class VideoMain  extends Video {  
	
	public static void main(String[] args) {
		//비디오정보 추가/삭제/수정
		HashMap<String, Video> video = new HashMap<String, Video>();
		Scanner sc = new Scanner(System.in);
		
		Video vdo = null;   
		int choice = 0;
		
		while(true){
			
				System.out.println("1.비디오 정보 추가\n2.비디오 정보 수정\n3.비디오 삭제\n4.모든 비디오 보기\n0.프로그램 종료");
				choice = sc.nextInt();
				
			switch(choice){
			case 1:
				vdo = new Video(); 
				System.out.println("비디오 제목을 입력해 주세요. ");
				vdo.setTitle(sc.next());
				System.out.println("비디오 장르를 입력해 주세요. ");
				vdo.setCategory(sc.next());
				System.out.println("비디오 대여여부를 입력해 주세요. y/n");
				char input = sc.next().charAt(0);
				vdo.setLend(input);
					if (input=='y') {
						System.out.println("대여자 이름을 입력해 주세요.");
						String name = sc.next();
						vdo.setLendName(name);
						Calendar cal = Calendar.getInstance();
						vdo.setLendDate(cal.getTime());
						video.put(vdo.title, vdo);
					}else {
						vdo.setLend('-'); break;
					}
				break;
			case 2:
				System.out.println("수정할 비디오 타이틀을 입력해주세요.");
				String tit = sc.next();
				
				vdo = video.get(tit);
				
				System.out.println("비디오 제목을 입력해 주세요. ");
				vdo.setTitle(sc.next());
				System.out.println("비디오 장르를 입력해 주세요. ");
				vdo.setCategory(sc.next());
				System.out.println("비디오 대여 여부를 입력해 주세요. ");
				vdo.setLend(sc.next().charAt(0));
				video.put(vdo.title, vdo);
				
				break;
			case 3:
				System.out.println("삭제할 비디오 제목을 입력해주세요.");
				String removeName = sc.next();				
				video.remove(removeName);
				break;
			case 4:
				Set keys = video.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()){
					vdo = video.get(it.next());
					System.out.println(vdo.title+", "+vdo.category+", "+vdo.lend+", "+vdo.lendName+", "+vdo.lendDate);
				}
				break;
				case 0:
						System.out.println("프로그램을 종료합니다.");
						return;
				default:
					System.out.println("잘못 입력하셨습니다.");
			}//switch end
		}// while end
	}
}