package quiz;

public class MainEntry {
	public static void main(String[] args) {
		
		Score s = new Score();
		s.input();
		s.setTotal(s.getTotal());
		s.setAvg(s.getAvg());
		s.grade();

	//output 호출 (출력)
			s.output();
	}
}
