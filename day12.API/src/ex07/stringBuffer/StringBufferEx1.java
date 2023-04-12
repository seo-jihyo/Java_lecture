package ex07.stringBuffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());
		
		System.out.println("length    /      capacity");
		System.out.println(sb.length() + "         /           " + sb.capacity());
		int len = sb.length(); 		
		int size = sb.capacity();
		System.out.println(len + "         /          " + size);
		
		sb.append("daebo");
		len = sb.length(); 		size = sb.capacity();
		System.out.println(len + "         /          " + size);
		
		sb.append("happyvirus");
		len = sb.length(); 		size = sb.capacity();
		System.out.println(len + "         /          " + size);
		
		sb.append("12345 67890"); //넘으면 배수의 +2 16*2 +2 =34
		len = sb.length(); 		size = sb.capacity();
		System.out.println(len + "         /          " + size);
		
		sb.append("12345 67890"); //또 넘으면 배수의 +234*2 +2 = 70
		len = sb.length(); 		size = sb.capacity();
		System.out.println(len + "         /          " + size);
		System.out.println(sb.hashCode()); // 주소는 같다
		
		System.out.println("==============================");
		
		sb.trimToSize();  //용량 크기 조절
		len = sb.length(); 		size = sb.capacity();
		System.out.println(len + "         /          " + size); 
		//70에서 자기 용량만큼 트림
	}
}
