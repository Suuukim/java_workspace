package koreait.day18;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// 예시 : StudentScore 객체가 파일에 저장되어있습니다. 하나의 문자열 "모모 90 88 79" 과 같은 형태입니다.
		//     -> 저장되어있는 문자열을 파일에서 읽기 하여 다시  StudentScore 객체로 생성한다면
		//	   -> 구분기호  공백을 기준으로 데이터를 분리(토큰화)합니다. -> StringTokenizer 클래스 메소드를 사용합니다.
		
		String temp = "모모 90 88 79";
		StringTokenizer stk = new StringTokenizer(temp);
		
		System.out.println("::nextToken메소드 결과 확인::");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		//stk 객체는 hasMoreTokens() 로 모든 토큰을 다 읽으면 더 이상 읽을 토큰이 없을 때 거짓이 되어서 반복 종료
		
		//  ↓  아래 이 코딩으로 토크나이저를 초기화 하는 것이 필요합니다. 
		stk = new StringTokenizer(temp);
		System.out.println("::: 객체로 만들어 봅니다. :::");
		while(stk.hasMoreTokens()) {
			StudentScore stu = new StudentScore(stk.nextToken(), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()), 
					Integer.parseInt(stk.nextToken()));
			System.out.println(stu);
		}

	}

}
