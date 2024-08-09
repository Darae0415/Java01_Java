package ch03.sec05;

public class InfinityAndNaNcCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 2.0;
		double z1 = x/y;
		double z2 = x%y;

		System.out.println(z1);   // 5를 2로 나누면 2.5 (double)
		System.out.println(z2);   
		// 5를 2로 나누고 남은 수는 (double)(5 % 2의배수 =...1)
		
		System.out.println(z1+10); // 2.5값에 +10을 더했으니 12.5
		System.out.println(z2+10); // 1.0값에 +10을 더했더니 11.0

		if(Double.isInfinite(z1)) { //
			System.out.print("z1 정상적인 값이 아닙니다.");
		} else {
			System.out.println(z1+10);			
		}
		
		if(Double.isNaN(z2)) {
			System.out.println("z2 정상적인 값이 아닙니다.");
		} else {
			System.out.println(z2+10);			
		}

	}

}
