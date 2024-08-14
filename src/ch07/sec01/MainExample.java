package ch07.sec01;

public class MainExample  {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new PersianCat();
		//cat.meow();
		dog.sound();
		cat.sound();
		//MainExample클래스는 protected 된 plus사용금지
		//cat.plus(1,2);
		//JindoDog ddd = new JindoDog();

	}

}
