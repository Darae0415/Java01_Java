package ch08.sec11.exam02;

public class Driver {
	private String name = "";
	public Driver(String name) {
		this.name = name;
	}
    void drive(Vehicle vehicle) {
//    	vehicle.run(this.name);
    	if(vehicle instanceof Bus) {
    		Bus bus = (Bus) vehicle;
    		bus.checkFare();
    	}
    }
}
