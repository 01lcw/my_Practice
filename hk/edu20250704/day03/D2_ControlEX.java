package hk.edu20250704.day03;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class D2_ControlEX {

	public static void main(String[] args) {
		
		//구구단 출력하기
		//2단을 출력하는 코드
		for (int i = 1; i < 10; i++) {
			// 2X1=2, 2X2=4
//			System.out.println("2X" + i +"="+ i*2);
			System.out.printf("2X%d=%d \n",i,2*i);
//			System.out.println(); //줄만 바꿔줌
		}
		//2~9단 출력하기
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%dX%d=%d \n",i,j,i*j);
			}
			System.out.println("-----------------");
		}
		
		//2~9단까지 출력할때.. 짝수단만 출력해보기
		for (int i = 2; i < 10; i++) {
			for(int j=1; j<10; j++) {
				if(i%2==0) {
					System.out.printf("%dX%d=%d \n",i,j,i*j);
				}
			}
		}
		//2~9단까지 출력할때.. 홀수단만 출력해보기
		for (int i = 2; i < 10; i++) {
			for(int j=1; j<10; j++) {
			if(i%2!=0) {
			System.out.printf("%dX%d=%d \n",i,j,i*j);
			}
			}
		}
		
		//1~100까지의 수의 합을 출력 -> 1+2+3 ... +100 총합
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.printf("총합:%d \n",sum);
		
		//1~100까지의 수 중에 4의 배수의 총합을 출력
		int sum4=0;
		for (int i = 1; i <= 100; i++) {
			if (i%4==0) {
				sum4+=i;
			}
		}
		System.out.printf("4배수 총합:%d \n",sum4);
		
		//주사위 두개의 합이 5이면 실행을 멈추고,
		//5가 아니면 계속 실행되게 코드 작성
		//1~6까지의 숫자로 구성 랜덤하게 숫자 생성
		// --> Math객체를 활용, 어떤 메서드를 사용하면 될까
		//     Random객체를 활용
		
		//Math객체에 random()메서드를 사용
		//random()에서 생성되는 숫자 --> 0~1 사이의 실수를 랜덤하게 생성
		System.out.println(Math.random());
		int number = (int)(Math.random()*6)+1; //1~6까지 랜덤숫자 반환
		
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);

		
		while(true) {
			int num1=(int)(Math.random()*6)+1; //1번 주사위
			int num2=(int)(Math.random()*6)+1; //2번 주사위
			System.out.printf("(%d,%d)\n",num1,num2);
			if(num1+num2==5) {
				System.out.println("합이 5가 되어서 종료합니다");
				break;
			}
		}
		//뱅킹 시스템
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
//		String input=scanner.nextLine();
		
//		System.out.println(balance+Integer.parseInt(input));
		
		while(true) {
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택>");
		int input = Integer.parseInt(scanner.nextLine());
		if(input==1) {//예금
			System.out.print("예금액>");
			int a = Integer.parseInt(scanner.nextLine());
			balance += a;
			System.out.println("입금 완료");
		}
		else if(input==2) {//출금
			System.out.print("출금액>");
			int b = Integer.parseInt(scanner.nextLine());
			if(balance>b) {
			balance -= b;
			}else {
				System.out.println("잔액 부족");
				continue;
			}
			
		}
		else if(input==3) {//조회
			System.out.println("잔고>"+balance);
		}
		else if(input==4) {
			System.out.println("프로그램 종료");
			
		}
		break;
		}
			
	}
}

