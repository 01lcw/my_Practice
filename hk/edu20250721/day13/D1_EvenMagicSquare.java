package hk.edu20250721.day13;

import java.util.Arrays;

public class D1_EvenMagicSquare {

	//클래스의 구성요소? 멤버필드,생성자,메서드
	//클래스 내부 코드는 절차식(X)->호출되는 순서
	//2차원배열에서 구현...
	public int[][] magic;
	
	public D1_EvenMagicSquare() {
//		this.magic=new int[4][4];
//		make();
		this(4);
	}
	
	public D1_EvenMagicSquare(int n) {
		this.magic=new int[n][n];
		make();
	}
	//필요에 따라 생성자 오버로딩 작성하면 됨
//	public D1_EvenMagicSquare(int n,int m) {
//		this.magic=new int[n][m];
//	}
	
	//makeA(),makeB() 실행시키자
	//template 메서드: 절차적으로 기능을 실행시키는 메서드
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
	//---마방진 증명 확인---
	//가로의 합,  1차원배열내용:[6  1  8] , 2차원배열이기때문에 [0] : [0]->[1]->[2]  
	public int sumCol(int i) {
		int tot=0;
		//중간위치 코드 구현 : tot에 값을 더해가는 코드
		for (int j = 0; j < magic.length; j++) {
			tot+=magic[i][j];
		}
		return tot;
	}
	//세로의 합 : [0]->[1]->[2] : [0] 
	public int sumRow(int j) {
		int tot=0;
		for (int i = 0; i < magic.length; i++) {
			tot+=magic[i][j];
		}
		return tot;
	}
	//대각선의 합(왼쪽에서 내려가는)
	public int sumDia() {
		int tot=0;
		for (int i = 0; i < magic.length; i++) {
			tot+=magic[i][i];
		}
		return tot;
	}
	//대각선의 합(오른쪽에서 내려가는)
	public int sumReverseDia() {
		int tot=0;
		for (int i = 0; i < magic.length; i++) {
			tot+=magic[i][magic.length-1-i];//[i]:[2]->[1]->[0]
		}
		return tot;
	}
	//각각의 합을 구해서 같은지 확인하는 메서드
	//sum*메서드들을 활용해서 각각의 합이 같은지 확인
	public boolean isCheck() {
		boolean isC=true;
		
		int n=magic.length;
		int [] ma=new int[n*2+2];// 3*2+2=8  n*2+2=12
		
		//각각의 결과를 배열ma에 저장하자
		for (int i = 0; i < n; i++) {
			ma[i]=sumCol(i);//ma[0],[1],[2] 에 sumCol결과값을 저장
			ma[i+n]=sumRow(i);//ma[3],[4],[5] 에 sumRow결과값을 저장
		}
		ma[n*2]=sumDia();//ma[6]에 저장
		ma[n*2+1]=sumReverseDia();//ma[7]에 저장
		
		System.out.println(Arrays.toString(ma));
		
		//다른 값이 있는지 확인하자
		for (int i = 1; i < ma.length; i++) {
			if(ma[0]!=ma[i]) {//0번째 값과 다음 값들을 비교해서 다른 값이 있는 지 확인
				isC=false;
				break;
			}
		}
		return isC;
	}
	
	public void magicPrint() {
		int n=magic.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println(sumCol(i));//가로의 합
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(sumRow(i)+"\t");
		}
		System.out.println("\n대각선의 합:"+sumDia()+","+sumReverseDia());
		System.out.println("마방진 확인:"+isCheck());
	}
}//class종료