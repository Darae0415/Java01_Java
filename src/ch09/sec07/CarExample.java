package ch09.sec07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire(){
			@Override
			public void roll() {
				System.out.println("익명자식 3 타이어가 구릅니다");
			}
		});
	}

}
