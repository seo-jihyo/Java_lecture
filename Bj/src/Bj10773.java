import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj10773 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < K; i++) {
			  int number = Integer.parseInt(br.readLine());
		        if (number==0){
		            stack.pop();
		        }else {
		            stack.push(number);
		        }
		    }
		    for (int i : stack){
		        sum += i;
		    }
		    System.out.println(sum);
		    }
}
