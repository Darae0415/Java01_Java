package ch09.sec05;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.useB();
		
		A.C.method2();
	}

}
