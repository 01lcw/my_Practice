package hk.edu20250729.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//에코서버: 클라이언트 --메세지--> 서버
//				<--메세지--
public class D2_TCPServer {
	
	public static void main(String[] args) {
		Socket clientSocket=null; //클라이언트 소켓
		PrintWriter out=null; //클라이언트로 출력할 때 사용할 객체
		BufferedReader in =null;//서버로 읽어들일 때 사용할 객체
		
		//서버 소켓을 생성하자
		try {
			ServerSocket serverSocket=new ServerSocket(9595);
			System.out.println("Server is running~~~");
			while(true) {
				//클라이언트에서 요청이 오면 승인 절차를 진행하고(accept실행)
				//--> 클라이언트 소켓 객체를 얻어온다.
				clientSocket = serverSocket.accept();
				System.out.println("클라이언트 연결됨:"
						+clientSocket.getInetAddress().getHostName());
				//클라이언트 소켓으로 데이터 보낼 때 사용할 ouputStream 객체 생성하고,
				//true: autoflush 설정임
				out=new PrintWriter((clientSocket.getOutputStream()), true);
				//클라이언트 소켓에서 전달된 데이터를 읽어들일 inputStream객체 생성
				in = new BufferedReader(
						new InputStreamReader(
						clientSocket.getInputStream()));
				String inputLine;
				while((inputLine=in.readLine())!=null) {
					System.out.println("클라이언트로부터 전달받은 메시지:"+inputLine);
					out.println("니가 보낸 메시지: "+inputLine);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) {
					out.close();
				}
				if(in!=null) {
					in.close();
				}
				if(clientSocket!=null) {
					clientSocket.close();
				}
			}catch(Exception e2) {
				
			}
		}
	}
}
