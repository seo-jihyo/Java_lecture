package quiz;

public class QuizEx01 {
	public static void main(String[] args) {
	
		int pay = 567890;
		/*	
		
		System.out.println("만원: " + pay / 10000 +"장");
		System.out.println("천원: " + (pay % 10000) / 1000 +"장");
		System.out.println("백원: " + (pay % 1000) / 100 +"개");
		System.out.println("십원: " + (pay % 100) / 10 +"개");
		 */
		int man, chun, back, sip;	//몫 저장변수
		int m_na, ch_na, b_na;	//나머지 저장변수
		
		man = pay / 10000;	m_na = pay % 10000;
		chun = m_na / 1000;	ch_na = m_na % 1000;
		back = ch_na / 10;	b_na = ch_na % 100;
		sip = b_na /10;
		
		System.out.println("\n\n만원: " + man +
							"장\n천원: " + chun +
							"장\n백원: " + back +
							"개\n십원: " + sip + "개");
	
	}
}
/*문제1] 월급을 단위로 계산하기
 * int pay = 567890;
 * 
 * result :
 * 만원: 56장
 * 천원:7장
 * 백원:8개
 * 십원:9개
 */
