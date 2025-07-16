package hk.edu20250716.day10;

public class D2_Calendar {
	//윤년일 때 달의 마지막 날
	private static final int[] leap= {31,29,31,30,31,30,31,31,30,31,30,31};
	//평년일 때 달의 마지막 날
	private static final int[] plain= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//윤년을 판단하는 메서드: 반환타입은 true/false
	public boolean isLeapYear(int year) {
		boolean isS=false;
		if( (year%4==0 && year%100!=0 )|| year%400==0) {
			isS=true;
		}
		return isS;
	}
	
	//1년1월1일~2025년7월1일까지의 경과일 구하기
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
			}
			else {
				tot+=plain[i-1];
			}
		}
		return tot;
	}
	
	//전년도 경과일+전달 경과일 +현재일 1
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
		int dayOfWeek=dates(year, month, 1)%7; // 공백 수를 구할 때 Calendar객체사용 시 -1을 해야함
//		System.out.println(dayOfWeek);
		//달력의 공백을 출력
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		//날짜를 출력
		for (int i = 1; i <= lastDay(year, month); i++) {
			System.out.print(i+"\t");
			//코드 작성: 토요일을 확인하는 조건을 만들어 줄바꿈을 실행하는 코드 작성
			if()
		}
	}
	public static void main(String[] args) {
		D2_Calendar cal=new D2_Calendar();
		cal.calendarPrint(2025, 7);
		
		//실습: 1. 2025년 1월~12월까지 출력하기
		//     2. 나의 살아온 날 구하기
	}
}
