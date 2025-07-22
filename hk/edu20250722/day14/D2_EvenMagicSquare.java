package hk.edu20250722.day14;

import java.util.Arrays;

public class D2_EvenMagicSquare extends D2_MagicSquare{

	public D2_EvenMagicSquare() {
		super(4);
	}
	
	public D2_EvenMagicSquare(int n) {
		super(n);
	}

	//makeA(),makeB() 실행시키자
	//template 메서드: 절차적으로 기능을 실행시키는 메서드
	@Override
	public void make() {
		makeA();
		makeB();
	}
	
	// 배열에 1~16까지 입력하는 메서드 
	// 2차원배열<---1~16까지 숫자를 저장해됨
	public void makeA() {
//		int count=1;
//		for (int i = 0; i < magic.length; i++) {
//			for (int j = 0; j < magic.length; j++) {
//				magic[i][j]=count++;
//			}
//		}
		
		//2차원배열<---값을 저장   ,2차원배열 <-- 1~16 1차원배열 
		// [i/col][i%col]
		int n=magic.length;
		for (int i = 0; i < n*n; i++) {
			magic[i/n][i%n]=i+1;
		}
	}
	
	//16~1까지의 숫자를 배열에 저장한다.이때 조건에 맞는 경우만
	public void makeB() {
		int n=magic.length;
		//16~1까지 숫자를 넣어보자
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i>=0&&i<n/4)||(i>=n/4*3&&i<n)) {//i인덱스 조건
					if(j>=n/4&&j<n/4*3) {//j인덱스 조건
						magic[i][j]=(n*n)-(i*n+j);//i*n+j=0,1,2,3,4,5,6,7,8,9,10,11~15					
						//16,15,14,13....						
					}
				}else {//주황색영역(ppt그림)
					if((j>=0&&j<n/4)||(j>=n/4*3&&j<n)) {
						magic[i][j]=(n*n)-(i*n+j);
					}
				}
			}                             
		}
	}
	
}//class종료