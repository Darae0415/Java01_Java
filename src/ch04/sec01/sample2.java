package ch04.sec01;

import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.nextLine();
		int money =(int)(Math.random()*18)*1000;
		
		System.out.printf("%s님은 %d에 당첨되셨습니다.",name,money);
		scan.close();
	}
	
}
