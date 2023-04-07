package quiz2;

import java.util.Scanner;

//이름 직급 부서 급여 연락처 사번
//생성자 3개
public class Sawon {
	
	private int sal, num;
	private String name, job, dept, phone;
	
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Sawon(int num) {
		this.num = num;
	}
	
	public Sawon(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public Sawon(String dept, int sal, String phone) {
		this.dept = dept;
		this.sal = sal;
		this.phone = phone;
	}
	
	public Sawon(int sal, int num, String name, String job, String dept, String phone) {
		super();
		this.sal = sal;
		this.num = num;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.phone = phone;
	}
	public void disp() {
		System.out.printf("사번: %s%n" , getNum());
		System.out.printf("이름: %s 직급: %s%n", getName(), getJob());
		System.out.printf("부서: %s 급여: %s 번호: %s%n", getDept(), getSal(), getNum());
	}
}