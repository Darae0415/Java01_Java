package ch08.sec10;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("택시가 달립니다.");
	}
	public void destination() {
		System.out.println("목적지를 정했습니다.");
	}

}
