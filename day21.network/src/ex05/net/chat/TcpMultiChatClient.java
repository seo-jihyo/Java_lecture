package ex05.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class TcpMultiChatClient {
	public static void main(String[] args) {
		if (args.length != 1) {  //아무것도 안들어오면
			System.out.println("USAGE: java TcpMultiChatClient nickname ? ");
			System.exit(0);  //에러메시지 띄우고 빠져나감
		}
		try {
			String ip = "192.168.0.104"; // "127.0.0.1" or "192.168.0.16"
			Socket s = new Socket(ip, 7777);
			System.out.println("서버에 연결되었습니다.");

			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));

			sender.start();    //Thread의 start()함수
			receiver.start();  // run() 메소드 유도

		} catch (Exception e) {  //ip가 다르거나 등의 예외처리
			e.printStackTrace();
		}
	} // end main

	static class ClientSender extends Thread { // inner class
		Socket s;
		DataOutputStream dos;
		String name;

		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // 키보드로부터 입력받음
			try {
				if (dos != null)
					dos.writeUTF(name);
				while (dos != null)
					dos.writeUTF("[" + name + "] " + sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end run()
	} // end ClientSender class

	static class ClientReceiver extends Thread {
		Socket s;
		DataInputStream dis;

		public ClientReceiver(Socket s) {
			this.s = s; // 초기화
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while (dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} //run end
	} // end ClientReceiver class
}
