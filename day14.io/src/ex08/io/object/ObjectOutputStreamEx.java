package ex08.io.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException {
		
	 Grade vo = new Grade();
	 vo.setSubject("미술");
	 vo.setScore(80);
	 
	 System.out.println(vo);
	 OutputStream os = new FileOutputStream("Grade.dat");
	 ObjectOutputStream oos = new ObjectOutputStream(os);
	 
	 oos.writeObject(vo);
	 oos.close();
	 
	}
}