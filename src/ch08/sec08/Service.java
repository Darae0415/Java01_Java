package ch08.sec08;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	
	//private
	private void defaultCommon() {
		System.out.println("defaultMethod 종속 코드 A");
		System.out.println("defaultMethod 종속 코드 B");
	}
	
	//정적 메소드 (Static)
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() { //정적 메소드는 필히 static 을 써줘야 됨
		System.out.println("staticMethod 종속 코드 C");
		System.out.println("staticMethod 종속 코드 D");
	}
}
