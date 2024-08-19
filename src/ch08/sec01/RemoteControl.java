package ch08.sec01;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 클래스 인터페이스가 public static abstract 등을 안적어줬을때
	// 클래스 : default 메소드
	// 인터페이스는 : public static 메소드
	// 인터페이스에서 디폴트는 명시적으로 작성되어야 한다.
	default void setMute(boolean mute) {
		if(mute) {
			setVolume(MIN_VOLUME);
			System.out.println("묵음처리 함");
		}else {
			System.out.println("묵음처리 해제함");
		}
	}
	
	static void changeBattery() {
		System.out.println("리모트 건전지를 교환합니다.");
	}
	
	public default void callParivateFunc() {
		privateFunc();
		System.out.println("안녕하세요");
	}
	public default void callPrivateStaticFunc() {
		privateStaticFunc();
		System.out.println("안녕히가세요");
	}
	
	private void privateFunc() {
		System.out.println("privateFunc 호출");
	}
	private static void privateStaticFunc() {
		System.out.println("privateStaticFunc 호출");
	}
}