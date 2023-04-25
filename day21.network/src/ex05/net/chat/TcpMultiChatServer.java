package ex05.net.chat;
import java.io.*;
import java.net.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
public class TcpMultiChatServer {  //outer clas
	
	HashMap clients; //key, value로 들어감
		
		public TcpMultiChatServer() { //생성자 함수 - 멤버변수 초기화 담당
			clients = new HashMap();  //HashMap 객체 생성
			Collections.synchronizedMap(clients);  //동기화
			
		}
		
		public void start() {  //User method
			ServerSocket ss = null;  //Server Socket 1
			Socket s = null;         //Client Socket 1
			
			try {
				ss = new ServerSocket(7777);
				System.out.println("서버 시작되었습니다.");
				while (true) {
					s = ss.accept(); //응답 대기, 클라이언트 소켓
					System.out.println("[" + s.getInetAddress() + ": " +s.getPort() + "] 에서 접속하셨습니다.");
					ServerReceiver thread = new ServerReceiver(s); //user clas
					thread.start(); //thread method
				} //  end while

			} catch (Exception e) {
				e.printStackTrace();
			}
		} //start end
		
		class ServerReceiver extends Thread{ //inner class
			Socket s; //client socket
			DataInputStream dis;     //readXXX() - XXX: 자료형
			DataOutputStream dos;  	 //writeXXX()
			
			public ServerReceiver(Socket s) { //생성자 함수
				this.s = s;
				try {
					dis = new DataInputStream(s.getInputStream()); //네트워크를 통해서 읽겠다.
					dos = new DataOutputStream(s.getOutputStream()); //네트워크를 통해서 쓰겠다.
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // end constructor
			
				public void sendToAll(String msg) {
					Iterator it = clients.keySet().iterator();   //key값 출력
					while (it.hasNext()) {   //요소가 있다면
						try {
							DataOutputStream dos = (DataOutputStream)clients.get(it.next());  //해당 키 값으로 value 값 출력
//							 System.out.println("dos.toString() : " + dos.toString());
							dos.writeUTF(msg);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
			}//end send method

			@Override // Thread 실행부 (구현부)
			public void run() {
				String name = "";
				try {
					name = dis.readUTF();
					sendToAll("#" + name + " 님이 입장하셨습니다.");
					clients.put(name, dos);    //HashMap 넣기
					System.out.println("현재 서버 접속자 수는: " + clients.size() + " 입니다.");
					
					while (dis != null) {
						sendToAll(dis.readUTF());
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					sendToAll("#" + name + " 님이 나가셨습니다.");
					clients.remove(name);    //접속자 수 제거
					System.out.println("[" + s.getInetAddress() + ": " +s.getPort() + "] 에서 접속 종료하셨습니다.");
					System.out.println("현재 서버 접속자 수는: " + clients.size() + " 입니다.");

				} //try end
			}  // end run()		
		} // end SeerverReceiver
		public static void main(String[] args) {
			new TcpMultiChatServer().start();
//			TcpMultiChatServer server = new TcpMultiChatServer();
//			server.start();
	}
} //outer class
