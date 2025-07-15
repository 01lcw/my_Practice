package hk.edu20250703.day02;

public class D2_isLeapYear {

	public static void main(String[] args) {
		
		//윤년: 1년은 356일 --> 366일(윤년) 2월달의 마지막날이 29일
		//윤년을 판단하는 조건을 확인
		// - 년도가 4의 배수면서, 100으로 나누어 떨어지지 않는 수
		// - 또는 400으로 나누어 떨어지는 수
		//2025년도가 윤년인지 아닌지 확인해서 출력해보기 : "2025년은 윤년이다" 
		//									  "2025년은 평년이다"
		
		//코드 작성하기
		
		//hardcoding
	
		if((2025%4==0 && 2025%100!=0)||2025%400==0) {
			System.out.println("2025년은 윤년이다");
		}
		else {
			System.out.println("2025년은 평년이다");
		}
				
		int i = 2025; //변수 활용
		if( (i%4==0 && i%100!=0 )|| i%400==0) {
			System.out.println(i+"년은 윤년이다");
		}
		else {
			System.out.println(i+"년은 평년이다");
		}
		
		//2000~2030사이에 윤년을 모두 출력하시오
		for(int year = 2000; year<=2030; year++) {
			if( (year%4==0 && year%100!=0 )|| year%400==0) {
				System.out.println("윤년은"+year+"이다");
			}
		}
		for(int year = 2000; year<=2030; year++) {
			if(isLeapYear(year)) {
				System.out.println("윤년은"+year+"이다");
			}
		}
		
		//Scanner 클래스
		//콘솔에 입력된 값을 자바코드로 전달해서 사용할 수 있도록 지원
		//년도 범위를 직접 입력 받아서 윤년인 년도를 출력하기
	}
	
	//윤년을 판단하는 메서드: 반환타입은 true/false
	public static boolean isLeapYear(int year) {
		boolean isS=false;
		if( (year%4==0 && year%100!=0 )|| year%400==0) {
			isS=true;
		}
		return isS;
	}

}
