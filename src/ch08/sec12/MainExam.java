package ch08.sec12;

public class MainExam {

	public static void main(String[] args) {
		// 구현 객체를 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		}
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		
//			if(vehicle instanceof Bus bus) {
//				bus.checkFare();
//			}
		}
	

}
