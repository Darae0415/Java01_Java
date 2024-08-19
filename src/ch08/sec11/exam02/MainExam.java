package ch08.sec11.exam02;

public class MainExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver("윤지현");
		Bus bus = new Bus();
		driver.drive(bus);
		
		driver = new Driver("강사");
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
