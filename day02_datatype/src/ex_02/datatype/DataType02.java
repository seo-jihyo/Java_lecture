package ex_02.datatype;

public class DataType02 {
	//형변환
	public static void main(String[] args) {
		short sh = 3;	//-32,768~ 32,737 (2byte)
		int num = 50000;	//-21억 ~ 21억 (4byte)
		
		//작은 자료형이 큰 자료형으로 형변환이 될 때는 자동으로 형변환 (묵시적 형변환)
		num = sh; //int(4byte) = short(2byte)
		System.out.println(sh + " : " + num);
		
		//큰 자료형이 작은 자료형으로 형변환이 될 때는 명시적 형변환이 필요하다.
		num = 32770;
		sh = (short)num; 	//명시적 형변환
		System.out.println(sh + " : " + num);
	}
}

 /*
public class DataType02 {
	//모든 자료형은 자신의 범위(크기)를 벗어나지 않는다.
	public static void main(String[] args) {
		short sh = 32767;	//-32,768~ 32,737 (2byte)
		int num = 50000;	//-21억 ~ 21억 (4byte)
		
		System.out.println(sh + " : " + num);
		
//		num = -32769;
		num = 32770;
		sh = (short)num; 	//명시적 형변환
		System.out.println(sh + " : " + num);
	}
}
//4byte -> 2byte는 명시적 형변환이 필요하다. 데이터 손실 발생.
//2byte -> 4byte는 묵시적 형변환
*/