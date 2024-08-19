package ch08.sec11.exam02;

public class Bus implements Vehicle {

	@Override
	public void run(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"이 버스를 운전합니다.");
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}
