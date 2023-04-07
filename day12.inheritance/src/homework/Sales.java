package homework;

public class Sales extends Regular {
	private int com;
	
	public Sales(String name, String dept, String phone, int num, int comno) {
		super(name, dept, phone, num);
		if (comno >= 3) {
			this.com = comno;
		}
	}

	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}

	public void disp() {
		super.disp();
		System.out.println(", 커미션 횟수: "+ getCom() + ", 추가금: " + (com*1.5));
	}
}
