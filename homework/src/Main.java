import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  int length = Integer.parseInt(br.readLine());

	        TreeSet<String> enterList = new TreeSet<>();

	        for (int i = 0; i < length; i++){
	            String[] string = br.readLine().split(" ");

	            if (string[1].equals("enter")){
	                enterList.add(string[0]);
	            }
	            else {
	                enterList.remove(string[0]);
	            }
	        }

	        for(String enter : enterList.descendingSet())
	        {
	            System.out.println(enter);
	        }
	    }
	}