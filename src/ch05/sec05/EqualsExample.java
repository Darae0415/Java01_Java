package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = "길동";
		String name4 = "name1";
		String name5 = ("홍"+name3);
		
		System.out.println("name hashCode: "+System.identityHashCode(name1));
		System.out.println("name hashCode: "+System.identityHashCode(name2));
		System.out.println("name hashCode: "+System.identityHashCode(name3));
		System.out.println("name hashCode: "+System.identityHashCode(name4));

		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2);
		System.out.println(name1.equals("홍"+name3));
		System.out.println(name1 == name5);
		System.out.println(name1 == ("홍"+name3));
	}

}
