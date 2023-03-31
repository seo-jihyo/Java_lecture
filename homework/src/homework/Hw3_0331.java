package homework;

public class Hw3_0331 {
	public static void main(String[] args) {
	
		double sum = 0;
				
		for (int i = 1; i <= 9; i++) {
		
			sum += (double)i / (i+1);
		}
		System.out.printf("Sum = %.2f" , sum);
	}
}
