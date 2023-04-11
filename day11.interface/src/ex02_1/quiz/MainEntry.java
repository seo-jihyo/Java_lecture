package ex02_1.quiz;

public class MainEntry {
	public static void main(String[] args) {
		
	
	Trans[] tr = new Trans[] {new Subway(), new Bus(), new Bicycle(), new Airplane()};
	String [] str = new String[] {"지하철", "버스", "자전거","비행기"};
	
	for (int i = 0; i < tr.length; i++) {
		tr[i].start();
		tr[i].stop();
		System.out.println("---------------------");
		
	}

	}
}