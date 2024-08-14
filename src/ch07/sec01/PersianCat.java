package ch07.sec01;

public class PersianCat extends Cat {

	@Override
	public void meow() {
		// TODO Auto-generated method stub
		super.meow();
	}
	

	@Override
	public final void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		int result = plus(3,4);
		System.out.printf("고양이가 %d번 야옹한다.\n", result);
	}

}
