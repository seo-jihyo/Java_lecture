package ex03.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
	
	Trans[] tr = new Trans[4];
	tr[0] = new Subway();
	tr[1] = new Bus();
	tr[2] = new Bicycle();
	tr[3] = new Airplane();
	
	String[] name = new String[] {"지하철", "버스", "자전거", "비행기"};
	
	
	for (int i = 0; i < tr.length; i++) {
		tr[i].start(name[i]);
		tr[i].stop(name[i]);
		System.out.println("----------------------");
	}
}
}