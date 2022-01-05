package koreait.day6;

public class GirlGroupTest {

	public static void main(String[] args) {
		// GirlGroup 클래스를 활용합니다.
		
		System.out.println("1.static 필드값 확인");    //static : 고정된, 고유한 상태
		System.out.println("성별 : " + GirlGroup.GENDER);
		
		System.out.println("2.객체 생성합니다.");
		GirlGroup brave = new GirlGroup();			//객체 생성 : 객체는 클래스의 인스턴스(복사본) 입니다.
		brave.year = 2011;
		brave.team_eng ="Brave Girls"; brave.team_kor="브레이브걸스";  brave.numbers=4;
		
		GirlGroup aespa = new GirlGroup();
		aespa.year=2020;
		aespa.team_eng="aespa";  aespa.team_kor="에스파";  aespa.numbers=4;
		
		//객체의 필드값 출력.-> infoPrint() 메소드
		brave.infoPrint();
		aespa.infoPrint();
		
		System.out.println("에스파 년차 : " + aespa.yearth(2022));
		System.out.println("브레이브걸스 년차 : " + brave.yearth(2022));
	}

}
