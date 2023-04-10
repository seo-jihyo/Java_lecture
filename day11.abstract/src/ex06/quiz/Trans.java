package ex06.quiz;

public abstract class Trans {  //�߻�Ŭ���� , ����Ŭ����
	protected String name;
	
	abstract void start();
	abstract void stop();
	
	public String name(){
		return name;
	}// name
}// Trans
