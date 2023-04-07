package homework;

public class Employee {

	private int num;  		//사번
	private String name;	//이름
	protected String dept;	//부서
	private String phone;	//연락처
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Employee() {
		this("","","",0);
	}
	
	public Employee(String name, String dept, String phone, int num) {
		super();
		this.name = name;
		this.dept = dept;
		this.phone = phone;
		this.num = num;
	}
	public void disp() {
		System.out.printf("이름: %s, 부서: %s, 휴대폰: %s, 사번: %d" , 
							name , dept , phone , num);
	}
}
