package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int [] scores;
		scores = new int[] {83,90,87,70};
		int sum1 = sum(scores);
		System.out.println("총합: "+ sum1);
		printItem(scores);
		
	}
	public static int sum(int[] scores) {
		int sum1 = 0;
		for(int i= 0 ; i< scores.length; i++) {
			sum1 += scores[i];
		}
		return sum1;		
	}
	public static void printItem(int[] scores) {
		for(int i= 0 ; i< scores.length; i++) {
			System.out.printf("점수%d: %d\n", i, scores[i]);
		}
		
	}
}
