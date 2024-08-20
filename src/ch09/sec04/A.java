package ch09.sec04;

public class A {
	//메소드
	void useB() {
		class B{
			//인스턴스 필드
			int field1 = 1;
			
			//정적 필드 
			static int field2 = 2;
			
			//기본 생성자
			B(){
				System.out.println("B클래스 생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B메소드1 실행");
			}
			//정적 메소드
			static void method2() {
				System.out.println("B Static 메소드2 실행");
		
			}
		}
	    //로컬 객체 생성(선언)
	    B b = new B();
	
	    //로컬 객체의 인스턴스 필드와 메소드를 사용
		System.out.println(b.field1);
		b.method1();
		
		//로컬 객체의 정적 인스턴스 필드와 정적 메소드를 사용
		System.out.println(B.field2);
		B.method2();
	
	}

}	
	
	

