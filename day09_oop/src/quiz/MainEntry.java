package quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Score s = new Score();
		s.input();
		s.setTotal(s.getKor()+s.getEng()+s.getCom());
		s.setAvg(s.getTotal()/3.0);
		s.grade();

	//output 호출 (출력)
			s.output();
	}
}
