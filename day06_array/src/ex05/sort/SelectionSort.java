package ex05.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		
		int temp;
		
		System.out.println("sort 전 출력: ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {  //부등호 방향만 바꾸면 내림차순
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}//end of if
			}// end of j
		}// end of i
		System.out.println("\n\nsort 후 출력: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"\t");
		}
		
	}
}
