package ch09.sec03;

public class AExample {

	public static void main(String[] args) {
		// B 객체를 생성(선언) 및 인스턴스 필드, 메소드 사용
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		// B클래스의 정적 필드와 정적 메소드 사용
		System.out.println(A.B.field2);
		A.B.method2();
	}

}
