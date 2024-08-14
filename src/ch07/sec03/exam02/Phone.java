package ch07.sec03.exam02;

public class Phone {

	//필드를 선언
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자를 선언
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
		System.out.println("Phone(String model, String color)의 생성자를 실행");
	}
}
