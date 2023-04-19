package ex07.io.data;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataIntputStreamEx {
public static void main(String[] args) throws Exception {
		
		File file = new File("test.txt");
		FileInputStream fis = new FileInputStream(file); //예외 발생
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());

		dis.close();
}
}