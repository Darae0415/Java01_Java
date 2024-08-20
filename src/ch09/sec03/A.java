package ch09.sec03;

public class A {
	//정적 멤버 클래스
	static class B{
		//인스턴스 변수
		int field1 = 1;
		
		//정적변수
		static int field2 = 2;
		
		//기본 생성자
		B(){
			System.out.println("B클래스 생성자 실행");
		}
		
		//인스턴스 메소드
		void method1() {
			System.out.println("B메소드1 실행");
		}
		
		static void method2() {
			System.out.println("B Static 메소드2 실행");
	
		}
	}
	
	//인스턴스 필드값으로 B객체에 대입
	B field1 = new B();
	
	//정적 필드값으로 B객체에 대입
	static B field = new B();
	
	//생성자
	A(){
		B b = new B();
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	//정적 메소드
	static void method2() {
		B b = new B();
	}
}
