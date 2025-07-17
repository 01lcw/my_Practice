package hk.edu20250716.day10;

import java.util.Calendar;

public class D2_Calendar {
	//윤년일때 달의 마지막 날
	private static final int[] leap= {31,29,31,30,31,30,31,31,30,31,30,31};
	//평년일때 달의 마지막 날
	private static final int[] plain= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//윤년을 판단하는 메서드: 반환타입은 true/false
	public boolean isLeapYear(int year) {
		boolean isS=false;
		if((year%4==0&&year%100!=0)||year%400==0) {
			isS=true;
		}
		return isS;
	}
	
	//1년1월1일 ~ 2025년07월1일까지의 경과일 구하기
	//전년도까지의 일수+1월~전월까지 일수+현재월의 1일 

	//전년도까지의 경과일
	public int dates(int year) {
		int tot=0;
		for (int i = 1; i < year; i++) {
			if(isLeapYear(i)) {
				tot+=366;
			}else {
				tot+=365;
			}
		}
		return tot;
	}
	
	//전년도경과일+전월까지 경과일
	public int dates(int year, int month) {
		int tot=dates(year);//전년도까지의 경과일을 초기값으로 설정
		
		for (int i = 1; i < month; i++) {
			if(isLeapYear(year)) {
				tot+=leap[i-1];
			}else {
				tot+=plain[i-1];
			}
		}
		return tot;
	}
	
	//전년도 경과일+전달 경과일+현재일 1일
	public int dates(int year, int month, int date) {
		return dates(year,month)+date;
	}
	
	//해당 달의 마지막날 
	public int lastDay(int year, int month) {
		return isLeapYear(year)?leap[month-1]:plain[month-1];
	}
	
	//한달을 출력하는 메서드
	public void calendarPrint(int year, int month) {
		System.out.println(year+"년\t"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfWeek=dates(year, month, 1)%7;//공백수를 구할때 Calendar객체사용시 -1을 해야함
//		System.out.println(dayOfWeek); 
		//달력의 공백을 출력
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		//날짜를 출력
		for (int i = 1; i <= lastDay(year, month); i++) {
			System.out.print(i+"\t");//날짜 출력
			//코드작성: 토요일을 확인하는 조건을 만들어 줄바꿈을 실행하는 코드 작성
			if((i+dayOfWeek)%7==0) {//토요일이 되는 조건:(현재날짜+공백수)%7==0
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		D2_Calendar cal=new D2_Calendar();
//		cal.calendarPrint(2025, 8);
		
		//실습: 1. 2025년 1월~12월까지 출력하기
		for (int i = 1; i <= 12; i++) {
			cal.calendarPrint(2025, i);
			System.out.println("\n");
		}
		//     2. 나의 살아온 날 구하기
		int a=cal.dates(2025, 7, 17);
		int birthDay=cal.dates(2003, 7, 10);
		System.out.println("나의 살아온 날은? "+(a-birthDay)+"일입니다.");
		
		//     3. Calendar API사용해서 구현해보기
		for (int i = 1; i <= 12; i++) {
			cal.calendarApiPrint(2025, i);			
		}
	}
	
	public void calendarApiPrint(int year, int month) {
		//Calendar 추상클래스: new 객체생성 X --> 메서드를 통해 객체를 얻어온다. 
		Calendar cal = Calendar.getInstance();//객체생성하면 오늘 날짜기준
//		System.out.println(cal.get(Calendar.DATE));
		
		//Cal API에서는 월을 나타낼때 0~11월로 관리함
		cal.set(year,month-1, 1);//특정 날짜로 셋팅
		//해당 달의 마지막 날 가져오기: 1~31일 중 가장 큰값
		int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);//요일: 1~7로 관리
//		System.out.println(dayOfWeek);// dayOfWeek-1=공백수
		System.out.println(year+"년\t"+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < dayOfWeek-1; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i+"\t");
			if((i+dayOfWeek-1)%7==0) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
}