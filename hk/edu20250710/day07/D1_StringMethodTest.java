package hk.edu20250710.day07;

public class D1_StringMethodTest {

	//String 주요 메서드 연습
	
	//1.문자 하나를 반환
	// "문자열에서 문자하나를 인덱스로 추출하는 기능" --> "".chatAt(6)-> '문'
	//charAt(index)
	public String sTest01(String s,int idx) {
		char c=s.charAt(idx);
		String ss=c+"";//문자열을 만나면 문자열이 된다.
		String ss2=String.valueOf(c);//문자열로 변환시켜주는 메서드
		
		//예시) 숫자형태의 문자열을 숫자로 변환
		int i=Integer.parseInt("100");//"100" --> 100
		
		return ss;
	}
	
	//2.문자열에서 검색하려는 단어의 인덱스를 반환하는 기능: indexOf()
	// "ABCD" -> "BC" 검색 ->  "ABCD".indexOf("BC")
	// 반환값은??  해당 단어의 첫번째 인덱스를 반환
	// 종류: indexOf(), lastIndexOf() -->차이점: 앞에서부터, 뒤에서부터 검색
	//     0 1 2 3            3 2 1 0 X
	public void sTest2(String s) {//파라미터 -> "ABCDEF"
		int s1=s.indexOf("AB");//단어를 처음부터 검색
		int s2=s.indexOf("C",2);// 검색 시작 인덱스도 지정 가능
		int s3=s.indexOf("DE",2,5);
		int s4=s.lastIndexOf("F");
		
		System.out.printf("%d,%d,%d,%d\n",s1,s2,s3,s4);
		
		//해당 단어가 존재하는지 확인하는 용도
		//해당 단어가 없으면 -1을 반환한다.
		if(s.indexOf("A")!=-1) { // 문자열에서 해당 단어가 존재한다면..
			System.out.println("A가 존재합니다.");
		}
	}
	
	//3.문자열 길이 반환: length()
	public int sTest03(String s) {
		return s.length();
	}
	
	//4.문자열의 내용 변환 : replace("원본","새로운 내용")
	public void sTest04() {
		String s="자바프로그래밍자바웹개발자바스크립트";
		s.replace("자바", "java");//원본 s의 내용이 바뀌지 않는다 (immutable)
		s=s.replace("자바", "java");//다시 대입해야 된다.
		System.out.println(s);
	}
	
	//5.문자열을 추출하기: substring()
	//substring(idx): idx에서 부터 끝까지 추출
	//substring(sIdx,eIdx): 시작인덱스부터 종료인덱스-1까지 추출
	public void sTest5(String s) {
		String ss=s.substring(2);
		String ss2=s.substring(1, 3);
		System.out.println(ss+","+ss2);
	}
	
	//예제:
		//문자열에서 해당 검색어가 존재하는지 판단하여 존재한다면 해당 검색어를 추출하여
		//출력하고, "###"으로 변경하여 처리하고, 계속 검색어가 존재하는지 확인하여
		//앞에 작업을 진행한다.
		// 
		//1.해당 검색어가 존재하는 여부 판단해보기,해당검색어가 없으면 "검색어가 존재하지 않습니다."출력
		//2.해당 검색어의 인덱스를 구해보기: 검색어 인덱스 출력하기
		//3.해당 검색어를 추출해서 출력해보기: substring()을 사용해서 추출한뒤  출력하기
		//4.해당 검색어를 문자열에서 ###으로 바꿔주기
		//5.해당 검색어의 검색된 개수 출력하기[indexOf("검색어",검색시작인덱스)]
	
	public void search(String str) {//str = "카카오"
		String s="카카오페이가 소상공인 상생 캠페인 '오래오래 함께가게'의 올해 두 번째 팝업스토어를 여의도 IFC몰에 오픈했다고 10일 밝혔다.\r\n"
				+ "\r\n"
				+ "오래오래 함께가게는 카카오페이와 함께일하는재단이 소상공인의 지속가능한 사업 성장을 위해 지원하는 상생 캠페인이다.\r\n"
				+ "\r\n"
				+ "2023년부터 시작한 카카오래오래 함께가게는 지난 5월 올해 첫 팝업스토어를 현대백화점에서 2주간 운영했다. 리빙, 패션잡화, 식품, 친환경제품 등 254개 소상공인 브랜드가 23만여명의 방문객을 만날 수 있도록 지원해 왔다.";
		
		if(s.indexOf(str)!=-1) {// 존재한다면
			//존재할 경우 작업할 코드 작성
			int idx =0;
			int count=0;
			while(s.indexOf(str,idx)!=-1) {
			System.out.println(s.indexOf(str,idx));
			String ss=s.substring(s.indexOf(str,idx), s.indexOf(str,idx)+str.length());
			System.out.println(ss);
			//첫 글자 인덱스+글자길이=해당 단어 다음 인덱스를 구함
			idx=s.indexOf(str,idx)+str.length();//첫 글자 인덱스 + 글자길이 = 해당 단어 다음 인덱스를 구함
			count++;
			}
			s=s.replace(str, "###");
			System.out.println(s);
			System.out.println("검색된 검색어의 개수: "+count);
		}else {
			System.out.println("검색어가 존재하지 않습니다.");
		}
	
	}
	
}
