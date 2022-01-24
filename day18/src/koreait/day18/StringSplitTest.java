package koreait.day18;

public class StringSplitTest {
	//String 클래스의 split 메소드를 이용하여 StringTokenizer 동작을 연습합니다.
	
	public static void main(String[] args) {
		
		String temp = "모모 90 88 79";
		
		String[] result =temp.split(" ");		//메소드의 리턴타입은? String[] (문자열의 배열)
						//split : 구분기호를 기준으로 문자열을 쪼개어(나눈다.분리하다.) 배열로 참조시키도록 합니다.
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		
		for(String data : result)
			System.out.println(data);
		
		temp = "모모,90,88,79";
		result =temp.split(",");
		System.out.println("---- 구분기호 : , ----");
		for(String data : result)
			System.out.println(data);
		
		temp = "모모--90--88--79";
		result =temp.split("--");	//인자가 문자열이므로  문자열 형태로 해봅니다.
		System.out.println("---- 구분 문자열은 정규식 표현(앞으로 할 예정)으로 합니다.  ----");
		System.out.println("배열의 크기 : " + result.length);
		for(String data : result)
			System.out.println(data);
	}

}
