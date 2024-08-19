package ch08.sec10;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		vehicle.run();
		((Bus)vehicle).checkFare();
		//Bus bus = (Bus)vehicle;
		//bus.checkFare();
		System.out.println();
		
		//taxi 목적지를 정하다
		vehicle = new Taxi();
		vehicle.run();
		((Taxi)vehicle).destination();
		System.out.println();
		
		//tank 대포쏜다.
		vehicle = new Tank(); //interface 가 하나면 캐스팅은 스킵가능
		vehicle.run();
		((Tank)vehicle).boom();
	}
} 



