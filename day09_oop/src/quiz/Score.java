package quiz;

import java.util.Scanner;

public class Score {
	//멤버 변수
	String name;
	int kor, eng, com, total;
	double avg;
	private char grade;
	
	
	//멤버 함수 getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = this.kor+this.eng+this.com;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = this.total / 3;
	}
	
	
	
	//입력
	public void input() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		setName(sc.next());
		System.out.println("국어 점수: ");
		setKor(sc.nextInt());
		System.out.println("영어 점수: ");
		setEng(sc.nextInt());
		System.out.println("전산 점수: ");
		setCom(sc.nextInt());
		
	
	}
	
	public char grade() {

		switch ((int) this.avg / 10) {
		case 10:
		case 9: this.grade = 'A'; break;
		case 8: this.grade = 'B'; break;
		case 7: this.grade = 'C'; break;
		case 6: this.grade = 'D'; break;
		default: this.grade = 'F';
		}// switch end
		return this.grade;
	}
	//출력
	public void output() {
		
			
		System.out.println(getName()+"님의 성적표===============");
		System.out.println("국어: " + getKor() + ", 영어: " + getEng() + ", 전산: " + getCom());
		System.out.printf("총점: %d, 평균: %.2f, 학점: %c",getTotal(),getAvg(),grade);
		
	}
	
	
	//user method: input output
}
