package homework;

public class Regular extends Employee {

	int sal;
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = 0;
	}
	public Regular() {
		
	}
	public Regular(String name, String dept, String phone, int num) {
		super(name, dept, phone, num);

		switch (dept) {
		case "인사팀":
			this.sal = 100;
			break;
		case "영업팀":
			this.sal = 150;
			break;
		case "개발팀":
			this.sal = 200;
			break;

		}
	}
	
	public void disp() {
		super.disp();
		System.out.printf(", 급여: %d",getSal());
	}
}
