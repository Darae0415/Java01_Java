package ch12.sec03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone myPhone1 = new SmartPhone("삼성전자","안드로이드");
		SmartPhone myPhone2 = new SmartPhone("애플","아이폰");
		
		String strobj1 = myPhone1.toString();
		String strobj2 = myPhone2.toString();
		
		System.out.println(myPhone1);
		System.out.println(myPhone2);
		System.out.println();
		
		System.out.println(strobj1);
		System.out.println(strobj2);
		
		

	}

}
