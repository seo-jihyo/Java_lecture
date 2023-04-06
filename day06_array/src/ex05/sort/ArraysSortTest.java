package ex05.sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		
		
		int[] a = {7,3,5,2,8};
		
		System.out.print("sort 전 출력: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		//sort
		Arrays.sort(a); //내부적으로 정렬 알고리즘을 가지고 있다.
		System.out.println(a.hashCode()); //10진 형태로
		
		System.out.print("\n\n오름차순 - sort 후 출력: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
			
		}
		System.out.print("\n\n내림차순 - sort 후 출력: ");
		for (int i =  a.length-1; i >=0; i--) {
			System.out.print(a[i]+"\t");
			
		}
	//2진수: 기계 8진수: 자료구조 16: 주소체계
	}
}
