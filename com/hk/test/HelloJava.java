package com.hk.test;//최상단에 작성

//명명법, 식별자 확인
//클래스명: 파스칼(첫 글자를 대문자로 시작)
public class HelloJava {// H 첫글자를 대문자로 사용

	//main 메서드: 자바코드를 실행시켜줌
	public static void main(String[] args) {
		
		System.out.println("java 테스트: Hello JAVA!!!");
		System.out.println("java는 컴파일 언어이다");
		
		testMethod();
		
		HelloJava hello = new HelloJava();//new 이용한 객체생성
		hello.testMethod2();//객체 생성을 해야지만 쓸 수 있음
		//testMethod2();
	}
	
	//메서드 선언
	//메서드명 정의: 카멜방식 - 소문자로 시작 , 의미가 바뀌면 대문자
	//반환값 없이 실행하는 기능만 정의한다면 void, 반환값이 있다면 반드시 반환해야됨, 메서드를 실행할 땐 main에서 호출해서 실행
	public static void testMethod() {
		//변수명 정의: 카멜 방식
		boolean isS = true;
		int i=100; //선언할 때 타입을 정의
		i=200; //사용할 떄 타입정의X
		System.out.println("메서드 실행결과: "+i);
	}
	//블럭변수: 변수의 사용범위(scope)
	public void testMethod2() {
		int i =10;
		if(i<15) {
			int ii=5;
			ii=ii+i;
		}
//      i=ii+i; -> 오류 발생 ii변수는 하위 블럭에서 선언한 변수임
	}

}
