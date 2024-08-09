package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		int x=45;
		int y=25;
		System.out.printf("%d & %d = %d\n",x,y,x&y);
		System.out.printf("%x & %x = %x\n",x,y,x&y);
		System.out.println("--------------");
		System.out.printf("%d | %d = %d\n",x,y,x|y);
		System.out.printf("%x | %x = %x\n",x,y,x|y);
		System.out.println("--------------");
		System.out.printf("%d ^ %d = %d\n",x,y,x^y);
		System.out.printf("%x ^ %x = %x\n",x,y,x^y);
		System.out.println("--------------");
		System.out.printf("%d , %d\n",~x,~y);
		System.out.printf("%x , %x\n",~x,~y);
		System.out.println("--------------");

	}

}
