package hk.edu20250725.day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class D3_IOTest {
	public static void main(String[] args) {
		test01();
	}
	
	//파일을 읽고 출력하기
	public static void test01() {
		InputStream in = null;//입력파이프 tjsdjs
		OutputStream out=null;//출력파이프 선언
		
		try {
			in = new FileInputStream("C:\\Users\\hkedu\\Desktop\\HelloJava.java");
			out=new FileOutputStream("C:\\Users\\hkedu\\Desktop\\output_HelloJava.java");
			
			int i=0;//byte단위로 읽어서 데이터(실제데이터)를 저장할 변수
			while((i=in.read())!=-1) { // 읽어들일 데이터가 없으면 -1을 리턴
				System.out.print((char)i);
				out.write(i); //파일 출력하는 코드
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//마지막에 실행됐던 스트림부터 닫는다.
				if(out!=null) {
					out.close();
				}
				if(in!=null) {
					in.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
