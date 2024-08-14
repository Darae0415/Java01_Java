package ch07.sec01;

public class Cat extends Animal {

	public Dog() {
//		super();
		System.out.println("개가 생성된다.");
		//super();
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println("짖는다");
		
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
		System.out.println("개가 멍멍한다.");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("개가 먹는다.");
//		Cat cat = new Cat();
//		cat.plus(0, 0);
	}
}
