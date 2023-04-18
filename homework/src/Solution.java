
import java.util.Scanner;
import java.io.FileInputStream;
class Solution {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			System.out.println("#"+test_case+" "+AnswerN);
		}
//	int X = sc.nextInt();
//	for (int i = 0; i < X; i++) {
//		for (int j = 0; j < X; j++) {
//			
//		}		
//	}			
//		}
//		int count = 0;
//		int H = 1;
//		while (true) {
//			for (int X = 1; X < 100; X++) {
//				if (X == 1) 
//					count ++;
//				else if (X == 0) {
//					break;
//				}
//				
//		
//		
//			}
//			
//		}
	}
}
