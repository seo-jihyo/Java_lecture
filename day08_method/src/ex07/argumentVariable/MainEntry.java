package ex07.argumentVariable;

public class MainEntry {
	
	public static void main(String[] args) {
		
		plus(1,3);
		plus(200);
		plus(1,2,3,4,5);
		plus(10,20,30,40,50,60,70,80);
//		plus("kbs", "mbc", "sbs");
	}
	public static void plus(int...x) { //가변 길이 (자료형만 같은 조건이라면 다 출력)
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum +=x[i];
			System.out.println(x[i]+"\t");
		}
		System.out.println("sum = " +sum);
	}
	public static void plus(String...x) {
		String sum = " ";
		for (int i = 0; i < x.length; i++) {
			sum +=x[i];
			
		}
		System.out.println("sum = " + sum);
	}
}
