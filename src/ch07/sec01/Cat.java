package ch07.sec01;

public class Cat extends Animal {
	
	public void meow() {
		System.out.println("야옹거린다.");
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		int result = plus(1,2);
		System.out.printf("고양이가 %d번 야옹한다.\n", result);
	}
	
	protected int plus(int a, int b) {
		return a+b;
	}

}