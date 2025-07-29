package hk.edu20250729.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class D2_TCPClient {

	public static void main(String[] args) {
		Socket socket=null;
		PrintWriter out=null;
		BufferedReader in=null;//서버에서 전달된 메시지를 읽어들일 객체
		BufferedReader userIn=null;//사용자가 키보드로 입력하는 메시지를 읽어들일 객체
		
		try {
//			socket=new Socket("192.168.22.5",9595);
			socket=new Socket("localhost",9595);//(접속하려는 ip주소,포트)
			System.out.println("Client:Connetion to server...");
			out=new PrintWriter(socket.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			userIn=new BufferedReader(new InputStreamReader(System.in));//키보드로 입력되는 내용 읽어들이기
			
			String inputLine;
			while((inputLine=userIn.readLine())!=null) {
				//소켓으로 출력  out.print(inputLine)->out.println(inputLine)변경
				//개행문자가 있어야 문장의 종료를 알 수 있음.<-서버쪽에서 메시지의 끝이 어디인지 몰라 계속 대기
				out.println(inputLine);//
				System.out.println("서버에서 전달된 메시지:"+in.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) {
					out.close();
				}
				if(in!=null) {
					in.close();
				}
				if(userIn!=null) {
					userIn.close();
				}
				if(socket!=null) {
					socket.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}








