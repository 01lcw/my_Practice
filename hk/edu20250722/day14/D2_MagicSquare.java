package hk.edu20250722.day14;

import java.util.Arrays;

//추상클래스
public abstract class D2_MagicSquare implements D2_IMagic{

	//부모클래스에서 사용하자: 2차원배열 선언
	protected int[][] magic;
	
	public D2_MagicSquare(int n) {
		this.magic=new int[n][n];
	}
	
	@Override
	public abstract void make();//추상메서드

	@Override
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

}