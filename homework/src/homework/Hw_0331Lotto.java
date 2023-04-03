package homework;

import java.util.Random;

public class Hw_0331Lotto {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++){
			lotto [i] = ran.nextInt(45) + 1;
			
			for(int j =0; j < i; j++) {   
				//비교한다. j를 첫번째부터 한칸씩 증가시키면서 i보다 작을 때까지
				
				if(lotto[i] == lotto[j]) { //if 번호가 만약 번호의 j번과 같으면 다시 
					i--; //같은게 없을 때까지 다시 뽑아야함 (i값을 감소시킴)
						//중복이 나오면 비교할 필요가 없음
					break;
					
				}
			}
		}
	}
}
