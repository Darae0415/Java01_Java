package ch04.sec03;

public class googoodanExample {

	public static void main(String[] args) {
		// for 문 1개만 사용해서 2단부터 9단까지 구구단만들기
		for(int i = 0; i< 64; i++ ) {
			int dan = (i/8) + 2;
			int n   = (i%8) + 2;
			System.out.printf(" %d * %d = %d\n", dan, n, dan*n);
		}
	}

}
