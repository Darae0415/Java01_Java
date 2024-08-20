package ch09.sec05;

public class A {
	//바깥클래스 : 바깥클래스.this = 바깥객체;
	
	//인스턴스 필드
	String field = "A-field";
	
	//A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//C 정적 인스턴스 필드
	static String field2 = "A의 정적필드";
		
    //C 정적 인스턴스 메소드
	static void method2() {
	System.out.println("C-method");
	}
	
	//인스턴스 멤버 클래스
	class B{
		//B 인스턴스 필드
		String field = "B-field";
		
		//B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		//B 인스턴스 메소드2
		void print() {
			//B 객체의 필드와 메소드를 사용
			System.out.println(this.field);
			this.method();
			//A 객체의 필드와 메소드를 사용
			System.out.println(A.this.field);
			A.this.method();
		}
		
	}
	//
	void useB() {
		B b=new B();
		b.print();
	}
	
	static class C{
		static void method2() {
			field2 = "A정적필드 변경";
			A.method2();
		}
	}
}
