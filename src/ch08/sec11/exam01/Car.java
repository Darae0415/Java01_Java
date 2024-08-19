package ch08.sec11.exam01;

public class Car {
	Tire tireFront = new HankookTire();
	Tire tireBack = new HankookTire();
		
	void run() {
		tireFront.run();
		tireBack.run();
	}

}
