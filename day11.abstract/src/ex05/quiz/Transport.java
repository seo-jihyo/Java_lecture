package ex05.quiz;

public abstract class Transport {  //�߻�Ŭ����
	String start;
	String stop;
	
	public abstract void start(String trpt); //�߻�޼ҵ�
	public abstract void stop(String trpt);
	public abstract void display(String trpt);
	
}
