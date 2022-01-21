package koreait.day17;

public interface RemoteControl {

	//public static final 생략
	int MAX_VOLUME=20;
	int MIN_VOLUME=0;
	
	//public abstract 생략
	void setVolume(int volume);
	void turnOnOff();  //toggle 기능으로 구현 합니다.
	
	//default : 인스턴스 메소드
	default void setMute(boolean mute) {  //toggle 기능으로 구현 가능합니다.
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	
	//static
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	
}
