package ch04.sec03;

import java.util.Scanner;

public class KeyControlExample {



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int speed = 0;
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1:증속 2:감속 3:중지");
			System.out.println("-----------------------");
			System.out.print("선택 : ");
			
			String strInput = scanner.nextLine();
			if(strInput.equals("1")) {
				speed++;				
			} else if(strInput.equals("2")) {
				speed--;				
			} else if(strInput.equals("3")) {
				break;				
			}
			System.out.println("현재속도 : " +  speed);			
		}
		System.out.println("프로그램 종료");

	}

}
