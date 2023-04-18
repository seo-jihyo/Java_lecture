package ex05.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformation {
	public static void main(String[] args) throws IOException {
		
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("file name= "); //상대경로
		
		System.in.read(fileName); //예외 발생
		strName  = new String(fileName).trim(); //위에서 읽어낸 파일 이름 문자열로 변환
		
		file = new File(strName);
		
		System.out.println("절대 경로: " + file.getAbsolutePath());
		System.out.println("표준 경로: " + file.getCanonicalPath());
		System.out.println("최종 수정일: " + new Date(file.lastModified()));
		System.out.println("파일 크기: " + file.length());
		System.out.println("읽기 속성: " + file.canRead());
		System.out.println("쓰기 속성: " + file.canWrite());
		System.out.println("파일 경로: " + file.getPath());
		System.out.println("숨김 속성: " + file.isHidden());
		
	}
}
