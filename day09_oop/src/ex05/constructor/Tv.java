package ex05.constructor;

public class Tv {
	private int channel;
	private String color; //  private 내부에서 사용 가능
	
//	public void Tv() { // 일반 함수라서 초기화 안됨
	public Tv() { 	//생성자함수. 초기화 됨
	channel = 1;
		color = "white";
	}
	
	public Tv(int channel) {
		this.channel = channel;
		color = "red";
	} // 이렇게 정의를 내리면 default 생성자는 기능을 상실한다.
	 //default 생성자도 사용을 하고 싶다 --> default도 정의 내려준다.

	public Tv(String color) {
		this.color = color;
	}
	
	public Tv(String color, int channel) {
		this.channel = channel;
		this.color = color;
	}
	
//	public void setData(int chnnel, String color) {
//		this.channel = channel;
//		this.color = color;
//	} 이렇게 한번에 만들 수 있다
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void output(){
		System.out.println("tv 색상: "+ color + ", 채널: " + channel);
		// 내부에서 사용
	}	
}

