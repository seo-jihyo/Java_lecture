package ex06.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		first: {
			second: {
				third:{
					int k = 100;
					System.out.println("Before the break");
					
					if (flag) break second; //break 식별자; 식별자 위치까지 탈출
					//식별자가 없었다면 third 통과
					System.out.println("This won't execute 3");
					
				} //end of third
				System.out.println("대보반 홧팅 22");
			}//end of second
			System.out.println("This is after second break");
		}//end of first
		System.out.println("12345");

//	식별자1 : {
//		식별자 2 :{
//			break 식별자 1;
			//break는 항상 가장 가까운 구문을 탈출하는데 지정을 해주면 지정된 구문을 탈출함
		}
	}