package ex01.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	public static void main(String[] args) {
		String host = "192.168.0.16";
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host); //예외처리 필요
				for (InetAddress item : address) {
					System.out.println(item.getCanonicalHostName());
				}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}
