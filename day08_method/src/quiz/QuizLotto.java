package quiz;

import java.util.Arrays;
import java.util.Random;

//isCheck(int[] arr, int i)
public class QuizLotto {
	
	public static void main(String[] args) {
		init();
	}

	public static void init() {
		int[] arr = new int[6];
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			//5번 출력하고 싶으면 여기서 for문으로 돌리면 된다.
			arr[i] = rand.nextInt(45)+1; //1~45까지 int[6]에 넣음
			
			if (isCheck(arr,i)) { // 
				i--;
			}
		} //end of for
		Arrays.sort(arr); //정렬 default 내림차순
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	public static boolean isCheck(int[] arr, int i) {
		boolean flag = false;
		
		for (int j = 0; j < i; j++) { //그 수만큼 돌면서 서로 비교
			if (arr[i] == arr[j]) {
				return true;
			}
		}
			return flag;
		
	}
}