package hk.edu20250715.day09;

public class D1_AntQuiz {
	
	//"11"-->"12"로 변환해 주는 메서드 구현
	// 11 --> 12 --> "11" -> "12" -> 12 1121 정수보다는 문자열이 적합
	public String antMake(String s) {
		//"11" -> 0번째와 다음에 오는 값을 비교해서 같으면 숫자를 올리고 
		//        값이 달라지는 상황이 오면 종료하고,
		// 	 	  다음 값 부터 다시 숫자를 1로 초기화 하고 올리자
		// 문자열에서 인덱스로 값을 가져오기
		char c = s.charAt(0); // 문자열의 0번째 값 구하기
		int count=1; // 연속된 숫자의 개수를 저장할 변수
		String t = ""; //t+'1'+2 = "12" -> t+c+count
		
		//문자열 만들기
		for (int i = 1; i < s.length(); i++) {
			if(c==s.charAt(i)) { //문자를 비교하자 앞문자==뒷문자
				count++;
			}else {
				t=t+c+count; // ""+'1'+2->"12"
				count=1;//1로 초기화
				c=s.charAt(i);//비교할 새로운 값을 저장
			}
		}
		t=t+c+count; //마지막에는 else 이하가 실행안되고 끝나기 때문에 
					 //for문이 끝나고 다시 작성해줘야 함
		return t;
	}
	
	//개미수열을 출력해주는 메서드 구현
	public void antPrint(int num) {
		//출력하는 코드 작성
		String s="1"; //결과값을 저장도 하지만 antMake에 전달도 함
		for (int i = 0; i < num; i++) {
			s=antMake(s);
			System.out.println(s);
		}
	}
}