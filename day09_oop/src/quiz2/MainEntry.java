package quiz2;

public class MainEntry {
	public static void main(String[] args) {
		Sawon s = new Sawon(5);
		s.disp();
		
//		Sawon s2 = new Sawon("김이름", "직급");
//		s2.disp();
//		
//		Sawon s3 = new Sawon("부서", 500, "01000000000");
//		s3.disp();
//		
		Sawon s4 = new Sawon(200, 11, "김이름", "직원", "개발", "01055551111");
		s4.disp();
	}
}
