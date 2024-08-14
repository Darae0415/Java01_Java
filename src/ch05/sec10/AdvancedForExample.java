package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {

		int[] scores= {80,70,90,80,100};
		
		int sum=0;
		for(int index : scores) {
			sum = sum+index;
		}
		System.out.println("총합:"+sum);
		double avg =(double)sum / scores.length;
		System.out.println("평균:"+avg);
	}

}
