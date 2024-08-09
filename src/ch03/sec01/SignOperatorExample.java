package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x=-100;
		x=-x;
		System.out.println("x: "+x);
		
		int b=50;
		int y=-b;
		System.out.println("y: "+y);
		System.out.printf("%d\n",x+y);
		System.out.printf("%d\n",x-y);
		System.out.printf("%d\n",x*y);
		System.out.printf("%d\n",x/y);
		System.out.printf("%d\n",x%y);

	}

}
