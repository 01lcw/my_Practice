package hk.edu20250729.day19;

public class D1_CakePlate {
	
	private int breadCount = 0;
	
	public synchronized void eatBread() {
		if(breadCount<1) {
			System.out.println("빵이 모자라서 기다려야 함");
			try {
				wait(); //일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		breadCount--;
		System.out.println("빵을 1개 먹음. 총 "+breadCount+"개 남음");
		this.notifyAll();//모든 스레드를 실행대기
	}

	public synchronized void makeBread() {
		if(breadCount>=10) {
			System.out.println("빵이 남아요~");
			try {
				wait(); //일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		breadCount++;
		System.out.println("빵을 1개 더 만듦 총 : "+breadCount+"개");
		this.notifyAll();
	}
}
