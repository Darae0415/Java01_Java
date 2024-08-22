package ch13.sec01;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "연세IT학원";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 1234;
		int value = box2.content;
		System.out.println(value);

	}

}
