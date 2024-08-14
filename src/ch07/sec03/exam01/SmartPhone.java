package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	public SmartPhone(String model, String color) {
		super(); // 생략가능하며 컴파일될 시 자동 추가됨
		this.model=model;
		this.color=color;
		System.out.println("SmartPhone(String model, String color) 생성자가 실행됨");
		
	}
}
