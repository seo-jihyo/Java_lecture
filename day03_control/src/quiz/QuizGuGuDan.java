package quiz;

public class QuizGuGuDan {
	public static void main(String[] args) {
		//구구단 전체 출력 프로그램
		
		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

	//			System.out.print(j + "*" + i + "=" + (i*j)+'\t');
				System.out.printf("%d*%d=%2d\t",i,j,(i*j));
			}
			System.out.println();
		}
	}
}
