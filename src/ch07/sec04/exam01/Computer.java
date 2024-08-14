package ch07.sec04.exam01;

public class Computer extends Calculator {
	// 메소드 오버라이딩
	@Override //생략가능
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCirlce()를 실행");
		return Math.PI * r * r;
	}
}