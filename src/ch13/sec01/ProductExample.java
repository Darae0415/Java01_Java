package ch13.sec01;

public class ProductExample {

	public static void main(String[] args) {
		Product<Car,String> car1 = new Product<>();
		
		car1.setKind(new Car());
		car1.setModel("그랜저");
		
		System.out.printf("%s가 ",car1.getModel());
		
		car1.getKind().run();
		
//		Product<TV,String> tv = new Product<>();
	}

}
