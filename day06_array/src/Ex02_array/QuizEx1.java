package Ex02_array;

import java.util.Random;

public class QuizEx1 {
	public static void main(String[] args) {
		//배열 5개 데이터 선언하고 배열의 합 구하기
/*		
		int[] a = new int[] {3,5,8,1,9};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
		sum+=a[i];
	
		}
		System.out.println("sum ? " +sum);
	}
}*/

		//배열 여러 개 데이터 중에서 7의 개수 찾기
/*		
		int[] a = new int[] {7,3,7,8,1,9,7,100,12,7,33,7};
		int seek = 7;
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (seek == a[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
	*/
//임의의 데이터 7개 입력받고 그 중 찾을 숫자도 임의로 선출하기
		//1. for문 이용해서 데이터 다 출력하기
		
		 Random rand = new Random();
		int[] a = new int[7];
		//for(int i = a.length-1; i>=0; i--)
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10)+1;
			System.out.print(a[i] + ",");
			//1~10 중 7개 랜덤으로 뽑기
		}

		//확장된 for문
	//	for(자료형 변수명: 컬렉션명 또는 배열명){ 반복 구문 ;}
	//	        int loop=8;
	//  for(int item : a) {
	//  	if(loop == item) break;
	//		System.out.println(item) break;
	//	}
		int seek = rand.nextInt(10)+1; //찾을 수도 랜덤(1~10)
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(seek == a[i]) {
				count++;
			}
		}
			System.out.println("\n중에서 " + seek + " 의 개수?");
			System.out.println(count + "개");
	}
}
		/*
		//홀수 인덱스 위치 데이터만 출력
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) continue;
			System.out.println("a["+i+" ]="+a[i]+"\n");
		}*/