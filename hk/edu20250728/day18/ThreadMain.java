package hk.edu20250728.day18;

public class ThreadMain {
	public static void main(String[] args) {
		//스레드를 생성하는 방법 2가지
		
		//1.Runable을 구현한 방법
		Runnable runObj= new D2_RunableTest();
		Thread tr=new Thread(runObj);
		tr.setPriority(Thread.MAX_PRIORITY);//스레드의 실행 우선순위 설정:1~10
		tr.start();
		
		//2. Thread 클래스 상속받는 방법
		Thread thr=new D2_ThreadInheritance();
		tr.setPriority(Thread.MIN_PRIORITY);//가장 하위의 순위(MIN..)
		thr.start();
		
		//메인스레드
		for (int i = 0; i < 5; i++) {
			System.out.println("나는 메인 스레드야");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

