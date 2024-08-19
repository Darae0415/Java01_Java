package ch08.sec09;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementClass impl = new ImplementClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		InterfaceB ib = impl;
		ib.methodB();
		InterfaceC ic = impl;
		ic.methodC();
		System.out.println();
		ia.methodA();
		ib.methodB();
	}

}
