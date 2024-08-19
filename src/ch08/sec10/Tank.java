package ch08.sec10;

public class Tank implements Vehicle {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("탱크가 달립니다.");
	}
	
	public void boom() {
		System.out.println("대포를 쏜다.");
	}

}
