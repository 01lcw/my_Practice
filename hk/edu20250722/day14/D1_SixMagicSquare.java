package hk.edu20250722.day14;

import java.util.Arrays;
import java.util.Iterator;

import hk.edu20250717.day11.D3_OddMagicSquare;

public class D1_SixMagicSquare extends D2_MagicSquare{
	
	public static void main(String[] args) {
		D1_SixMagicSquare magic = new D1_SixMagicSquare(10);
		magic.makeA();
		magic.makeB();
		magic.makeCD();
		magic.multi();
		magic.makeAdd();
		for (int i = 0; i < magic.magic.length; i++) {
			System.out.println(Arrays.toString(magic.magic[i]));
		}
	}
	public int [][] magic;
	public D1_SixMagicSquare() {
		super(6);
	}
	public D1_SixMagicSquare(int n) {
		super(n);
	}
	@Override
	public void make() {
		makeA();
		makeB();
		makeCD();
		multi();
		makeAdd();
	}
	
	//A영역에 n/4이 되는 영역을 3으로 채우는 기능	33
	//i인덱스가 n/4와 같아지는 지점에서는 j+1하자 ->33
	public void makeA() {
		int n=magic.length;
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n/4; j++) {
				if(i==n/4) { //i가 중간지점에 위치하면..
					magic[i][j+1]=3; //j+1하자
				}else {
					magic[i][j]=3;
				}
			}
		}
	}
	//B영역에 2로 채우는데 마지막 열만 1로 채우자
	//먼저 1로 다 채우고, 2로 채우자로 진행
	public void makeB() {
		int n = magic.length;
		//1을 먼저 B영역에 모두 채운다.
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n/2; j++) {
				magic[i][j+n/2]=1;
			}
		}
		//2로 채우자
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n/2-(n/4-1); j++) {
				magic[i][j+n/2]=2;
			}
		}
	}
	//A영역의 값을 --> C영역에 반대로 값을 넣기: 3->0, 0->3 변환
	public void makeCD() {
		int n = magic.length;
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n/2; j++) {
				//A영역에 접근해서 값을 출력
				System.out.println(magic[i][j]);
				if(magic[i][j]==3) {
					magic[i+n/2][j]=0; //c영역
					
				}else {
					magic[i+n/2][j]=3; //c영역
				}
				//B영역에 값 출력
//				System.out.print(magic[i][j+n/2]);
				if(magic[i][j+n/2]==2) {
//					System.out.println(i+","+(j+n/2));
					magic[i+n/2][j+n/2]=1; //D영역
				}else {
					magic[i+n/2][j+n/2]=2;
				}
			}
		}
	}
	// 각 영역에 값에, (n/2)*(n-2) 계산된 결과값을 각각 곱한다.
	public void multi() {
		int n= magic.length;
		int m=(n/2)*(n/2);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				magic[i][j] *= m;
			}
		}
	}
	
	//각각의 영역별로 홀수 마방진 값을 더하자
	public void makeAdd() {
		int n = magic.length;
		//홀수 마방진 ---> 구현한 적이 있다. 재활용 가능
		D3_OddMagicSquare odd = new D3_OddMagicSquare(n/2);
		odd.make(); //홀수 마방진 만들어짐
		int[][]oddMagic=odd.magic; //생성된 배열 가져오기
		
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n/2; j++) {
				magic[i][j]+=oddMagic[i][j];
				magic[i][j+n/2]+=oddMagic[i][j];
				magic[i+n/2][j]+=oddMagic[i][j];
				magic[i+n/2][j+n/2]=oddMagic[i][j];
			}
		}
		
	}
//	public void magicPrint() {
//		for (int i = 0; i < magic.length; i++) {
//			System.out.println(Arrays.toString(magic[i]));
//		}
//	}
}
