package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int [] selectNum = new int[6]; //6자리 빈란
//		System.out.println(Arrays.toString(selectNum));
		
		Random rd = new Random(2);
		System.out.println("선택번호");
		for(int i = 0; i<6; i++) {
			selectNum[i] = rd.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(selectNum));
		
		int [] winNum = new int[6];
		rd = new Random(5);
		System.out.println("당첨번호");
		
		for(int i = 0; i<6; i++) {
			winNum[i] = rd.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(winNum));
		
		Arrays.sort(selectNum);
		Arrays.sort(winNum);
		
		if(Arrays.equals(selectNum, winNum)) {
			System.out.println("복권 1층 당첨!");
		}else {
			System.out.println("꽝!");
		}
	}

}
