package ex02.staticMember;

	class Atm{
		int count; //instance member
		static int total; //static member
		
		public Atm(int amount) { //생성자
			count += amount;
			total += amount; 	 // total = total + mount;
	} //Atm end
		public static void view() {
			total = total + 100;
//			count = count + 100; 
// 스태틱 메소드는 스태틱 멤버들만 가진다. 일반 멤버변수(인스턴스 변수)는 사용 불가
		}//static 함수
		
		public static void show (int count, int toral) {
//			this.count = count;
//			this.total = total;
			//static member에서 this 사용 불가. 주소를 모름
		}
		public void display() {
			count += 50;
			total += 30;
			System.out.println("count = " + count);
			System.out.println("total = " + total);
		}
	}
	public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total); //초기화 값
		Atm at = new Atm(1000); //1000원 넣음 생성자가 인자값 가지고 있음
		at.display();			 //c: 1000, t:1000
		System.out.println("-------------------------");
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("-------------------------");
		Atm at3 = new Atm(1000);
		at3.display();
		System.out.println("-------------------------");
	}
}
